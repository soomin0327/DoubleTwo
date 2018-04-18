package com.example.dsm2016.doubletwo.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.dsm2016.doubletwo.R;

public class IntroActivity extends AppCompatActivity implements View.OnClickListener{
    Button signupBtn, loginBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        signupBtn = (Button) findViewById(R.id.signupBtn);
        loginBtn = (Button) findViewById(R.id.loginBtn);
        signupBtn.setOnClickListener(this);
        loginBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.signupBtn :
                Toast.makeText(getApplicationContext(), "Signupbtn onClick", Toast.LENGTH_SHORT);
                Intent toSignup = new Intent(IntroActivity.this, SignupActivity.class);
                startActivity(toSignup);
            case R.id.loginBtn :
                Toast.makeText(getApplicationContext(), "Loginbtn onClick", Toast.LENGTH_SHORT);
                Intent toLogin = new Intent(IntroActivity.this, LoginActivity.class);
                startActivity(toLogin);
        }
    }
}
