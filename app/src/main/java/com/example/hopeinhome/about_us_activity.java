package com.example.hopeinhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class about_us_activity extends AppCompatActivity {


    ImageView instaButtonA;
    ImageView linkedinButtonA;
    ImageView instaButton2A;
    ImageView linkedinButton2A;
    ImageView linkedinButton3A;
    ImageView instaButton4A;
    ImageView instaButton5A;
    ImageView linkedinButton5A;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        instaButtonA = findViewById(R.id.about_us_insta_buttonA);
        instaButtonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/_ya.sh._p");
            }
        });
        linkedinButtonA = findViewById(R.id.about_us_linkedin_buttonA);
        linkedinButtonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.linkedin.com/in/yash-pande-/");
            }
        });

        instaButton2A = findViewById(R.id.about_us_insta_button2A);
        instaButton2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/aryan_u_007/?hl=en");
            }
        });
        linkedinButton2A = findViewById(R.id.about_us_linkedin_button2A);
        linkedinButton2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.linkedin.com/in/aryan-umale-901ba4208/");
            }
        });

         instaButton2A = findViewById(R.id.about_us_insta_button2A);
        instaButton2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/ya.mini108/?hl=en");
            }
        });
        linkedinButton2A = findViewById(R.id.about_us_linkedin_button2A);
        linkedinButton2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.linkedin.com/in/yamini-tapde-9447b320b/");
            }
        });

         instaButton2A = findViewById(R.id.about_us_insta_button2A);
        instaButton2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/sayali.2308/?hl=en");
            }
        });
        linkedinButton2A = findViewById(R.id.about_us_linkedin_button2A);
        linkedinButton2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.linkedin.com/in/sayali-sable-4ba9aa226/");
            }
        });

       


    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}