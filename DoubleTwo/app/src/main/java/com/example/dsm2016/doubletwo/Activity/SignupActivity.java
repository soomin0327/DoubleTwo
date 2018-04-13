package com.example.dsm2016.doubletwo.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.dsm2016.doubletwo.Adapter.SIgnupPageAdapter;
import com.example.dsm2016.doubletwo.R;

public class SignupActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        ViewPager viewPager = (ViewPager) findViewById(R.id.signupViewPager);

        viewPager.setAdapter(new SIgnupPageAdapter(getSupportFragmentManager()));
        viewPager.setCurrentItem(0);
    }
}
