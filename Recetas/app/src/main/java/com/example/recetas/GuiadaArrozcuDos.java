package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class GuiadaArrozcuDos extends AppCompatActivity {

    ImageButton imgbtnplay;
    private TextView lblArrozCubanaG;
    TTSManager ttsManager = null;

    private static final int RECOGNIZE_SPEECH_ACTIVITY = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guiada_arrozcu_dos);

        ttsManager = new TTSManager();
        ttsManager.init(this);
        lblArrozCubanaG = findViewById(R.id.lblArrozCubanaG);
        imgbtnplay = findViewById(R.id.imgbtnplay);

        imgbtnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = lblArrozCubanaG.getText().toString();
                ttsManager.initQueue(text);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ttsManager.shutDown();
    }

    public void oyente_imgbtnsigArrozCubana2 (View v){
        Intent i = new Intent(this, GuiadaArrozcuTres.class);
        startActivity(i);
    }
    public void oyente_imgbtnantArrozCubana2 (View v){
        Intent i = new Intent(this, GuiadaArrozcuUno.class);
        startActivity(i);
    }
}
