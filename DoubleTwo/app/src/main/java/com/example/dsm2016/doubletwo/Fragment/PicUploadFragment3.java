package com.example.dsm2016.doubletwo.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dsm2016.doubletwo.Activity.LoginActivity;
import com.example.dsm2016.doubletwo.Activity.PicUploadActivity;
import com.example.dsm2016.doubletwo.Activity.SignupActivity;
import com.example.dsm2016.doubletwo.R;

public class PicUploadFragment3 extends Fragment {

    static final int DELAY_SECOND = 3000;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pic_upload3, container, false);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getContext(), LoginActivity.class));
                getActivity().finish();
            }
        }, DELAY_SECOND);

        return view;
    }
}
