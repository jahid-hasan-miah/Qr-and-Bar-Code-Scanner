package com.example.qrscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.qrscanner.Adapter.scan_qr;

public class MainActivity extends AppCompatActivity {

    public static TextView res;
    ImageButton qr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res = (TextView) findViewById(R.id.result_sc);
        qr = findViewById(R.id.scan);

        qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), scan_qr.class));

            }
        });


    }
}
