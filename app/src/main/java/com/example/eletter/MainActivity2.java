package com.example.eletter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.btnSiswa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siswa = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(siswa);
            }
        });


        findViewById(R.id.btnGuru).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent guru = new Intent(MainActivity2.this, Sign_in_Eletter.class);
                startActivity(guru);
            }
        });

    }
}
