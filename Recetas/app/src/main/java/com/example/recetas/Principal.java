package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void oyente_tortilla (View v){
        Intent i = new Intent (this, TortillaDePatatas.class);
        startActivity(i);
    }

    public void oyente_crema_de_puerro (View v){
        Intent i = new Intent(this, CremaDePuerro.class);
        startActivity(i);
    }

    public void oyente_arroces_pastas (View v){
        Intent i = new Intent(this, ArrocesPastas.class);
        startActivity(i);
    }
    public void oyente_aves (View v){
        Intent i = new Intent(this, Aves.class);
        startActivity(i);
    }
    public void oyente_hamburguesas (View v){
        Intent i = new Intent(this, Hamburguesas.class);
        startActivity(i);
    }
    public void oyente_huevos (View v){
        Intent i = new Intent(this, Huevos.class);
        startActivity(i);
    }
    public void oyente_pescados (View v){
        Intent i = new Intent(this, Pescados.class);
        startActivity(i);
    }
    public void oyente_verduras (View v){
        Intent i = new Intent(this, Verduras.class);
        startActivity(i);
    }
}
