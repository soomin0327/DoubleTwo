package com.example.dsm2016.doubletwo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    static final int DELAY_SECOND = 3000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent toIntro = new Intent(SplashActivity.this, IntroActivity.class);
                startActivity(toIntro);
            }
        }, DELAY_SECOND);
    }
}
