package com.example.month_3_lesson_3;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.month_3_lesson_3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Обработчик для первой кнопки (barNav1)
        binding.barNav1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (getSupportFragmentManager().findFragmentById(R.id.fragment_container_view) == null) {

                    if (getSupportFragmentManager().findFragmentById(R.id.fragment_container_2) != null) {
                        getSupportFragmentManager().beginTransaction()
                                .remove(getSupportFragmentManager().findFragmentById(R.id.fragment_container_2))
                                .commit();
                    }

                    if (getSupportFragmentManager().findFragmentById(R.id.fragment_container_3) != null) {
                        getSupportFragmentManager().beginTransaction()
                                .remove(getSupportFragmentManager().findFragmentById(R.id.fragment_container_3))
                                .commit();
                    }

                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container_view, new FragmentBikesShop())
                            .commit();
                }
            }
        });

        binding.barNav2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (getSupportFragmentManager().findFragmentById(R.id.fragment_container_2) == null) {

                    if (getSupportFragmentManager().findFragmentById(R.id.fragment_container_view) != null) {
                        getSupportFragmentManager().beginTransaction()
                                .remove(getSupportFragmentManager().findFragmentById(R.id.fragment_container_view))
                                .commit();
                    }

                    if (getSupportFragmentManager().findFragmentById(R.id.fragment_container_3) != null) {
                        getSupportFragmentManager().beginTransaction()
                                .remove(getSupportFragmentManager().findFragmentById(R.id.fragment_container_3))
                                .commit();
                    }


                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container_2, new FragmentStaff())
                            .commit();
                }
            }
        });

        binding.barNav3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (getSupportFragmentManager().findFragmentById(R.id.fragment_container_3) == null) {

                    if (getSupportFragmentManager().findFragmentById(R.id.fragment_container_view) != null) {
                        getSupportFragmentManager().beginTransaction()
                                .remove(getSupportFragmentManager().findFragmentById(R.id.fragment_container_view))
                                .commit();
                    }

                    if (getSupportFragmentManager().findFragmentById(R.id.fragment_container_2) != null) {
                        getSupportFragmentManager().beginTransaction()
                                .remove(getSupportFragmentManager().findFragmentById(R.id.fragment_container_2))
                                .commit();
                    }


                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container_3, new CallsFragment())
                            .commit();
                }
            }
        });
    }
}