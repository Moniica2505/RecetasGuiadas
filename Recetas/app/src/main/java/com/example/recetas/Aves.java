package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Aves extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aves);
    }

    public void oyente_polloPlancha (View v){
        Intent i = new Intent(this, PechugaPlancha.class);
        startActivity(i);
    }
}
