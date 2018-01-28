package com.woktopus.balekmobile;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class FigureActivity extends AppCompatActivity {

    public static boolean resolved = false;

    public GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figure);

        if (resolved) {
            ImageView imgDone = findViewById(R.id.soluce_figure);
            imgDone.setVisibility(View.VISIBLE);
        }

        gridLayout = findViewById(R.id.grid_layout);
        for(int i=0; i< gridLayout.getChildCount(); i++ ) {
            ToggleButton toggle = (ToggleButton) gridLayout.getChildAt(i);
            toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        buttonView.setBackgroundColor(Color.rgb(71, 169, 255));
                    } else {
                        buttonView.setBackgroundColor(Color.rgb(127, 79, 38));
                    }
                    if(checkSuccess()) {
                        Toast toast = Toast.makeText(getApplicationContext(),"BRAVO !", Toast.LENGTH_LONG);
                        toast.show();
                        resolved = true;
                        ImageView imgDone = findViewById(R.id.soluce_figure);
                        Log.d("bug", "onCheckedChanged: "+imgDone);
                        imgDone.setVisibility(View.VISIBLE);
                    }
                }
            });
        }
    }

    protected boolean checkSuccess() {
        gridLayout = findViewById(R.id.grid_layout);
        for(int i=0; i< gridLayout.getChildCount(); i++ ) {
            ToggleButton toggle = (ToggleButton) gridLayout.getChildAt(i);
            if ((i == 6 || i == 8 || i == 11 || i == 13) && toggle.isChecked()) {
                return false;
            } else if(i >= 21 && i <= 23 && toggle.isChecked()) {
                return false;
            } else if ((i <= 5 || i == 7 || i == 9 || i == 10 || i == 12 || (i >= 14 && i <= 20) || i >= 24) && !toggle.isChecked()) {
                return false;
            }
        }
        return true;
    }
}
