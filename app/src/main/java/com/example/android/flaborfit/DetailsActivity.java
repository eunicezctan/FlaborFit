package com.example.android.flaborfit;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView exerciseText = (TextView) findViewById(R.id.exerciseText);
        ImageView exerciseImg = (ImageView) findViewById(R.id.exerciseImg);
        LinearLayout mainBG = (LinearLayout) findViewById(R.id.mainBG);

        String exerciseTitle = getIntent().getStringExtra(MainActivity.EXERCISE_ITEM_TITLE);
        exerciseText.setText(exerciseTitle);

        //Set image and background color according to the string pass in from MainActivity
        if(exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHTS)){
            exerciseImg.setImageDrawable(getResources().getDrawable(R.drawable.weight,getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#2ca5f5"));
        }

        else if(exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)){
            exerciseImg.setImageDrawable(getResources().getDrawable(R.drawable.lotus,getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#916bcd"));
        }

        else {
            exerciseImg.setImageDrawable(getResources().getDrawable(R.drawable.heart,getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#52ad56"));
        }

    }
}
