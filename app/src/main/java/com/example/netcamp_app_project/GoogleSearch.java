package com.example.netcamp_app_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class GoogleSearch extends AppCompatActivity {
    ImageButton i1;
    EditText e1;
    WebView w1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_search);
        i1 = findViewById(R.id.search_button);
        e1 = findViewById(R.id.searchtext);
        w1 = findViewById(R.id.searchWebView);
        b1 = findViewById(R.id.serachBack);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString();
                w1.loadUrl(s1);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GoogleSearch.this, PhoneScreen.class);
                startActivity(i);
                finish();
            }
        });
    }
}