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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RemediesPg extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_remedies_pg);

        RecyclerView recyclerView = findViewById(R.id.RemediesRecyclerview);

        List<RemediesItem> items = new ArrayList<RemediesItem>();
        items.add(new RemediesItem("Allergy"));
        items.add(new RemediesItem("Acidity"));
        items.add(new RemediesItem("Headache"));
        items.add(new RemediesItem("Malaria"));
        items.add(new RemediesItem("Hair fall"));
        items.add(new RemediesItem("Diabetes"));
        items.add(new RemediesItem("Dark circles"));
        items.add(new RemediesItem("Fever"));
        items.add(new RemediesItem("Dengue"));
        items.add(new RemediesItem("High blood pressure"));
        items.add(new RemediesItem("Toothache"));
        items.add(new RemediesItem("Cold and Cough"));
        items.add(new RemediesItem("Swine flu"));
        items.add(new RemediesItem("Insomnia"));
        items.add(new RemediesItem("Chicken pox"));
        items.add(new RemediesItem("Laziness"));
        items.add(new RemediesItem("Sunburn"));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RemediesMyAdapter(getApplicationContext(), items));


    }
}