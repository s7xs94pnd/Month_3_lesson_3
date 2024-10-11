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


public class CallsFragment extends Fragment {

    private ArrayList<Gen_cl> calls = new ArrayList<Gen_cl>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calls, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadcalls();
        initRV();
    }

    private void loadcalls() {
        calls.add(new Gen_cl("WhatsApp", "13:12", "missed", "https://i.pinimg.com/originals/1f/28/c6/1f28c68d2c35f389966b5a363b992d06.png", "999999999"));
        calls.add(new Gen_cl("Instagram", "15:12", "missed", "https://i.pinimg.com/originals/1f/28/c6/1f28c68d2c35f389966b5a363b992d06.png", "4444444444"));
        calls.add(new Gen_cl("Telegram", "22:12", "missed", "https://i.pinimg.com/originals/1f/28/c6/1f28c68d2c35f389966b5a363b992d06.png", "4423232"));
        calls.add(new Gen_cl("Wechat", "02:12", "missed", "https://i.pinimg.com/originals/1f/28/c6/1f28c68d2c35f389966b5a363b992d06.png", "9999993434999"));
        calls.add(new Gen_cl("Phone", "04:12", "missed", "https://i.pinimg.com/originals/1f/28/c6/1f28c68d2c35f389966b5a363b992d06.png", "999999234999"));
        calls.add(new Gen_cl("FaceTime", "10:12", "missed", "https://i.pinimg.com/originals/1f/28/c6/1f28c68d2c35f389966b5a363b992d06.png", "999232999999"));
    }


    private void initRV() {
        RecyclerView recyclerView = requireActivity().findViewById(R.id.rv_calls);
        callsAdapter adapter = new callsAdapter(this.getLayoutInflater(),calls);
        recyclerView.setAdapter(adapter);

    }
}