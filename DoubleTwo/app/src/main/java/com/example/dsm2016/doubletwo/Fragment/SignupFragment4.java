package com.example.dsm2016.doubletwo.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.dsm2016.doubletwo.Activity.PicUploadActivity;
import com.example.dsm2016.doubletwo.R;

public class SignupFragment4 extends Fragment {

    private Button nextBtn;
    private EditText pw1, pw2;
    private String sPw2, sPw1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signup4, container, false);

        pw1 = (EditText) view.findViewById(R.id.signupSetPw1);
        pw2 = (EditText) view.findViewById(R.id.signupSetPw2);
        nextBtn = (Button) view.findViewById(R.id.signupNextBtn4);

        sPw1 = pw1.getText().toString();
        sPw2 = pw2.getText().toString();

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toUploadPic = new Intent(getContext(), PicUploadActivity.class);

                if(sPw1 != null && sPw2 != null) {
                    getContext().startActivity(toUploadPic);
                    getActivity().finish();
                }
            }
        });

        return view;
    }
}
