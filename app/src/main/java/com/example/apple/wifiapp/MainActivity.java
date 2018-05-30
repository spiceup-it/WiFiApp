package com.example.apple.wifiapp;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton;
    TextView textView;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton =  findViewById(R.id.toggleButton);
        textView =  findViewById(R.id.text_view);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                if (checked) {
                    textView.setText("WiFi is ON");
                    WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                    wifi.setWifiEnabled(true);
                } else {
                    textView.setText("WiFi is OFF");
                    WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                    wifi.setWifiEnabled(false);
                }
            }
        });

        if (toggleButton.isChecked()) {
            textView.setText("WiFi is ON");
            WifiManager wifi = (WifiManager)getApplicationContext(). getSystemService(Context.WIFI_SERVICE);
            wifi.setWifiEnabled(true);
        } else {
            textView.setText("WiFi is OFF");
            WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
            wifi.setWifiEnabled(false);
        }

    }
}
