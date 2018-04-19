package com.example.dsm2016.doubletwo.Activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.dsm2016.doubletwo.Adapter.SignupViewPagerAdapter;
import com.example.dsm2016.doubletwo.Fragment.SignupFragment1;
import com.example.dsm2016.doubletwo.R;

import java.util.List;

public class SignupActivity extends AppCompatActivity {

    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        tabLayout = (TabLayout) findViewById(R.id.signupTabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("first"));
//        tabLayout.addTab(tabLayout.newTab().setText("two"));

        final ViewPager viewPager = (ViewPager) findViewById(R.id.signupPager);
        SignupViewPagerAdapter pagerAdapter = new SignupViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
