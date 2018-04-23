package com.example.dsm2016.doubletwo.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

import com.example.dsm2016.doubletwo.R;

public class Choice4UserKindActivity extends AppCompatActivity {

    private CardView asTravelerBtn, asGuideBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_kind);

        asTravelerBtn = (CardView) findViewById(R.id.asTravelerBtn);
        asGuideBtn = (CardView) findViewById(R.id.asGuideBtn);

        asTravelerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
