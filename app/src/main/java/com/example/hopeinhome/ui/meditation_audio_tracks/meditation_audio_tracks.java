package com.example.hopeinhome.ui.meditation_audio_tracks;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
//import android.widget.EditText;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.example.hopeinhome.MainActivity;
//import com.example.hopeinhome.MainActivity;
import com.example.hopeinhome.MeditationActivity;
import com.example.hopeinhome.R;

//import java.util.ArrayList;

public class meditation_audio_tracks extends Fragment {

    private MeditationAudioTracksViewModel mViewModel;

    public static meditation_audio_tracks newInstance() {
        return new meditation_audio_tracks();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

//         public static final String MSG2 = "com.example.hopeinhome.ui.meditation_audio_tracks.alone";


//        ListView myListView = getActivity().findViewById(R.id.myListView);
//        ArrayList<String> songs = new ArrayList<>();
//        songs.add("Time Alone");
//        songs.add("Sunset");
//        songs.add("Rolling Hills");
//        songs.add("Ambieance");
//
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songs);
//        myListView.setAdapter(arrayAdapter);
//
//        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                String text = "Item" + position+ " " + ((TextView) view).getText().toString();
//                Toast.makeText(meditation_audio_tracks.this,text , Toast.LENGTH_SHORT).show();
//
//            }
//        });

//        public void alonefunc(View v){
//            Intent intent = new Intent(this.getActivity(), MeditationActivity.class);
//            EditText song_alone = getActivity().findViewById(R.id.alone);
//            String alone = song_alone.getText().toString();
//            intent.putExtra(MSG2,alone);
//            startActivity(intent);
//        }
        View v = inflater.inflate(R.layout.meditation_audio_tracks_fragment, container, false);
        Button btnOpen = (Button) v.findViewById(R.id.alone);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),MeditationActivity.class);
                intent.putExtra("data","alone");
                startActivity(intent);
            }
        });

        Button btnOpen2 = (Button) v.findViewById(R.id.ambience);
        btnOpen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),MeditationActivity.class);
                intent.putExtra("data","ambience");
                startActivity(intent);
            }
        });
        Button btnOpen3 = (Button) v.findViewById(R.id.sunset);
        btnOpen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),MeditationActivity.class);
                intent.putExtra("data","sunset");
                startActivity(intent);
            }
        });
        return v;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MeditationAudioTracksViewModel.class);
        // TODO: Use the ViewModel
    }

}