package com.example.month_3_lesson_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FragmentStaff extends Fragment {

    private ArrayList<Gen_cl> staff = new ArrayList<Gen_cl>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_staff, container, false);
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadStaff();
        initRV();
    }

    private void loadStaff() {
        staff.add(new Gen_cl("John Doe", "30", "Manager", "https://avatars.mds.yandex.net/i?id=f3e572441e358a3582aa69529f513f09_l-8710632-images-thumbs&n=13"));
        staff.add(new Gen_cl("Jane Smith", "24", "Engineer", "https://avatars.mds.yandex.net/i?id=a22b0ce578539f8d17705c9d17c33737_l-5296782-images-thumbs&n=13"));
        staff.add(new Gen_cl("Alex Johnson", "25", "Designer", "https://thumbs.dreamstime.com/b/счастливо-28936058.jpg"));
        staff.add(new Gen_cl("Emily Davis", "26", "Marketing Specialist", "https://avatars.mds.yandex.net/i?id=d7a1c6a5041183a9726503ab94bcca5a_l-4012807-images-thumbs&n=13"));
        staff.add(new Gen_cl("Michael Brown", "27", "Support Agent", "https://avatars.mds.yandex.net/i?id=837c532057b00f294746b1c0c0f3c1f0_l-5271165-images-thumbs&n=13"));
        staff.add(new Gen_cl("Sophia Wilson", "28", "Product Manager", "https://i.pinimg.com/originals/fc/67/03/fc6703e79d41363832817cbdf297beaa.jpg"));
    }


    private void initRV() {
        RecyclerView recyclerView = requireActivity().findViewById(R.id.rv_staff);
        staffAdapter adapter = new staffAdapter(this.getLayoutInflater(),staff);
        recyclerView.setAdapter(adapter);

    }

}