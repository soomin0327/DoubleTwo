package com.example.dsm2016.doubletwo.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dsm2016.doubletwo.Activity.SignupActivity;
import com.example.dsm2016.doubletwo.R;

import org.w3c.dom.Text;

public class SignupFragment3 extends Fragment {

    private TextInputEditText nameEditText, birthEditText, phoneNumEditText, genderEditText;
    private Button nextBtn3;
    private String sName, sBirth, sPhoneNum, sGender;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signup3, container, false);

        nameEditText = (TextInputEditText) view.findViewById(R.id.signupNameEditText);
        birthEditText = (TextInputEditText) view.findViewById(R.id.signupBirthEditText);
        phoneNumEditText = (TextInputEditText) view.findViewById(R.id.signupPhoneNumEditText);
        genderEditText = (TextInputEditText) view.findViewById(R.id.signupGenderEditText) ;
        nextBtn3 = (Button) view.findViewById(R.id.signupNextBtn3);

        sName = nameEditText.getText().toString();
        sBirth = birthEditText.getText().toString();
        sPhoneNum = phoneNumEditText.getText().toString();
        sGender = genderEditText.getText().toString();

        nextBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sName != null && sBirth != null && sPhoneNum != null && sGender != null) {
                    ((SignupActivity) getActivity()).setCurrentItem(3, true);
                } else {
                    //dialog
                }
            }
        });

        return view;
    }
}
