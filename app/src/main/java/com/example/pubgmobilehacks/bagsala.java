package com.example.pubgmobilehacks;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class bagsala extends AppCompatActivity {
MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagsala);
        mediaPlayer=MediaPlayer.create(bagsala.this, R.raw.laugh);
        mediaPlayer.start();
    }

    protected void onPause(){
        super.onPause();
        mediaPlayer.release();
    }
}
