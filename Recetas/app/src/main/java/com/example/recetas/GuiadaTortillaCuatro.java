package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class GuiadaTortillaCuatro extends AppCompatActivity {

    ImageButton imgbtnplay;
    private TextView lblTortilla;
    TTSManager ttsManager = null;

    private static final int RECOGNIZE_SPEECH_ACTIVITY = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guiada_tortilla_cuatro);

        ttsManager = new TTSManager();
        ttsManager.init(this);
        lblTortilla = findViewById(R.id.lblTortilla);
        imgbtnplay = findViewById(R.id.imgbtnplay);

        imgbtnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = lblTortilla.getText().toString();
                ttsManager.initQueue(text);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ttsManager.shutDown();
    }

    public void oyente_imgbtnsig4 (View v){
        Intent i = new Intent(this, GuiadaTortillaCinco.class);
        startActivity(i);
    }

    public void oyente_imgbtnant4 (View v){
        Intent i = new Intent(this, GuiadaTortillaTres.class);
        startActivity(i);
    }
}
