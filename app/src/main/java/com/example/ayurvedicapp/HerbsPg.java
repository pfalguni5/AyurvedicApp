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

public class HerbsPg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_herbs_pg);

        RecyclerView recyclerView = findViewById(R.id.HerbsRecyclerView);

        List<HerbsItem> items =new ArrayList<HerbsItem>();
        items.add(new HerbsItem(R.drawable.saffron, "Saffron"));
        items.add(new HerbsItem(R.drawable.turmeric, "Turmeric"));
        items.add(new HerbsItem(R.drawable.ginger, "Ginger"));
        items.add(new HerbsItem(R.drawable.cumin, "Cumin"));
        items.add(new HerbsItem(R.drawable.tulsi, "Tulsi"));
        items.add(new HerbsItem(R.drawable.neem, "Neem"));
        items.add(new HerbsItem(R.drawable.aloevera, "Aloe Vera"));
        items.add(new HerbsItem(R.drawable.sandalwood, "Sandalwood"));
        items.add(new HerbsItem(R.drawable.amla, "Amla"));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new HerbsMyAdapter(getApplicationContext(),items));

    }
}