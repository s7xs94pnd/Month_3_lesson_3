package com.example.month_3_lesson_3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;


public class callsViewHolder extends RecyclerView.ViewHolder {
    private  ImageView ivAva;
    private TextView  tvNumb,tvStatus,tvAppName,tvTime;


    public callsViewHolder(@NonNull View itemView) {
        super(itemView);
        ivAva =  itemView.findViewById(R.id.circleCallsImageView);
        tvStatus =  itemView.findViewById(R.id.status);
        tvAppName = itemView.findViewById(R.id.appName);
        tvTime = itemView.findViewById(R.id.time);
        tvNumb = itemView.findViewById(R.id.number);
    }


    public void onBindStaff(Gen_cl call) {
        tvNumb.setText(call.getNumber());
        tvStatus.setText(call.getStatus());
        tvAppName.setText(call.getAppName());
        tvTime.setText(call.getTime());
        Glide.with(ivAva.getContext()).load(call.getAva()).into(ivAva);
    }
}
