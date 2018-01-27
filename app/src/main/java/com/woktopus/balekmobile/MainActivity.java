package com.woktopus.balekmobile;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button takin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        takin = findViewById(R.id.taquin);
        final Button simon = findViewById(R.id.simon);
        final Button code2 = findViewById(R.id.code2);

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
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(TakinActivity.resolved) {
            takin.setBackgroundColor(Color.BLUE);
        }
    }
}
