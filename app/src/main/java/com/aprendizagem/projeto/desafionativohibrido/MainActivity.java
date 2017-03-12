package com.aprendizagem.projeto.desafionativohibrido;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    static final int REQUEST_IMAGE_CAPTURE = 1;
    Button btn_send;
    EditText ed_nome,ed_user;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_send =(Button)findViewById(R.id.btn_send);
        ed_nome =(EditText)findViewById(R.id.edit_nome);
        ed_user =(EditText)findViewById(R.id.edit_user);
        image = (ImageView) findViewById(R.id.photo);

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validaDados();
            }
        });
    }

    public void validaDados () {
        if(isEmpty(ed_nome) && isEmpty(ed_user)) {
            sendMessage("ATENÇÂO ! Infome o nome e seu usuário Twiter.");

        } else {
            sendMessage("Chamando a camera ...");
            dispatchTakePictureIntent();

        }
    }

    private void dispatchTakePictureIntent() {
        Intent pictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (pictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(pictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            image.setImageBitmap(imageBitmap);
        }
    }


    private void sendMessage(String mesage) {
        Toast toast = Toast.makeText(this, mesage, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
    }

    private boolean isEmpty(EditText editText) {
        return editText.getText().toString().trim().length() == 0;
    }

}
