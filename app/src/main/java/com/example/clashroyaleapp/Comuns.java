package com.example.clashroyaleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Comuns extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comuns);
        Button btnvoltar2 = findViewById(R.id.btnvoltar2);
        btnvoltar2.setOnClickListener(v -> {
            Intent main = new Intent(Comuns.this, MainActivity.class);
            startActivity(main);

        });
    }
}