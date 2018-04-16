package com.example.dsm2016.doubletwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class IntroActivity extends AppCompatActivity {
    Button signupBtn, loginBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);


    }

    class btnOnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.signupBtn :
                    Intent toSignup = new Intent(IntroActivity.this, SignupActivity.class);
                    startActivity(toSignup);
                case R.id.loginBtn :
                    Intent toLogin = new Intent(IntroActivity.this, LoginActivity.class);
                    startActivity(toLogin);
            }
        }
    }
}
