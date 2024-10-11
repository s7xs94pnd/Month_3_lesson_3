package com.example.month_3_lesson_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BikesAdapter extends RecyclerView.Adapter<BikesViewHolder>
{
    private  LayoutInflater inflater;
    private  ArrayList <Gen_cl> bikes,staff;

    public BikesAdapter(LayoutInflater inflater, ArrayList<Gen_cl> bikes) {
        this.inflater = inflater;
        this.bikes = bikes;
    }

    @NonNull
    @Override
    public BikesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_bikes,parent,false);
        return new BikesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BikesViewHolder holder, int position) {
        Gen_cl bike = bikes.get(position);
        holder.onBind(bike);
    }

    @Override
    public int getItemCount() {
        return bikes.size();
    }
}
