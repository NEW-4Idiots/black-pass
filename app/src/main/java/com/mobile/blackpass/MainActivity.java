package com.mobile.blackpass;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.interaction.DragInteraction;

import com.mobile.blackpass.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // 뷰 바인딩 기본 at Java
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.beginButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), SignActivity.class);
            startActivity(intent);
        });
    }

}
