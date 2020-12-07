package com.example.mobileproject;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabPagerAdapter1 extends FragmentPagerAdapter {

    private  int tabCount;

    public TabPagerAdapter1(FragmentManager fm, int tabCount){
        super(fm);
        this.tabCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                first_fragment1 Fragment1 = new first_fragment1();
                return Fragment1;
            case 1:
                second_fragment2 Fragment2 = new second_fragment2();
                return Fragment2;
            case 2:
                third_fragment Fragment3 = new third_fragment();
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
