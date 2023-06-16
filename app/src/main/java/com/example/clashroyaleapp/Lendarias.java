package com.example.clashroyaleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Lendarias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lendarias);

        Button btnvoltar4 = findViewById(R.id.btnvoltar4);
        btnvoltar4.setOnClickListener(v -> {
            Intent main = new Intent(Lendarias.this, MainActivity.class);
            startActivity(main);

        });

    }
}