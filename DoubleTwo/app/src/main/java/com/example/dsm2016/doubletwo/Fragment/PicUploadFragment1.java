package com.example.dsm2016.doubletwo.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dsm2016.doubletwo.Activity.PicUploadActivity;
import com.example.dsm2016.doubletwo.R;

public class PicUploadFragment1 extends Fragment {

    private Button nextBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pic_upload1, container, false);

        nextBtn = (Button) view.findViewById(R.id.signupNextBtn5);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((PicUploadActivity)getActivity()).setCurrentItem(1, true);
            }
        });

        return view;
    }
}
