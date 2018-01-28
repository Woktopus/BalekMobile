package com.woktopus.balekmobile;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class SimonActivity extends AppCompatActivity {

    public static boolean resolved = false;

    int expect = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_simon);

        final ImageView imgDone = findViewById(R.id.imgdone);

        if (resolved) imgDone.setVisibility(View.VISIBLE);

        ImageButton btn1 = this.findViewById(R.id.imageButton7);
        final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.musique_7);
        mp7.setVolume(0.05f,0.05f);
        btn1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                System.out.println(expect);

                expect = 2;

                mp7.start();
            }
        });

        ImageButton btn2 = this.findViewById(R.id.imageButton8);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.musique_1);
        mp.setVolume(0.05f,0.05f);

        btn2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                System.out.println(expect);

                if(expect==2){
                    expect=6;
                }else{
                    expect=2;
                }
                mp.start();
            }
        });


        final MediaPlayer mpSucess = MediaPlayer.create(this, R.raw.s4);

        ImageButton btn3 = this.findViewById(R.id.imageButton9);
        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.musique_6);
        mp6.setVolume(0.05f,0.05f);

        btn3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                System.out.println(expect);

                if(expect==3){
                    Toast toast = Toast.makeText(getApplicationContext(),"BRAVO !", Toast.LENGTH_LONG);
                    toast.show();
                    imgDone.setVisibility(View.VISIBLE);
                    resolved = true;
                    mpSucess.start();
                }else{
                    expect=2;
                }
                mp6.start();
            }
        });


        final ImageButton btn4 = this.findViewById(R.id.imageButton10);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.musique_5);
        mp5.setVolume(0.05f,0.05f);
        btn4.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                System.out.println(expect);

                if(expect==4){
                    expect=3;
                }else{
                    expect=2;
                }
                mp5.start();
            }
        });


        ImageButton btn5 = this.findViewById(R.id.imageButton11);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.musique_4);
        mp4.setVolume(0.05f,0.05f);

        btn5.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                System.out.println(expect);

                if(expect==5){
                    expect=4;
                }else{
                    expect=2;
                }
                mp4.start();
            }
        });


        ImageButton btn6 = this.findViewById(R.id.imageButton12);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.musique_2);
        mp2.setVolume(0.05f,0.05f);

        btn6.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                System.out.println(expect);
                if(expect==6){
                    expect = 9;
                }else{
                    expect=2;
                }
                mp2.start();
            }
        });


        ImageButton btn7 = this.findViewById(R.id.imageButton13);
        final MediaPlayer mp8 = MediaPlayer.create(this, R.raw.musique_8);
        mp8.setVolume(0.05f,0.05f);

        btn7.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                expect=2;

                mp8.start();
            }
        });


        ImageButton btn8 = this.findViewById(R.id.imageButton14);
        final MediaPlayer mp9 = MediaPlayer.create(this, R.raw.musique_9);
        mp9.setVolume(0.05f,0.05f);

        btn8.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                expect=2;

                mp8.start();
            }
        });

        ImageButton btn9 = this.findViewById(R.id.imageButton15);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.musique_3);
        mp3.setVolume(0.05f,0.05f);

        btn9.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                if(expect==9){
                    expect = 5;
                }else{
                    expect=2;
                }

                mp3.start();
            }
        });

    }
}
