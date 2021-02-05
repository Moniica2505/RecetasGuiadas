package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Hamburguesas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamburguesas);
    }

    public void oyente_HNormal(View v){
        Intent i = new Intent(this, HamburguesaNormal.class);
        startActivity(i);
    }
}
