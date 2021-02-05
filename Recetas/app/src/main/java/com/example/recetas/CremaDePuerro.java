package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CremaDePuerro extends AppCompatActivity {

    private Button btnRecetaGuiada;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crema_de_puerro);

        btnRecetaGuiada = findViewById(R.id.btnRecetaGuiada);
    }


    public void oyente_guiadaPuerro (View v){
        Intent i = new Intent (this, GuiadaPuerroUno.class);
        startActivity(i);
    }
}
