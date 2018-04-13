package com.example.dsm2016.doubletwo.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.dsm2016.doubletwo.Fragment.Signup1Fragment;
import com.example.dsm2016.doubletwo.R;

public class IntroActivity extends AppCompatActivity {

    private Button loginBtn, signupBtn;
    private BtnOnClickListener onClickListener;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        onClickListener = new BtnOnClickListener();
        loginBtn = (Button) findViewById(R.id.loginBtn);
        signupBtn = (Button) findViewById(R.id.signupBtn);

        loginBtn.setOnClickListener(onClickListener);

        signupBtn.setOnClickListener(onClickListener);
    }

    class BtnOnClickListener implements Button.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.loginBtn :
                    Intent toLogin = new Intent(IntroActivity.this, LoginActivity.class);
                    startActivity(toLogin);
                    break;

                case R.id.signupBtn :
                    Intent toSignup = new Intent(IntroActivity.this, Signup1Fragment.class);
                    startActivity(toSignup);
                    break;
            }
        }
    }
}
