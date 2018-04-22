package com.example.dsm2016.doubletwo.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.dsm2016.doubletwo.R;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    private Button loginBtn;
    private EditText idEditText, pwEditText;
    private TextView forgetPwText;
    private String sId, sPw;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginBtn = (Button) findViewById(R.id.loginBtn);
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
                }
            }
        });

        forgetPwText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
