package com.example.ayurvedicapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ayurvedicapp.R;

public class RemediesMyViewHolder extends RecyclerView.ViewHolder {

    TextView nameView;

    public RemediesMyViewHolder(@NonNull View itemView) {
        super(itemView);

        nameView = itemView.findViewById(R.id.RemediesName);
    }
}