package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ArrocesPastas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arroces_pastas);
    }

    public void oyente_ArrozCubana (View v){
        Intent i = new Intent (this, ArrozCubana.class);
        startActivity(i);
    }
}
