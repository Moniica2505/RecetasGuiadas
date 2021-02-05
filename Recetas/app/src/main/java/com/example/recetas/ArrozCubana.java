package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ArrozCubana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arroz_cubana);
    }
    public void oyente_guiadaArrozCubana (View v){
        Intent i = new Intent (this, GuiadaArrozcuUno.class);
        startActivity(i);
    }
}
