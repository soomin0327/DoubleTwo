package com.example.dsm2016.doubletwo.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;

import com.example.dsm2016.doubletwo.Adapter.TMainViewPagerAdapter;
import com.example.dsm2016.doubletwo.R;

public class TMainActivity extends AppCompatActivity {

    public final static int LOOPS = 1;
    private TMainViewPagerAdapter adapter;
    public ViewPager pager;
    public static int count = 5;
    public static int FIRST_PAGE = 1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traveler_main);

        pager = (ViewPager) findViewById(R.id.tMainViewPager);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int pageMargin = ((metrics.widthPixels / 8) * 2);
        pager.setClipToPadding(false);
        pager.setPadding(pageMargin,0,pageMargin,0);
        pager.setPageMargin(40);

        adapter = new TMainViewPagerAdapter(this, getSupportFragmentManager());
        pager.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        pager.addOnPageChangeListener(adapter);

        pager.setCurrentItem(3);
        pager.setOffscreenPageLimit(3);

    }
}
