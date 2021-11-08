package com.example.netcamp_app_project;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.Button;

public class Wifi extends AppCompatActivity {
    Button b1, b2;
    WifiManager wf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi);
        b1 = findViewById(R.id.wifiOn);
        b2 = findViewById(R.id.wifiOff);
        wf = (WifiManager) getSystemService(WIFI_SERVICE);

    }
}