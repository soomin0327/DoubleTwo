package com.example.dsm2016.doubletwo.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.dsm2016.doubletwo.Activity.MainActivity;
import com.example.dsm2016.doubletwo.Activity.TMainActivity;
import com.example.dsm2016.doubletwo.CustomView.TMainCarouselLinearLayout;
import com.example.dsm2016.doubletwo.Fragment.TMainFragment;
import com.example.dsm2016.doubletwo.R;

public class TMainViewPagerAdapter extends FragmentPagerAdapter implements ViewPager.OnPageChangeListener {

    public final static float BIG_SCALE = 1.0f;
    public final static float SMALL_SCALE = 0.7f;
    public final static float DIFF_SCALE = BIG_SCALE - SMALL_SCALE;
    private TMainActivity context;
    private FragmentManager fragmentManager;
    private float scale;

    public TMainViewPagerAdapter(TMainActivity context, FragmentManager fm) {
        super(fm);
        this.fragmentManager = fm;
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        // make the first pager bigger than others
        try {
            if (position == context.FIRST_PAGE)
                scale = BIG_SCALE;
            else
                scale = SMALL_SCALE;

            position = position % context.count;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return (Fragment) TMainFragment.newInstance(context, position, scale);
    }

    @Override
    public int getCount() {
        int count = 0;
        try {
            count = TMainActivity.count * TMainActivity.LOOPS;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        try {
            if (positionOffset >= 0f && positionOffset <= 1f) {
                TMainCarouselLinearLayout cur = getRootView(position);
                TMainCarouselLinearLayout next = getRootView(position + 1);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @SuppressWarnings("ConstantConditions")
    private TMainCarouselLinearLayout getRootView(int position) {
        return (TMainCarouselLinearLayout) fragmentManager.findFragmentByTag(this.getFragmentTag(position))
                .getView().findViewById(R.id.root_container);
    }

    private String getFragmentTag(int position) {
        return "android:switcher:" + context.pager.getId() + ":" + position;
    }
}
