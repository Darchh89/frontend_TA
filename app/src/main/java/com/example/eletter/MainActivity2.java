package com.example.eletter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private Intent daftarguru;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        findViewById(R.id.btnSiswa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siswa = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(daftarguru);
            }
        });


        // Tombol Guru
        findViewById(R.id.btnGuru).setOnClickListener(v -> {
            Intent guru = new Intent(MainActivity2.this, Sign_in_Eletter.class);
            startActivity(guru);
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
