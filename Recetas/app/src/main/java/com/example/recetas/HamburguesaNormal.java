package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HamburguesaNormal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamburguesa_normal);
    }

    public void oyente_guiadaHNormal (View v){
        Intent i = new Intent(this, GuiadaHNormalUno.class);
        startActivity(i);
    }
}
