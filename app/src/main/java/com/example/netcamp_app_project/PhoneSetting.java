package com.example.netcamp_app_project;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PhoneSetting extends AppCompatActivity {
    ImageButton i1, i2, i3, i4;
    boolean blt = false, wifi = false, torch = false, vibrate = false;
    Button back;
    BluetoothAdapter bluetoothAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_setting);
        i1 = findViewById(R.id.settingBluetooth);
        i2 = findViewById(R.id.settingWifi);
        i3 = findViewById(R.id.settingTorch);
        i4 = findViewById(R.id.settingVibrate);
        back = findViewById(R.id.settingBack);
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!blt){
                    bluetoothAdapter.enable();
                }else{
                    bluetoothAdapter.disable();
                }
                blt = !blt;
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

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}