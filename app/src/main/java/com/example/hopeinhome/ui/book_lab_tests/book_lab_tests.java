package com.example.hopeinhome.ui.book_lab_tests;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.hopeinhome.R;

public class book_lab_tests extends Fragment {

    private BookLabTestsViewModel mViewModel;

    public static book_lab_tests newInstance() {
        return new book_lab_tests();
    }


    ImageView map01;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.book_lab_tests_fragment, container, false);

        map01 = v.findViewById(R.id.map1);
        map01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.google.com/search?q=lab+tests+near+me&rlz=1C1JJTC_enIN940IN940&oq=lab+tests&aqs=chrome.0.69i59j69i57j0i20i263l2j0l3j69i60.2267j0j7&sourceid=chrome&ie=UTF-8");
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
        mViewModel = new ViewModelProvider(this).get(BookLabTestsViewModel.class);
        // TODO: Use the ViewModel
    }

}