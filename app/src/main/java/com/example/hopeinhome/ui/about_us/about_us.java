package com.example.hopeinhome.ui.about_us;

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
import android.widget.ImageView;

import com.example.hopeinhome.R;

public class about_us extends Fragment {

    private AboutUsViewModel mViewModel;

    public static about_us newInstance() {
        return new about_us();
    }

    ImageView instaButton;
    ImageView linkedinButton;
    ImageView instaButton2;
    ImageView linkedinButton2;
    ImageView linkedinButton3;
    ImageView instaButton4;
    ImageView instaButton5;
    ImageView linkedinButton5;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.about_us_fragment, container, false);

        instaButton = v.findViewById(R.id.about_us_insta_button);
        instaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/yashgajalwar/");
            }
        });
        linkedinButton = v.findViewById(R.id.about_us_linkedin_button);
        linkedinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.linkedin.com/in/yash-gajalwar-b412361b9/");
            }
        });

        instaButton2 = v.findViewById(R.id.about_us_insta_button2);
        instaButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/mahek_mulla1011/");
            }
        });
        linkedinButton2 = v.findViewById(R.id.about_us_linkedin_button2);
        linkedinButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.linkedin.com/in/mahek-mulla-504566214/");
            }
        });
        linkedinButton3 = v.findViewById(R.id.about_us_linkedin_button3);
        linkedinButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.linkedin.com/in/shreya-shetti-985238207/");
            }
        });
        instaButton4 = v.findViewById(R.id.about_us_insta_button4);
        instaButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/sanjanamamde/");
            }
        });
        instaButton5 = v.findViewById(R.id.about_us_insta_button5);
        instaButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/kshitija53/");
            }
        });
        linkedinButton5 = v.findViewById(R.id.about_us_linkedin_button5);
        linkedinButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.linkedin.com/in/kshitija-gondhalekar-85b919206/?originalSubdomain=in");
            }
        });
        return  v;
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AboutUsViewModel.class);


        // TODO: Use the ViewModel
    }

}