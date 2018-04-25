package com.example.dsm2016.doubletwo.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;

import com.example.dsm2016.doubletwo.Adapter.TMainViewPagerAdapter;
import com.example.dsm2016.doubletwo.R;

public class TMainActivity extends AppCompatActivity {

    public final static int LOOPS = 1;
    private TMainViewPagerAdapter pagerAdapter;
    private TabLayout tabLayout;
    public ViewPager pager;
    public static int count = 5;
    public static int FIRST_PAGE = 5;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traveler_main);

        pager = (ViewPager) findViewById(R.id.tMainViewPager);
        tabLayout = (TabLayout) findViewById(R.id.tMainTabLayout);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int pageMargin = ((metrics.widthPixels / 8) * 2);

        for(int i = 0; i < count; i++)
            tabLayout.addTab(tabLayout.newTab());

        pager.setClipToPadding(false);
        pager.setPadding(pageMargin,0,pageMargin,0);
        pager.setPageMargin(40);
        pagerAdapter = new TMainViewPagerAdapter(this, getSupportFragmentManager());
        pager.setAdapter(pagerAdapter);
        pagerAdapter.notifyDataSetChanged();
        pager.addOnPageChangeListener(pagerAdapter);
        pager.setCurrentItem(2);
        pager.setOffscreenPageLimit(3);

        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

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
