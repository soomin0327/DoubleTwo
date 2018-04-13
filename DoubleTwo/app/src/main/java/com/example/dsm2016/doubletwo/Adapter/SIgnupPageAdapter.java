package com.example.dsm2016.doubletwo.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.dsm2016.doubletwo.Fragment.Signup1Fragment;

public class SIgnupPageAdapter extends FragmentStatePagerAdapter {

    private static int PAGE_NUMBER = 7;

    public SIgnupPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0 : return new Signup1Fragment();
            case 1:
                break;
            case 2 :
                break;
            case 3 : break;
            case 4 : break;
            case 5 : break;
            case 6 : break;
            case 7 : break;
        }
    }

    @Override
    public int getCount() {
        return PAGE_NUMBER;
    }
}
