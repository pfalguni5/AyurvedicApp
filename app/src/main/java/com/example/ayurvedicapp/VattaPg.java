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

import java.util.ArrayList;

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

        DBhelper dBhelper=new DBhelper(this);
        dBhelper.addData("In Ayurveda, Vata is one of the three doshas, or life energies, that make up a person's constitution. Vata is associated with air and space, and is said to control movement in the body and mind. Some characteristics of people with Vata dosha include:\n" +
                "\n" +
                "Physical characteristics\n" +
                "They may have a lean body type, dry skin and hair, and cold extremities. They may also be tall or short, and their veins and muscle tendons may be visible. \n" +
                "\n" +
                "Personality\n" +
                "They may be creative, energetic, and enthusiastic. They may also be spontaneous and sometimes spend money rashly. \n" +
                "\n" +
                "Health\n" +
                "They may be sensitive to cold weather, have circulation issues, and have joint pain. \n" +
                "\n" +
                "Movement\n" +
                "They may be always on the go. \n" +
                "\n" +
                "\n" +
                "\n");

    }
}