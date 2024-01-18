package com.mobile.blackpass;


import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.mobile.blackpass.databinding.ActivitySignInBinding;

public class SignInActivity extends AppCompatActivity {
    ActivitySignInBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // 뷰 바인딩 기본 at Java
        super.onCreate(savedInstanceState);
        binding = ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.leftArrow.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), SignActivity.class);
            startActivity(intent);
        });
    }
}
