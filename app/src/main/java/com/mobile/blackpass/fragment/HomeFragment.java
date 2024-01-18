package com.mobile.blackpass.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.mobile.blackpass.R;
import com.mobile.blackpass.databinding.ActivityHomeBinding;
import com.mobile.blackpass.databinding.HomeFragmentBinding;


public class HomeFragment extends Fragment {

    @NonNull HomeFragmentBinding binding;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = HomeFragmentBinding.inflate(inflater);


        return binding.getRoot();
    }
}