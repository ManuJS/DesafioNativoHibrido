package com.aprendizagem.projeto.desafionativohibrido;

import java.util.Observable;
import java.util.Observer;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jose on 11/03/17.
 */

public class DesafioGetter extends Observable{
    private Retrofit retrofit;
    private DesafioAPI api;
    public DesafioGetter(Observer o){
        this.addObserver(o);
        this.retrofit = new Retrofit.Builder()
                .baseUrl("https://hooks.zapier.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        this.api = this.retrofit.create(DesafioAPI.class);
    }

    public void enviar(Dados dados){
        Callback<Resposta> res = new Callback<Resposta>() {
            @Override
            public void onResponse(Call<Resposta> call, Response<Resposta> response) {
                setChanged();
                notifyObservers(response.body());
            }

            @Override
            public void onFailure(Call<Resposta> call, Throwable t) {
                setChanged();
                notifyObservers(t);
            }
        };
        this.api.enviar(dados).enqueue(res);
    }
}
