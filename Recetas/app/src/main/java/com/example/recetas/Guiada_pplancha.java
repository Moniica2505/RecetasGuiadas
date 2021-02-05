package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Guiada_pplancha extends AppCompatActivity {

    ImageButton imgbtnplay;
    private TextView lblPolloPlanchaG;
    TTSManager ttsManager = null;

    private static final int RECOGNIZE_SPEECH_ACTIVITY = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guiada_pplancha);

        ttsManager = new TTSManager();
        ttsManager.init(this);
        lblPolloPlanchaG = findViewById(R.id.lblPolloPlanchaG);
        imgbtnplay = findViewById(R.id.imgbtnplay);

        imgbtnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = lblPolloPlanchaG.getText().toString();
                ttsManager.initQueue(text);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ttsManager.shutDown();
    }
}
