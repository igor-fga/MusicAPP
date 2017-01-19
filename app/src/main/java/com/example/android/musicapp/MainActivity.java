package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textMostPlayed = (TextView) findViewById(R.id.textView01);
        TextView textRecommend = (TextView) findViewById(R.id.textView02);
        TextView textRock = (TextView) findViewById(R.id.textView03);

        textMostPlayed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mPlayedIntent = new Intent(MainActivity.this, RecentPlayActivity.class);
                startActivity(mPlayedIntent);
            }
        });

        textRecommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent RecomIntent = new Intent(MainActivity.this, RecommendActivity.class);
                startActivity(RecomIntent);
            }
        });

        textRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RockIntent = new Intent(MainActivity.this, RockActivity.class);
                startActivity(RockIntent);
            }
        });
    }
}
