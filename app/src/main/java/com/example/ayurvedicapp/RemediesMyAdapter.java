package com.example.ayurvedicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RemediesMyAdapter extends RecyclerView.Adapter<RemediesMyViewHolder> {

    Context context;
    List<RemediesItem> items;

    public RemediesMyAdapter(Context context, List<RemediesItem> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public RemediesMyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RemediesMyViewHolder(LayoutInflater.from(context).inflate(R.layout.remedies_item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RemediesMyViewHolder holder, int position) {
        holder.nameView.setText(items.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
