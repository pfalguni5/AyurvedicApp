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

public class VattaPg extends AppCompatActivity {
    private Button Sympbutton, HealthIssbutton, AyuCurebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_vatta_pg);

        Button Sympbutton = findViewById(R.id.SympButton);
        Sympbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VattaPg.this, SymptomsPg.class);
                startActivity(intent);
            }
        });

        Button HealthIssbutton = findViewById(R.id.HealthIssuesButton);
        HealthIssbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VattaPg.this, HealthIssuesPg.class);
                startActivity(intent);
            }
        });

        Button AyuCurebutton = findViewById(R.id.AyuCureButton);
        AyuCurebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VattaPg.this, AyurvedaCurePg.class);
                startActivity(intent);
            }
        });


    }
}