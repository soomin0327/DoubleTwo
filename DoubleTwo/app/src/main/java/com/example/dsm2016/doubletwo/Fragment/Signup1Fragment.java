package com.example.dsm2016.doubletwo.Fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dsm2016.doubletwo.R;

public class Signup1Fragment extends Fragment {

    private Button signupNextBtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signup1, container, false);

        return view;
    }

    public Signup1Fragment(){}

    class onClickBtn implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.signupNextBtn :

                    break;
            }
        }
    }
}
