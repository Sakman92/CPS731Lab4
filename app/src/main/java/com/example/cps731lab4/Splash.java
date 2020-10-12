package com.example.cps731lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {
    MediaPlayer mdDrums;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mdDrums=new MediaPlayer();
        mdDrums=MediaPlayer.create(this,R.raw.drums);
        mdDrums.start();
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                finish();
                mdDrums.pause();
                startActivity(new Intent(Splash.this, HeroListActivity.class));

            }
        };
        Timer opening= new Timer();
        opening.schedule(task,5000);
    }
}