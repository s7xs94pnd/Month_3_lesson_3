package com.example.month_3_lesson_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class staffAdapter extends RecyclerView.Adapter<staffViewHolder>
{
    private  LayoutInflater inflater;
    private  ArrayList <Gen_cl> staff;

    public staffAdapter(LayoutInflater inflater, ArrayList<Gen_cl> staff) {
        this.inflater = inflater;
        this.staff = staff;
    }

    @NonNull
    @Override
    public staffViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_staff,parent,false);
        return new staffViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull staffViewHolder holder, int position) {
        Gen_cl worker = staff.get(position);
        holder.onBindStaff(worker);
    }

    @Override
    public int getItemCount() {
        return staff.size();
    }
}
