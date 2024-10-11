package com.example.month_3_lesson_3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class staffViewHolder  extends RecyclerView.ViewHolder {
    private  ImageView ivImage;
    private  TextView tvName ,tvPost,tvAge;


    public staffViewHolder(@NonNull View itemView) {
        super(itemView);
        ivImage =  itemView.findViewById(R.id.circleStaffImageView);
        tvName = itemView.findViewById(R.id.name);
        tvAge= itemView.findViewById(R.id.age);
        tvPost = itemView.findViewById(R.id.post);
    }

    public void onBindStaff(Gen_cl staff) {
        tvName.setText("Name: "+staff.getName());
        tvPost.setText("Post: "+staff.getPost());
        tvAge.setText("Age: "+staff.getAge());
        Glide.with(ivImage.getContext()).load(staff.getImage()).into(ivImage);
    }
}
