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

        ImageButton sept = this.findViewById(R.id.imageButton7);
        final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.musique_7);
        sept.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                System.out.println(expect);

                expect = 2;

                mp7.start();
            }
        });

        ImageButton huit = this.findViewById(R.id.imageButton8);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.musique_1);
        huit.setOnClickListener(new View.OnClickListener(){

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

        ImageButton neuf = this.findViewById(R.id.imageButton9);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.musique_3);
        neuf.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                System.out.println(expect);

                if(expect==3){
                    expect=4;
                }else{
                    expect=1;
                }
                mp3.start();
            }
        });


        final ImageButton dix = this.findViewById(R.id.imageButton10);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.musique_4);
        dix.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                System.out.println(expect);

                if(expect==4){
                    expect=5;
                }else{
                    expect=1;
                }
                mp4.start();
            }
        });


        ImageButton onze = this.findViewById(R.id.imageButton11);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.musique_5);
        onze.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                System.out.println(expect);

                if(expect==5){
                    expect=6;
                }else{
                    expect=1;
                }
                mp5.start();
            }
        });


        ImageButton douze = this.findViewById(R.id.imageButton12);
        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.musique_6);
        douze.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                System.out.println(expect);
                if(expect==6){
                    Toast toast = Toast.makeText(getApplicationContext(),"BRAVO !", Toast.LENGTH_LONG);
                    toast.show();
                    imgDone.setVisibility(View.VISIBLE);
                    resolved = true;
                }else{
                    expect=1;
                }
                mp6.start();
            }
        });


        ImageButton treize = this.findViewById(R.id.imageButton13);
        final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.musique_7);
        treize.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                expect=1;

                mp7.start();
            }
        });


        ImageButton quatorze = this.findViewById(R.id.imageButton14);
        final MediaPlayer mp8 = MediaPlayer.create(this, R.raw.musique_8);
        quatorze.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                expect=1;

                mp8.start();
            }
        });

        ImageButton quinze = this.findViewById(R.id.imageButton15);
        final MediaPlayer mp9 = MediaPlayer.create(this, R.raw.musique_9);
        quinze.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                expect=1;

                mp9.start();
            }
        });

    }
}
