package com.woktopus.balekmobile;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MissingWordActivity extends AppCompatActivity {

    public static boolean resolved = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missing_word);

        final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.s2);


        Button tryBtn = findViewById(R.id.try_btn);
        final EditText inputText = findViewById(R.id.input_text);

        if(resolved) {
            TextView answer = findViewById(R.id.answer);
            answer.setVisibility(View.VISIBLE);
        }

        tryBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(inputText.getText().toString().trim().equals("disciple")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"BRAVO !", Toast.LENGTH_LONG);
                    toast.show();
                    resolved = true;
                    TextView answer = findViewById(R.id.answer);
                    answer.setVisibility(View.VISIBLE);
                    mp7.start();
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(),"MAUVAISE RÉPONSE !", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}
