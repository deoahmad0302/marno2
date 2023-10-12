package com.example.mobilelearning.fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.mobilelearning.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class activity_fragment extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    private Fragment fragment;
    private FragmentManager fragmentManager;
    private AppCompatButton btnmateri, btnTugas,btnKursus,btnEvaluasi;
    @SuppressLint("MissingInflatedId")
    protected void OnCreate(Bundle SavenInstanceState){
        super.onCreate(SavenInstanceState);
        setContentView(R.layout.activity_fragment);
        btnmateri = findViewById(R.id.materi);
        btnEvaluasi = findViewById(R.id.evaluasi);
        btnKursus = findViewById(R.id.kursus);
        btnTugas = findViewById(R.id.tugas);

        btnmateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activity_fragment.this, materi.class));
            }
        });
        btnTugas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activity_fragment.this, tugas.class));
            }
        });

        btnKursus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activity_fragment.this, kursus.class));
            }
        });

        btnEvaluasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activity_fragment.this, evaluasi.class));
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.framelayout, new home()).commit();

        BottomNavigationView bottomNavigationView = findViewById(R.id.btn_navigasi);
      bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener(){
          @Override
          public void onNavigationItemReselected(@NonNull MenuItem item) {

          }

          public boolean onNavigationItemSelected(@NonNull MenuItem item){
              switch (item.getItemId()){
                  case R.id.home:
                      fragment=new home();
                      break;
                  case R.id.materi:
                      fragment= new kursus();
                      break;
                  case R.id.tugas:
                      fragment=new tugas();
                      break;
                  case R.id.evaluasi:
                      fragment = new evaluasi();
                      break;
                  case R.id.setting:
                      fragment= new materi();
                      break;

              }
              final FragmentTransaction transaction = fragmentManager.beginTransaction();
              transaction.replace(R.id.framelayout, fragment).commit();
              return true;
          }
      });

    }
}