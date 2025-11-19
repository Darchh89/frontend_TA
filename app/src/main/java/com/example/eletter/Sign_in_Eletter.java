package com.example.eletter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Sign_in_Eletter extends AppCompatActivity {
    private Retrofit retrofit;
    private RetrofitInterface retrofitInterface;
    private String BASE_URL = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_eletter);
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        retrofitInterface = retrofit.create(RetrofitInterface.class);

        Button TombolMasuk = findViewById(R.id.TombolMasuk);
        EditText IdEdit = findViewById(R.id.TextID);
        EditText SandiEDIT = findViewById(R.id.KataSandi);
        
        TombolMasuk.setOnClickListener(v -> {
            Intent i = new Intent(Sign_in_Eletter.this, MainActivity3.class);
            startActivity(i);
        });


        TextView daftar = findViewById(R.id.textView17);
        daftar.setOnClickListener(v -> {
            Intent intent = new Intent(Sign_in_Eletter.this, daftarguru.class);
            startActivity(intent);
        });
    }
}
