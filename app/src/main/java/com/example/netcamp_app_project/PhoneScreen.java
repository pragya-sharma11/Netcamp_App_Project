package com.example.netcamp_app_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PhoneScreen extends AppCompatActivity {
    ImageButton i1, i2, i3, i4, i5, i6, i7, i8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_screen);
        i1 = findViewById(R.id.imageButton1);
        i2 = findViewById(R.id.imageButton2);
        i3 = findViewById(R.id.imageButton3);
        i4 = findViewById(R.id.imageButton4);
        i5 = findViewById(R.id.imageButton5);
        i6 = findViewById(R.id.imageButton6);
        i7 = findViewById(R.id.imageButton7);
        i8 = findViewById(R.id.imageButton8);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}