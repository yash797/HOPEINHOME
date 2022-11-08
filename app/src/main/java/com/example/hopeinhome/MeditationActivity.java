package com.example.hopeinhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

import com.example.hopeinhome.ui.meditation_audio_tracks.MeditationAudioTracksViewModel;
import com.example.hopeinhome.ui.meditation_audio_tracks.meditation_audio_tracks;

import java.util.Timer;
import java.util.TimerTask;

public class MeditationActivity extends AppCompatActivity {

        MediaPlayer musicplayer;
        AudioManager audiomanager;
        public void playfunc(View view){
            musicplayer.start();
        }
        public void pausefunc(View view){
            musicplayer.pause();
        }
        public void stopfunc(View view){ musicplayer.stop(); }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation);

        Bundle bundle = getIntent().getExtras();
        String s = bundle.getString("data");
//        if(bundle != null){
//            if(bundle.getString("data") != null){
////                String s = bundle.getString("data");
////                Toast.makeText(getApplicationContext(),s+"successed",Toast.LENGTH_SHORT).show();
//            }
//        }
//IMP
//        MediaPlayer musicplayer;
//        public void playfunc(View view){
//            musicplayer.start();
//        }
//        public void pausefunc(View view){
//            musicplayer.pause();
//        }
//        public void stopfunc(View view){
//            musicplayer.stop();
//        }
//        musicplayer = MediaPlayer.create(this,R.raw.Alone);
//
        if(s.equals("alone")){
//            Toast.makeText(getApplicationContext(),"i'm listening alone song",Toast.LENGTH_SHORT).show();
            TextView textview1 = (TextView) findViewById(R.id.active_text);
            textview1.setText("Alone.mp3");
            ImageView imageview1 = (ImageView) findViewById(R.id.active_image);
            imageview1.setImageResource(R.drawable.alone);
            musicplayer = MediaPlayer.create(this,R.raw.alone);
            audiomanager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
            int maxVol = audiomanager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
            int curVol = audiomanager.getStreamVolume(AudioManager.STREAM_MUSIC);

            SeekBar seekvolume = findViewById(R.id.seekbar_volume);
            seekvolume.setMax(maxVol);
            seekvolume.setProgress(curVol);
            seekvolume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    audiomanager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);

                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });

            final SeekBar seekprogress = findViewById(R.id.seek_progress);
            seekprogress.setMax(musicplayer.getDuration());

            new Timer().scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    seekprogress.setProgress(musicplayer.getCurrentPosition());
                }
            }, 0, 900);

            seekprogress.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    musicplayer.seekTo(progress);
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });

        }
        else if(s.equals("ambience")){
//            Toast.makeText(getApplicationContext(),"i'm listening alone song",Toast.LENGTH_SHORT).show();
            TextView textview2 = (TextView) findViewById(R.id.active_text);
            textview2.setText("Ambience.mp3");
            ImageView imageview2 = (ImageView) findViewById(R.id.active_image);
            imageview2.setImageResource(R.drawable.ambience);
            musicplayer = MediaPlayer.create(this,R.raw.ambience);

//            musicplayer = MediaPlayer.create(this,R.raw.alone);
            audiomanager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
            int maxVol = audiomanager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
            int curVol = audiomanager.getStreamVolume(AudioManager.STREAM_MUSIC);
            SeekBar seekvolume = findViewById(R.id.seekbar_volume);
            seekvolume.setMax(maxVol);
            seekvolume.setProgress(curVol);
            seekvolume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    audiomanager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);

                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });

            final SeekBar seekprogress = findViewById(R.id.seek_progress);
            seekprogress.setMax(musicplayer.getDuration());

            new Timer().scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    seekprogress.setProgress(musicplayer.getCurrentPosition());
                }
            }, 0, 900);

            seekprogress.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    musicplayer.seekTo(progress);
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });

        }
        else{
//            Toast.makeText(getApplicationContext(),"i'm listening alone song",Toast.LENGTH_SHORT).show();
            TextView textview3 = (TextView) findViewById(R.id.active_text);
            textview3.setText("Sunset.mp3");
            ImageView imageview3 = (ImageView) findViewById(R.id.active_image);
            imageview3.setImageResource(R.drawable.sunset);
            musicplayer = MediaPlayer.create(this,R.raw.sunset);

            audiomanager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
            int maxVol = audiomanager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
            int curVol = audiomanager.getStreamVolume(AudioManager.STREAM_MUSIC);
            SeekBar seekvolume = findViewById(R.id.seekbar_volume);
            seekvolume.setMax(maxVol);
            seekvolume.setProgress(curVol);
            seekvolume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    audiomanager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);

                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });

            final SeekBar seekprogress = findViewById(R.id.seek_progress);
            seekprogress.setMax(musicplayer.getDuration());

            new Timer().scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    seekprogress.setProgress(musicplayer.getCurrentPosition());
                }
            }, 0, 900);

            seekprogress.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    musicplayer.seekTo(progress);
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });

        }
//        player = MediaPlayer.create(this,R.raw.Alone);

    }

}