package com.example.hopeinhome.ui.vaccination;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.hopeinhome.R;

//import java.util.Objects;

public class vaccination extends Fragment {


    private VaccinationViewModel mViewModel;

    public static vaccination newInstance() {
        return new vaccination();
    }

    Button bookslot;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {



        View v = inflater.inflate(R.layout.vaccination_fragment, container, false);
        bookslot = v.findViewById(R.id.book_slot);
        bookslot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.cowin.gov.in/home");
            }
        });

        return v;
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(VaccinationViewModel.class);
        // TODO: Use the ViewModel
    }

}