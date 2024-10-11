package com.example.month_3_lesson_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class callsAdapter extends RecyclerView.Adapter<callsViewHolder>
{
    private LayoutInflater inflater;
    private ArrayList<Gen_cl> calls;

    public callsAdapter(LayoutInflater inflater, ArrayList<Gen_cl> calls) {
        this.inflater = inflater;
        this.calls = calls;
    }

    @NonNull
    @Override
    public callsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_calls,parent,false);
        return new callsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull callsViewHolder holder, int position) {
        Gen_cl call = calls.get(position);
        holder.onBindStaff(call);
    }

    @Override
    public int getItemCount() {
        return calls.size();
    }
}