package com.example.ayurvedicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomePg extends AppCompatActivity{
    private Button Vbutton, Pbutton, Kbutton, Remebutton, Herbsbutton, Yogbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_pg);

        Button Vbutton = findViewById(R.id.VattaButton);
        Vbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePg.this, VattaPg.class);
                startActivity(intent);
            }
        });

        Button Pbutton = findViewById(R.id.PittaButton);
        Pbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePg.this, PittaPg.class);
                startActivity(intent);
            }
        });

        Button Kbutton = findViewById(R.id.KaphaButton);
        Kbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePg.this, KaphaPg.class);
                startActivity(intent);
            }
        });

        Button Remebutton = findViewById(R.id.RemediesButton);
        Remebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePg.this, RemediesPg.class);
                startActivity(intent);
            }
        });

        Button Herbsbutton = findViewById(R.id.HerbsButton);
        Herbsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePg.this, HerbsPg.class);
                startActivity(intent);
            }
        });

        Button Yogbutton = findViewById(R.id.YogaButton);
        Yogbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePg.this, YogaPg.class);
                startActivity(intent);
            }
        });

    }
}