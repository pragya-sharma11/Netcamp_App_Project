package com.example.netcamp_app_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hbb20.CountryCodePicker;

public class PhoneSignIn extends AppCompatActivity {
    Button b1, b2, b3;
    EditText e1;
    CountryCodePicker ccp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_sign_in);
        e1 = findViewById(R.id.editText3);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button5);
        b3 = findViewById(R.id.button6);
        ccp = findViewById(R.id.ccp);
        ccp.registerCarrierNumberEditText(e1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PhoneSignIn.this, PhoneOTP.class);
                i.putExtra("phone",ccp.getFullNumberWithPlus().trim());
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PhoneSignIn.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}