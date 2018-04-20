package com.example.dsm2016.doubletwo.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dsm2016.doubletwo.Activity.PicUploadActivity;
import com.example.dsm2016.doubletwo.R;

public class SignupFragment4 extends Fragment {

    private Button nextBtn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signup4, container, false);

        nextBtn = (Button) view.findViewById(R.id.signupNextBtn4);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toUploadPic = new Intent(getContext(), PicUploadActivity.class);
                getContext().startActivity(toUploadPic);
                //종료하기
            }
        });

        return view;
    }
}
