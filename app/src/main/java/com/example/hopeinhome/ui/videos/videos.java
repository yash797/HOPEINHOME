package com.example.hopeinhome.ui.videos;

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
import android.widget.TextView;

import com.example.hopeinhome.R;

public class videos extends Fragment {

    private VideosViewModel mViewModel;

    public static videos newInstance() {
        return new videos();
    }

    ImageView logoo1;
    TextView text1;
    ImageView logoo2;
    TextView text2;
    ImageView logoo3;
    TextView text3;
    ImageView logoo4;
    TextView text4;
    ImageView logoo5;
    TextView text5;
    ImageView logoo6;
    TextView text6;
    ImageView logoo7;
    TextView text7;
    ImageView logoo8;
    TextView text8;
    ImageView logoo9;
    TextView text9;
    ImageView logoo10;
    TextView text10;
    ImageView logoo11;
    TextView text11;
    ImageView logoo12;
    TextView text12;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.videos_fragment, container, false);


//        logoo1 = v.findViewById(R.id.logo1);
//        logoo1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                gotoUrl("https://www.cowin.gov.in/home");
//            }
//        });
//        text1 = v.findViewById(R.id.video1);
//        text1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                gotoUrl("https://www.cowin.gov.in/home");
//            }
//        });

        logoo1 = v.findViewById(R.id.logo1);
        logoo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/9DYaBzFPbcs");
            }
        });
        text1 = v.findViewById(R.id.video1);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/9DYaBzFPbcs");
            }
        });
        logoo2 = v.findViewById(R.id.logo2);
        logoo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/0vGWYrIpoII");
            }
        });
        text2 = v.findViewById(R.id.video2);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/0vGWYrIpoII");
            }
        });
        logoo3 = v.findViewById(R.id.logo3);
        logoo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/agPsqRDNS3g");
            }
        });
        text3 = v.findViewById(R.id.video3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/agPsqRDNS3g");
            }
        });


        logoo4 = v.findViewById(R.id.logo4);
        logoo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/9JBu8s-3fCw");
            }
        });
        text4 = v.findViewById(R.id.video4);
        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/9JBu8s-3fCw");
            }
        });
        logoo5 = v.findViewById(R.id.logo5);
        logoo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/s2NQhpFGIOg");
            }
        });
        text5 = v.findViewById(R.id.video5);
        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/s2NQhpFGIOg");
            }
        });

        logoo6 = v.findViewById(R.id.logo6);
        logoo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/_7eBT0T6PUI");
            }
        });
        text6 = v.findViewById(R.id.video6);
        text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/_7eBT0T6PUI");
            }
        });
        logoo7 = v.findViewById(R.id.logo7);
        logoo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/mZNYLeUUJgY");
            }
        });
        text7 = v.findViewById(R.id.video7);
        text7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/mZNYLeUUJgY");
            }
        });
        logoo8 = v.findViewById(R.id.logo8);
        logoo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/c06dTj0v0sM");
            }
        });
        text8 = v.findViewById(R.id.video8);
        text8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/c06dTj0v0sM");
            }
        });
        logoo9 = v.findViewById(R.id.logo9);
        logoo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/SO56AKM8yNk");
            }
        });
        text9 = v.findViewById(R.id.video9);
        text9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/SO56AKM8yNk");
            }
        });

        logoo10 = v.findViewById(R.id.logo10);
        logoo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/yTL_bNvXJ9s");
            }
        });
        text10 = v.findViewById(R.id.video10);
        text10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/yTL_bNvXJ9s");
            }
        });
        logoo11 = v.findViewById(R.id.logo11);
        logoo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/PG2f3GF5RlI");
            }
        });
        text11 = v.findViewById(R.id.video11);
        text11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/PG2f3GF5RlI");
            }
        });
        logoo12 = v.findViewById(R.id.logo12);
        logoo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/Mot-8b8szJI");
            }
        });
        text12 = v.findViewById(R.id.video12);
        text12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/Mot-8b8szJI");
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
        mViewModel = new ViewModelProvider(this).get(VideosViewModel.class);
        // TODO: Use the ViewModel
    }

}