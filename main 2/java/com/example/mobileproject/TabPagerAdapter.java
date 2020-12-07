package com.example.mobileproject;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;




import java.util.ArrayList;

public class TabPagerAdapter extends FragmentPagerAdapter {
    private  int tabCount;

    public TabPagerAdapter(FragmentManager fm, int tabCount){
        super(fm);
        this.tabCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                first_fragment Fragment1 = new first_fragment();
                return Fragment1;
            case 1:
                second_fragment Fragment2 = new second_fragment();
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
