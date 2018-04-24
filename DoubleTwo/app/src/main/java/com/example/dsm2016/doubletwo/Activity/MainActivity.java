package com.example.dsm2016.doubletwo.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.dsm2016.doubletwo.R;

public class MainActivity extends AppCompatActivity {

    private CardView asTravelerBtn, asGuideBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        asTravelerBtn = (CardView) findViewById(R.id.asTravelerBtn);
        asGuideBtn = (CardView) findViewById(R.id.asGuideBtn);

        asTravelerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TMainActivity.class));
            }
        });

        asGuideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
