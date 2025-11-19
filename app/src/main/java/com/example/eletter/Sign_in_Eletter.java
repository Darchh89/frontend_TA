package com.example.eletter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Sign_in_Eletter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_eletter);

        // Tombol Masuk
        Button btnMasuk = findViewById(R.id.button7);
        btnMasuk.setOnClickListener(v -> {
            Intent i = new Intent(Sign_in_Eletter.this, MainActivity3.class);
            startActivity(i);
        });

        // 🔥 Text "Daftar" → pindah ke activity__daftarguru
        TextView daftar = findViewById(R.id.textView17);
        daftar.setOnClickListener(v -> {
            Intent intent = new Intent(Sign_in_Eletter.this, daftarguru.class);
            startActivity(intent);
        });
    }
}
