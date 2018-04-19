package com.example.dsm2016.doubletwo.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

import com.example.dsm2016.doubletwo.Fragment.SignupFragment1;
import com.example.dsm2016.doubletwo.Fragment.SignupFragment2;
import com.example.dsm2016.doubletwo.Fragment.SignupFragment3;
import com.example.dsm2016.doubletwo.Fragment.SignupFragment4;

import java.util.ArrayList;
import java.util.List;

public class SignupViewPagerAdapter extends FragmentStatePagerAdapter {

    private int TAB_COUNT = 4;

    public SignupViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0 :
                SignupFragment1 fragment1 = new SignupFragment1();
                return fragment1;
            case 1 :
                SignupFragment2 fragment2 = new SignupFragment2();
                return fragment2;
            case 2:
                SignupFragment3 fragment3 = new SignupFragment3();
                return fragment3;
            case 3:
                SignupFragment4 fragment4 = new SignupFragment4();
                return fragment4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return TAB_COUNT;
    }
}
