package com.example.asus.sriwulandari_1202150268_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText user, pass;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        Login = findViewById(R.id.signin);

            }

    public void showLogin(View view) {
        if (user.getText().toString().equalsIgnoreCase("ead") && pass.getText().toString().equalsIgnoreCase("mobile")){
            Toast.makeText(this, "SELAMAT DATANG", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Username atau Password yang anda masukkan salah.....", Toast.LENGTH_LONG).show();
        }
    }
}
