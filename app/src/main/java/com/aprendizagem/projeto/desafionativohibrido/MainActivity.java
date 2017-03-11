package com.aprendizagem.projeto.desafionativohibrido;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_send;
    EditText ed_nome,ed_user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_send =(Button)findViewById(R.id.btn_send);
        ed_nome =(EditText)findViewById(R.id.edit_nome);
        ed_user =(EditText)findViewById(R.id.edit_user);

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validaDados();
            }
        });
    }

    public void validaDados () {
        if(!ed_nome.getText().equals("") && !ed_user.getText().equals("")) {
            //TODO -- chamar funcao da camera

        } else {
            Toast toast = Toast.makeText(this, "Infome o nome e seu usuário Twiter ...", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
            toast.show();

        }
    }
}
