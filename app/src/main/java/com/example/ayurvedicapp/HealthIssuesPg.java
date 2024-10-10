package com.example.ayurvedicapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HealthIssuesPg extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_health_issues_pg);
        ListView listViewhel;
        DBhelper dbHelperhel;
        listViewhel = findViewById(R.id.viewHealth);

        //noinspection resource
        dbHelperhel = new DBhelper(this);

        // Fetching and displaying data
        ArrayList<String> healthissueList = new ArrayList<>();
        ArrayList<Symptomodel> arrSymhel = dbHelperhel.fetchdatahel();

        // Loop through the fetched data and add symptoms to the ArrayList
        for (Symptomodel model : arrSymhel) {
            healthissueList.add(model.Health);
        }

        // Set the data into the ListView using an ArrayAdapter
        ArrayAdapter<String> adapterhel = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, healthissueList);
        listViewhel.setAdapter(adapterhel);
    }
}