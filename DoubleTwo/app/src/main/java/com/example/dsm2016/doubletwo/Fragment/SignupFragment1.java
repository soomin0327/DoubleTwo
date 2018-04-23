package com.example.dsm2016.doubletwo.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatCheckBox;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.dsm2016.doubletwo.Activity.SignupActivity;
import com.example.dsm2016.doubletwo.R;

public class SignupFragment1 extends Fragment {

    private AppCompatCheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    private Button nextBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signup1, container, false);

        checkBox1 = (AppCompatCheckBox) view.findViewById(R.id.signupRule1);
        checkBox2 = (AppCompatCheckBox) view.findViewById(R.id.signupRule2);
        checkBox3 = (AppCompatCheckBox) view.findViewById(R.id.signupRule3);
        checkBox4 = (AppCompatCheckBox) view.findViewById(R.id.signupRule4);
        nextBtn = (Button) view.findViewById(R.id.signupNextBtn1);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox1.isChecked() && checkBox2.isChecked() && checkBox3.isChecked() && checkBox4.isChecked()) {
                    ((SignupActivity)getActivity()).setCurrentItem(1, true);
                } else {
                    Toast.makeText(getContext(), "모든 항목에 동의해 주세요", Toast.LENGTH_SHORT);
                }
            }
        });

        return view;
    }
}
