package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class GuiadaHNormalDos extends AppCompatActivity {

    ImageButton imgbtnplay;
    private TextView lblHNormalG;
    TTSManager ttsManager = null;

    private static final int RECOGNIZE_SPEECH_ACTIVITY = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guiada_hnormal_dos);

        ttsManager = new TTSManager();
        ttsManager.init(this);
        lblHNormalG = findViewById(R.id.lblHNormalG);
        imgbtnplay = findViewById(R.id.imgbtnplay);

        imgbtnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = lblHNormalG.getText().toString();
                ttsManager.initQueue(text);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ttsManager.shutDown();
    }

    public void oyente_imgbtnsigHNormal2 (View v){
        Intent i = new Intent(this, GuiadaHNormalTres.class);
        startActivity(i);
    }
    public void oyente_imgbtnantHNormal2 (View v){
        Intent i = new Intent(this, GuiadaHNormalDos.class);
        startActivity(i);
    }
}
