package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class RecentPlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent_play);

        ImageButton imgBack = (ImageButton) findViewById(R.id.iconback);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent imgBackIntent = new Intent(RecentPlayActivity.this, MainActivity.class);
                startActivity(imgBackIntent);
            }
        });
    }
}
