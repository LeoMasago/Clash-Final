package com.example.clashroyaleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Epicas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epicas);

        Button btnvoltar3 = findViewById(R.id.btnvoltar3);
        btnvoltar3.setOnClickListener(v -> {
            Intent main = new Intent(Epicas.this, MainActivity.class);
            startActivity(main);

        });
    }
}