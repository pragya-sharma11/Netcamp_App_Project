package com.example.netcamp_app_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Music extends AppCompatActivity {
    ImageButton i;
    Boolean music = false;
    MediaPlayer mp;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        i = findViewById(R.id.musicButton);
        mp = MediaPlayer.create(this, R.raw.y);
        b = findViewById(R.id.musicBack);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!music){
                    mp.start();
                }else{
                    mp.pause();
                }
                music = !music;
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Music.this, PhoneScreen.class);
                startActivity(i);
                finish();
            }
        });
    }
}