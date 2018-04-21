package com.example.dsm2016.doubletwo.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.dsm2016.doubletwo.Adapter.PicUploadViewPagerAdapter;
import com.example.dsm2016.doubletwo.R;

public class PicUploadActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager pager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_upload);

        tabLayout = (TabLayout) findViewById(R.id.picUploeadTabLayout);
        pager = (ViewPager) findViewById(R.id.picUploadPager);

        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());

        final PicUploadViewPagerAdapter pagerAdapter = new PicUploadViewPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(pagerAdapter);
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            boolean lastPageChange = false;
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                int lastIdx = pagerAdapter.getCount() - 1;
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {
                int lastIdx = pagerAdapter.getCount() - 1;

                int curItem = pager.getCurrentItem();
                if(curItem==lastIdx /*&& lastPos==lastIdx*/  && state==1) {
                    lastPageChange = true;
                    startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                    finish();
                } else {
                    lastPageChange = false;
                }
            }
        });

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager.setCurrentItem(tab.getPosition());
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
