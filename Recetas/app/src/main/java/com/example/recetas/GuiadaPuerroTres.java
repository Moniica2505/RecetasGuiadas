package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class GuiadaPuerroTres extends AppCompatActivity {

    ImageButton imgbtnplay;
    private TextView lblCPuerro;
    TTSManager ttsManager = null;

    private static final int RECOGNIZE_SPEECH_ACTIVITY = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guiada_puerro_tres);

        ttsManager = new TTSManager();
        ttsManager.init(this);
        lblCPuerro = findViewById(R.id.lblCPuerro);
        imgbtnplay = findViewById(R.id.imgbtnplay);

        imgbtnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = lblCPuerro.getText().toString();
                ttsManager.initQueue(text);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ttsManager.shutDown();
    }

    public void oyente_imgbtnantCPuerro3 (View v){
        Intent i = new Intent(this, GuiadaPuerroDos.class);
        startActivity(i);
    }

    public void oyente_imgbtnsigCPuerro3 (View v){
        Intent i = new Intent(this, GuiadaPuerroCuatro.class);
        startActivity(i);
    }

}
