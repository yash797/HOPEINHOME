package com.example.hopeinhome.ui.home;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.hopeinhome.LoginActivity;
import com.example.hopeinhome.R;
import com.example.hopeinhome.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;

    Button trial1;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {



        //            TextView button;
//            button = (TextView) getActivity().findViewById(R.id.meditate_button);
//            button.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    openMeditate();
//                }
//            });


//        public void meditatefunc(View view){
//            Intent intent2 = new Intent(this,Meditate.class);
//            startActivity(intent2);
//        }

        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        Intent intent = getActivity().getIntent();
        String input_username1 = intent.getStringExtra(LoginActivity.MSG);
        TextView textView2 = root.findViewById(R.id.home_username);
        Typeface boldTypeface = Typeface.defaultFromStyle(Typeface.BOLD);
        textView2.setTypeface(boldTypeface);
        textView2.setText("Hello "+input_username1);

//        public void meditatefunc(){
//
//            Intent i = new Intent(getActivity(), Meditate.class);
//            startActivity(i);
//            ((Activity) getActivity()).overridePendingTransition(0, 0);

//        }

//        Button btnopenmusic = (Button) root.findViewById(R.id.meditate_button);
//        btnopenmusic.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void OnClick(View root){
//                meditation_audio_tracks
//            }
//        });
//        View v = inflater.inflate(R.layout.vaccination_fragment, container, false);
//        trial1 = v.findViewById(R.id.trial);
//        trial1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                gotoUrl("https://www.cowin.gov.in/home");
//            }
//        });


//        public View trialfunc(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
//                @Nullable Bundle savedInstanceState){
//            View v = inflater.inflate(R.layout.fragment_home, container, false);
//            trial1 = v.findViewById(R.id.trial);
//            trial1.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    gotoUrl("https://www.cowin.gov.in/home");
//                }
//            });
//            return v;
//        }


        return root;
//        Intent intent = getIntent();
//        String input_username1 = intent.getStringExtra(LoginActivity.MSG);
//
//        // Set text inside textview to message
//        TextView textView = findViewById(R.id.);
//        textView.setText(input_username1);
    }
//    public void openMeditate(){
//        Intent intent = new Intent(this.getContext(),Meditate.class);
//        startActivity(intent);
//    }

//    public View trialfunc(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
//                          @Nullable Bundle savedInstanceState){
//        View v = inflater.inflate(R.layout.fragment_home, container, false);
//        trial1 = v.findViewById(R.id.trial);
//        trial1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                gotoUrl("https://www.cowin.gov.in/home");
//            }
//        });
//        return v;
//    }
//
//    private void gotoUrl(String s) {
//        Uri uri = Uri.parse(s);
//        startActivity(new Intent(Intent.ACTION_VIEW,uri));
//    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
//            TextView button;
//            button = (TextView) getActivity().findViewById(R.id.meditate_button);
//            button.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    openMeditate();
//                }
//            });
