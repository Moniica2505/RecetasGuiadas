package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class GuiadaHCocidos2 extends AppCompatActivity {

    ImageButton imgbtnplay;
    private TextView lblHCocidosG;
    TTSManager ttsManager = null;

    private static final int RECOGNIZE_SPEECH_ACTIVITY = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guiada_hcocidos2);

        ttsManager = new TTSManager();
        ttsManager.init(this);
        lblHCocidosG = findViewById(R.id.lblHCocidosG);
        imgbtnplay = findViewById(R.id.imgbtnplay);

        imgbtnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = lblHCocidosG.getText().toString();
                ttsManager.initQueue(text);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ttsManager.shutDown();
    }

    public void oyente_imgbtnantHCocidos2 (View v){
        Intent i = new Intent(this, GuiadaHCocidos1.class);
        startActivity(i);
    }
}
