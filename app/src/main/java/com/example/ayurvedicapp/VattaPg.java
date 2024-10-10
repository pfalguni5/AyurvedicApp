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
        String vataSymptomData= "An element in the body which is responsible for any sort of movement is called as ‘Vata dosh’. Vata has special importance among Tridoshas.\nIn the human boy, Pitta, Kapha, tissues and wastes are handicapped for doing their activities independently. Each and every action needs the stimulation of Vata dosh. We can observe the same thing in nature. Movements of clouds, sea waves, shifting of sands, movement of tree leaves and even earthquake are all due to principle of population.\n\nVata nirukti\n“Ta” is a suffix to “Va”. “Va” word is concerned with movement (gati) and enthusiasm (gadhan) so, the movement, needed for union and separation is carried by Vata dosh.\n\nStructute of Vata dosh\nVata dosh is invisible, but can be experienced from its functions. It does not posses physical measurements like length, breadth, height but the activities of Vata can be seen. Vata can be compared with electrical energy. We cannot see the electricity but we can experience";

        if (!dBhelper.isDataExists(vataSymptomData)) {
            dBhelper.addData(vataSymptomData);
        }
        //hdfsghsshd


    }
}