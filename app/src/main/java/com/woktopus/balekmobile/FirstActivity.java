package com.woktopus.balekmobile;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.s1);
        mp6.start();
    }
}
