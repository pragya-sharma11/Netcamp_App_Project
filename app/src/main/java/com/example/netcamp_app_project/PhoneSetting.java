package com.example.netcamp_app_project;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.hardware.camera2.CameraManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PhoneSetting extends AppCompatActivity {
    ImageButton i1, i2, i3, i4;
    boolean blt = false, wifi = false, flash = false, vibrate = false;
    Button back;
    BluetoothAdapter b;
    WifiManager wf;
    CameraManager cm;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_setting);
        i1 = findViewById(R.id.settingBluetooth);
        i2 = findViewById(R.id.settingWifi);
        i3 = findViewById(R.id.settingTorch);
        i4 = findViewById(R.id.settingVibrate);
        back = findViewById(R.id.settingBack);
        b = BluetoothAdapter.getDefaultAdapter();
        wf = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        cm = (CameraManager) getApplicationContext().getSystemService(CAMERA_SERVICE);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!blt){
                    b.enable();
                }else{
                    b.disable();
                }
                blt = !blt;
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!wifi){
                    wf.setWifiEnabled(true);
                }else{
                    wf.setWifiEnabled(false);
                }
                wifi = !wifi;
            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PhoneSetting.this, Torch.class);
                startActivity(i);
                finish();
            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PhoneSetting.this, Vibrate.class);
                startActivity(i);
                finish();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PhoneSetting.this, PhoneScreen.class);
                startActivity(i);
                finish();
            }
        });
    }
}