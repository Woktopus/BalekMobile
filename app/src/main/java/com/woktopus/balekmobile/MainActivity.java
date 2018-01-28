package com.woktopus.balekmobile;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button firstSouvenir;
    private Button takin;
    private Button simon;
    private Button code2;
    private Button missingWord;
    private Button figure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        takin = findViewById(R.id.taquin);
        simon = findViewById(R.id.simon);
        code2 = findViewById(R.id.code2);
        missingWord = findViewById(R.id.missing_word);
        figure = findViewById(R.id.figure);
        firstSouvenir = findViewById(R.id.first);

        simon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), SimonActivity.class);
                startActivity(intent);
            }
        });

        takin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), TakinActivity.class);
                startActivity(intent);
            }
        });

        code2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Code2Activity.class);
                startActivity(intent);
            }
        });

        missingWord.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MissingWordActivity.class);
                startActivity(intent);
            }
        });

        figure.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), FigureActivity.class);
                startActivity(intent);
            }
        });

        firstSouvenir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), FirstActivity.class);
                startActivity(intent);
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onStart() {
        super.onStart();

        if(SimonActivity.resolved) {
            simon.setBackground(ContextCompat.getDrawable(this, R.drawable.rune_enabled));
        }

        if(TakinActivity.resolved) {
            takin.setBackground(ContextCompat.getDrawable(this, R.drawable.rune_enabled));
        }

        if(Code2Activity.resolved) {
            code2.setBackground(ContextCompat.getDrawable(this, R.drawable.rune_enabled));
        }

        if(MissingWordActivity.resolved) {
            missingWord.setBackground(ContextCompat.getDrawable(this, R.drawable.rune_enabled));
        }

        if(FigureActivity.resolved) {
            figure.setBackground(ContextCompat.getDrawable(this, R.drawable.rune_enabled));
        }
    }
}
