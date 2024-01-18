package com.mobile.blackpass;

import static androidx.core.content.ContentProviderCompat.requireContext;

import com.google.android.material.navigation.NavigationView;
import com.mobile.blackpass.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.navigation.NavigationBarView;
import com.mobile.blackpass.databinding.ActivityHomeBinding;
import com.mobile.blackpass.databinding.ActivityMainBinding;
import com.mobile.blackpass.fragment.HomeFragment;
import com.mobile.blackpass.fragment.ProfileFragment;
import com.mobile.blackpass.fragment.VideoFragment;

public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding binding;

    HomeFragment fragment_home;
    ProfileFragment fragment_profile;
    VideoFragment fragment_video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        fragment_profile = new ProfileFragment();
        fragment_video = new VideoFragment();
        fragment_home = new HomeFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.containers, fragment_home).commit();

        NavigationBarView.OnItemSelectedListener navListener = item -> {
            Fragment selectedFragment = null;


            if (item.getItemId() == R.id.exclude) {
                selectedFragment = fragment_home;
            } else if (item.getItemId() == R.id.profile) {
                selectedFragment = fragment_profile;
            } else if (item.getItemId() == R.id.video) {
                selectedFragment = fragment_video;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.containers, selectedFragment).commit();

            return true;
        };

        binding.navigationView.setOnItemSelectedListener(navListener);

    }

}