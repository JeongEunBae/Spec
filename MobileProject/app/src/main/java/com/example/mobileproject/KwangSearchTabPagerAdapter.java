package com.example.mobileproject;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class KwangSearchTabPagerAdapter extends FragmentPagerAdapter {
    private  int tabCount;

    public KwangSearchTabPagerAdapter(FragmentManager fm, int tabCount){
        super(fm);
        this.tabCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                KwangSearchFirst Fragment1 = new KwangSearchFirst();
                return Fragment1;
            case 1:
                KwangSearchSecond Fragment2 = new KwangSearchSecond();
                return Fragment2;
            case 2:
                KwangSearchThird Fragment3 = new KwangSearchThird();
                return Fragment3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}