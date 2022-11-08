package com.example.hopeinhome.ui.refer_and_earn;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hopeinhome.R;

public class refer_and_earn extends Fragment {

    private ReferAndEarnViewModel mViewModel;

    public static refer_and_earn newInstance() {
        return new refer_and_earn();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.refer_and_earn_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ReferAndEarnViewModel.class);
        // TODO: Use the ViewModel
    }

}