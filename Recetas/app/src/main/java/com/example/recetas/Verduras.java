package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Verduras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verduras);
    }
    public void oyente_crema_de_puerro (View v){
        Intent i = new Intent(this, CremaDePuerro.class);
        startActivity(i);
    }
}
