package com.woktopus.balekmobile;


import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class Code2Activity extends AppCompatActivity {

    public static boolean resolved = false;
    ImageView imgFin;
    int cpt1 = 0;
    int cpt2 = 0;
    int cpt3 = 0;
    int cpt4 = 0;

    int sol1=1;
    int sol2=0;
    int sol3=4;
    int sol4=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code2);

        imgFin = findViewById(R.id.imgfin);

        final ArrayList<Integer> imgRes = new ArrayList<>();
        imgRes.add(R.drawable.icone_1_code_2);
        imgRes.add(R.drawable.icone_2_code_2);
        imgRes.add(R.drawable.icone_3_code_2);
        imgRes.add(R.drawable.icone_4_code_2);
        imgRes.add(R.drawable.icone_5_code_2);

        ImageButton uparrow1 = findViewById(R.id.up_arrow_1);
        ImageButton uparrow2 = findViewById(R.id.up_arrow_2);
        ImageButton uparrow3 = findViewById(R.id.up_arrow_3);
        ImageButton uparrow4 = findViewById(R.id.up_arrow_4);

        ImageButton downarrow1 = findViewById(R.id.down_arrow_1);
        ImageButton downarrow2 = findViewById(R.id.down_arrow_2);
        ImageButton downarrow3 = findViewById(R.id.down_arrow_3);
        ImageButton downarrow4 = findViewById(R.id.down_arrow_4);

        final ImageView imgw1 = findViewById(R.id.imageView1);
        final ImageView imgw2 = findViewById(R.id.imageView2);
        final ImageView imgw3 = findViewById(R.id.imageView3);
        final ImageView imgw4 = findViewById(R.id.imageView4);

        if(resolved){
            imgFin.setVisibility(View.VISIBLE);
        }

        uparrow1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                imgw1.setImageResource(imgRes.get(Math.abs((cpt1+1)%imgRes.size())));
                cpt1 ++;
                isSuccess();
            }
        });


        downarrow1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                imgw1.setImageResource(imgRes.get(Math.abs((cpt1-1)%imgRes.size())));
                cpt1 --;
                isSuccess();
            }
        });


        uparrow2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                imgw2.setImageResource(imgRes.get(Math.abs((cpt2+1)%imgRes.size())));
                cpt2 ++;
                isSuccess();
            }
        });


        downarrow2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                imgw2.setImageResource(imgRes.get(Math.abs((cpt2-1)%imgRes.size())));
                cpt2 --;
                isSuccess();
            }
        });


        uparrow3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                imgw3.setImageResource(imgRes.get(Math.abs((cpt3+1)%imgRes.size())));
                cpt3 ++;
                isSuccess();
            }
        });


        downarrow3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                imgw3.setImageResource(imgRes.get(Math.abs((cpt3-1)%imgRes.size())));
                cpt3 --;
                isSuccess();
            }
        });

        uparrow4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                imgw4.setImageResource(imgRes.get(Math.abs((cpt4+1)%imgRes.size())));
                cpt4 ++;
                isSuccess();
            }
        });


        downarrow4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                imgw4.setImageResource(imgRes.get(Math.abs((cpt4-1)%imgRes.size())));
                cpt4 --;
                isSuccess();
            }
        });

    }

    public void isSuccess(){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.s5);

        if(cpt4 == sol4 && cpt3 == sol3 && cpt2 == sol2 & cpt1==sol1){
            Toast.makeText(getApplicationContext(),"BRAVO !",Toast.LENGTH_LONG).show();
            imgFin.setVisibility(View.VISIBLE);
            resolved = true;
            mp.start();
        }
    }
}
