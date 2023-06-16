package com.example.clashroyaleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import  android.content.Intent;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btncartas = findViewById(R.id.btncartas);
        btncartas.setOnClickListener(v -> {Intent cartas=new Intent(MainActivity.this,Cartas.class);
        startActivity(cartas);
    });
        Button btncomuns = findViewById(R.id.btncomuns);
        btncomuns.setOnClickListener(v -> {
            Intent comuns = new Intent(MainActivity.this, Comuns.class);
            startActivity(comuns);
        });

        Button btnepica = findViewById(R.id.btnepicas);
        btnepica.setOnClickListener(v -> {
            Intent epica = new Intent(MainActivity.this, Epicas.class);
            startActivity(epica);
        });

        Button btnlendarias = findViewById(R.id.btnlendarias);
        btnlendarias.setOnClickListener(v -> {
            Intent lendaria = new Intent(MainActivity.this, Lendarias.class);
            startActivity(lendaria);
        });

        Button btnjogo = findViewById(R.id.btnjogo);
        btnjogo.setOnClickListener(v -> {

            Uri jogo = Uri.parse("https://play.google.com/store/apps/details?id=com.supercell.clashroyale&hl=pt_BR&gl=US");
            Intent it = new Intent(Intent.ACTION_VIEW, jogo);
            startActivity(it);
        });

        Button btnvideo = findViewById(R.id.btnvideo);
        btnvideo.setOnClickListener(v -> {

            Uri video = Uri.parse("https://www.youtube.com/watch?v=1RC1yxqTTd8");
            Intent it = new Intent(Intent.ACTION_VIEW, video);
            startActivity(it);
        });

        Button btnsite = findViewById(R.id.btnsite);
        btnsite.setOnClickListener(v -> {

            Uri site = Uri.parse("https://supercell.com/en/");
            Intent it = new Intent(Intent.ACTION_VIEW, site);
            startActivity(it);
        });

    }
}