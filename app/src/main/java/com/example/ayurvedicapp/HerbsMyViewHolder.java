package com.example.ayurvedicapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HerbsMyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView nameView;

    public HerbsMyViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView=itemView.findViewById(R.id.HerbsImageView);
        nameView=itemView.findViewById(R.id.HerbsName);
    }
}
