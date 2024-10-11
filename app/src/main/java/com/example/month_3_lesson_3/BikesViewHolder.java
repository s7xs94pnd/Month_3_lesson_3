package com.example.month_3_lesson_3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class BikesViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivImage;
    private TextView tvName,tvDesc;


    public BikesViewHolder(@NonNull View itemView) {
        super(itemView);


        ivImage =  itemView.findViewById(R.id.circleImageView);
        tvDesc = itemView.findViewById(R.id.desc);
        tvName = itemView.findViewById(R.id.name);
    }

    public void onBind(Gen_cl bikes) {
        tvName.setText(bikes.getName());
        tvDesc.setText(bikes.getDesc());
        Glide.with(ivImage.getContext()).load(bikes.getImage()).into(ivImage);
    }


}
