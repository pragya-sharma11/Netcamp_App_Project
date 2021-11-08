package com.example.netcamp_app_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity {
    VideoView v;
    MediaController m;
    Button b;
    Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video1);
        v = findViewById(R.id.videoview);
        m = new MediaController(this);
        b = findViewById(R.id.VideoBack);
        uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.a);
        v.setVideoURI(uri);
        v.start();
        v.stopPlayback();
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Video.this, PhoneScreen.class);
                startActivity(i);
                finish();
            }
        });
    }
}