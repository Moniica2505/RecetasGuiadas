package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Huevos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huevos);
    }
    public void oyente_tortilla (View v){
        Intent i = new Intent (this, TortillaDePatatas.class);
        startActivity(i);
    }

    public void oyente_HCocicos (View v){
        Intent i = new Intent(this, HuevosCocidos.class);
        startActivity(i);
    }
}
