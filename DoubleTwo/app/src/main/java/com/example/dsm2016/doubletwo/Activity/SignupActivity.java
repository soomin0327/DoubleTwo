package com.example.dsm2016.doubletwo.Activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.dsm2016.doubletwo.Adapter.SignupViewPagerAdapter;
import com.example.dsm2016.doubletwo.Fragment.SignupFragment1;
import com.example.dsm2016.doubletwo.R;

import java.util.List;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        ViewPager viewPager = (ViewPager) findViewById(R.id.signupPager);
        SignupViewPagerAdapter adapter = new SignupViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new SignupFragment1());

        TabLayout tabLayout = (TabLayout) findViewById(R.id.signupTabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
