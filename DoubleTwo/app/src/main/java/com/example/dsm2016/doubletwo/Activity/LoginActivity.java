package com.example.dsm2016.doubletwo.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dsm2016.doubletwo.R;

public class LoginActivity extends AppCompatActivity {

    private Button loginBtn;
    private EditText idEditText, pwEditText;
    private TextView forgetPwText;
    private String sId, sPw;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginBtn = (Button) findViewById(R.id.loginPageLoginButton);
        idEditText = (EditText) findViewById(R.id.idEditText);
        pwEditText = (EditText) findViewById(R.id.pwEditText);
        forgetPwText = (TextView) findViewById(R.id.forgetPwButton);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sId = idEditText.getText().toString();
                sPw = pwEditText.getText().toString();

                if(sId != null && sPw != null) {
                    //로그인 성공 페이지로 옮기기
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    finish();
                } else if(sId == null){
                    Toast.makeText(getApplicationContext(), "아이디를 입력하세요.", Toast.LENGTH_SHORT);
                } else  if (sPw == null) {
                    Toast.makeText(getApplicationContext(), "비밀번호를 입력하세요.", Toast.LENGTH_SHORT);
                } else {
                    Toast.makeText(getApplicationContext(), "아이디와 비밀번호를 입력하세요.", Toast.LENGTH_SHORT);
                }
            }
        });

        forgetPwText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, PwFindingActivity.class));
                finish();
            }
        });
    }
}
