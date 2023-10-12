package com.example.mobilelearning;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobilelearning.Auth.Login;

@SuppressLint("CustomSplashScreen")
public class SplashScreen extends AppCompatActivity {

    private int loading = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent main = new Intent(SplashScreen.this, Login.class);
                startActivity(main);
                finish();

            }
        },loading);
    }
}
