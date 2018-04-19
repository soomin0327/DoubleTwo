package com.example.dsm2016.doubletwo.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.dsm2016.doubletwo.R;

public class IntroActivity extends AppCompatActivity{
    Button signupBtn, loginBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        signupBtn = (Button) findViewById(R.id.signupBtn);
        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("-------- signupBtn", "cp");
                Intent toSignup = new Intent(IntroActivity.this, SignupActivity.class);
                startActivity(toSignup);
                finish();
            }
        });
        loginBtn = (Button) findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("-------- loginBtn", "cp");
                Intent toLogin = new Intent(IntroActivity.this, LoginActivity.class);
                startActivity(toLogin);
                finish();
            }
        });
    }
}
