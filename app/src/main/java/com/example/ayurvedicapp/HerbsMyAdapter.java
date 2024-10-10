package com.example.ayurvedicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HerbsMyAdapter extends RecyclerView.Adapter<HerbsMyViewHolder> {

    Context context;
    List<HerbsItem> items;

    public HerbsMyAdapter(Context context, List<HerbsItem> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public HerbsMyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HerbsMyViewHolder(LayoutInflater.from(context).inflate(R.layout.herbs_item_view,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull HerbsMyViewHolder holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.imageView.setImageResource(items.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    //hifk
}
