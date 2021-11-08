package com.example.netcamp_app_project;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bluetooth extends AppCompatActivity {
    Button b1, b2;
    BluetoothAdapter b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);
        b1 = findViewById(R.id.BluetoothOn);
        b2 = findViewById(R.id.BluetoothOff);
        b = BluetoothAdapter.getDefaultAdapter();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.enable();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.disable();
            }
        });
    }
}