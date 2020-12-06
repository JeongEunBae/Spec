package com.example.mobileproject;


import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

import com.google.android.material.tabs.TabLayout;

public class KwangSteamed extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Spinner spinner;
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kwang_steamed);

        spinner = (Spinner) findViewById(R.id.spinner);
        final String[] item = {"최신순"};
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, item);
        spinner.setAdapter(adapter);

        tabLayout = (TabLayout)findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText("모임"));
        tabLayout.addTab(tabLayout.newTab().setText("개설자"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager = (ViewPager)findViewById(R.id.pager);

        KwangTabPagerAdapter pagerAdapter = new KwangTabPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        ImageButton calbtn = (ImageButton) findViewById(R.id.calbtn);
        calbtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

                Intent intent = new Intent(getApplicationContext(), activityCal.class);

                startActivity(intent);
            }

        });

        ImageButton checkbtn = (ImageButton) findViewById(R.id.checkbtn);
        checkbtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

                Intent intent = new Intent(getApplicationContext(), DetailActivityActivity.class);

                startActivity(intent);
            }

        });


        ImageButton bulbbtn = (ImageButton) findViewById(R.id.bulbbtn);
        bulbbtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

                Intent intent = new Intent(getApplicationContext(), search_activity.class);

                startActivity(intent);
            }

        });

        ImageButton searchbtn = (ImageButton) findViewById(R.id.searchbtn);
        searchbtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

                Intent intent = new Intent(getApplicationContext(), DetailActivityActivity.class);

                startActivity(intent);
            }

        });
    }
}