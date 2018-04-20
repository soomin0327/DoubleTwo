package com.example.dsm2016.doubletwo.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.dsm2016.doubletwo.Fragment.PicUploadFragment1;
import com.example.dsm2016.doubletwo.Fragment.PicUploadFragment2;
import com.example.dsm2016.doubletwo.Fragment.PicUploadFragment3;

public class PicUploadViewPagerAdapter extends FragmentStatePagerAdapter{

    final private int TAB_COUNT = 3;

    public PicUploadViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0 :
                PicUploadFragment1 fragment1 = new PicUploadFragment1();
                return fragment1;
            case 1 :
                PicUploadFragment2 fragment2 = new PicUploadFragment2();
                return fragment2;
            case 2 :
                PicUploadFragment3 fragment3 = new PicUploadFragment3();
                return fragment3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return TAB_COUNT;
    }
}
