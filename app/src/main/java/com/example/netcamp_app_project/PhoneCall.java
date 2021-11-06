package com.example.netcamp_app_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class PhoneCall extends AppCompatActivity {
    EditText e1;
    ImageButton i1;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_call);
        e1 = findViewById(R.id.PhoneCallEditText);
        i1 = findViewById(R.id.phonebutton);
        b = findViewById(R.id.phoneBack);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PhoneCall.this, PhoneScreen.class);
                startActivity(i);
                finish();
            }
        });
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString();
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:"+s1));
                startActivity(i);
            }
        });
    }
}