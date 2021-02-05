package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PechugaPlancha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pechuga_plancha);
    }

    public void oyente_guiadaPPollo (View v){
        Intent i = new Intent (this, Guiada_pplancha.class);
        startActivity(i);
    }
}
