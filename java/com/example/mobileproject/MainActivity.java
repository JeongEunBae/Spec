package com.example.mobileproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
    }
}

        /*drawer
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        Button draw_btn = (Button)findViewById(R.id.~); -> 주석 제거 후 햄버거 버튼에 연결
        draw_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(drawerView);
            }
        });*/
