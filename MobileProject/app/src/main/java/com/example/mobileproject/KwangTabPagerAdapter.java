package com.example.mobileproject;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class KwangTabPagerAdapter extends FragmentPagerAdapter {
    private  int tabCount;

    public KwangTabPagerAdapter(FragmentManager fm, int tabCount){
        super(fm);
        this.tabCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Kwang_steamed_first Fragment1 = new Kwang_steamed_first();
                return Fragment1;
            case 1:
                Kwang_steamed_second Fragment2 = new Kwang_steamed_second();
                return Fragment2;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}