package com.example.clashroyaleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;


public class Cartas extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartas);
        Button btnvoltar1 = findViewById(R.id.btnvoltar1);
        btnvoltar1.setOnClickListener(v -> {
            Intent main = new Intent(Cartas.this, MainActivity.class);
            startActivity(main);

        });
    }


}