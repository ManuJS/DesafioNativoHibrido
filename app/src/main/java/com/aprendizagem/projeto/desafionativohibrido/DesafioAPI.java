package com.aprendizagem.projeto.desafionativohibrido;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by jose on 11/03/17.
 */

public interface DesafioAPI {
    @POST("/hooks/catch/275658/mlzgvd/")
    Call<Resposta> enviar(@Body Dados dados);
}
