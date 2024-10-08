package com.example.ayurvedicapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class SymptomsPg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_symptoms_pg);
        ListView listViewSymptoms;
        DBhelper dbHelper;
        listViewSymptoms = findViewById(R.id.listViewSymptoms);
        dbHelper = new DBhelper(this);

        // Fetching and displaying data
        ArrayList<String> symptomsList = new ArrayList<>();
        ArrayList<Symptomodel> arrSym = dbHelper.fetchdata();

        // Loop through the fetched data and add symptoms to the ArrayList
        for (Symptomodel model : arrSym) {
            symptomsList.add(model.Symptom);
        }

        // Set the data into the ListView using an ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, symptomsList);
        listViewSymptoms.setAdapter(adapter);
    }
}