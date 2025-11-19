package com.example.eletter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.eletter.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Sign_in_Eletter extends AppCompatActivity {

    EditText editID, editPassword;
    Button btnMasuk;
    ApiService api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_eletter);


        editID = findViewById(R.id.TextID);
        editPassword = findViewById(R.id.KataSandi);
        btnMasuk = findViewById(R.id.TombolMasuk);


        api = ApiClient.getClient().create(ApiService.class);


        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = editID.getText().toString().trim();
                String pass = editPassword.getText().toString().trim();

                if (id.isEmpty() || pass.isEmpty()) {
                    Toast.makeText(Sign_in_Eletter.this, "Isi semua field", Toast.LENGTH_SHORT).show();
                    return;
                }


                LoginRequest request = new LoginRequest(id, pass);

                api.loginUser(request).enqueue(new Callback<LoginResponse>() {
                    @Override
                    public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            LoginResponse loginRes = response.body();

                            if (loginRes.isSuccess()) {
                                Toast.makeText(Sign_in_Eletter.this, "Login Berhasil!", Toast.LENGTH_SHORT).show();

                                // TODO: pindah halaman lain di sini
                                // startActivity(new Intent(Sign_in_Eletter.this, MenuUtama.class));

                            } else {
                                Toast.makeText(Sign_in_Eletter.this, loginRes.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<LoginResponse> call, Throwable t) {
                        Toast.makeText(Sign_in_Eletter.this, "Gagal koneksi ke server: " + t.getMessage(), Toast.LENGTH_LONG).show();
                        Log.e("API ERROR", t.getMessage());
                    }
                });
            }
        });
    }
}
