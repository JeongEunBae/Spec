package com.example.mobileproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Test extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    private DrawerLayout drawerLayout;
    private View drawerView;
    private Button btn1, btn2, btn3, btn4, btn5, btn6;
    // KwangInterested frag1;
    NoticeList frag2;
    RecentLookUpList frag3;
    //KwangWeekList frag4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_item);
        drawerView = findViewById(R.id.drawer);

        // frag1 = new KwangInterested();
        frag2 = new NoticeList();
        frag3 = new RecentLookUpList();
        //frag4 = new KwangWeekList();


        Button btn5 = (Button) findViewById(R.id.nav_btn5);
        Button btn6 = (Button) findViewById(R.id.nav_btn6);
        Intent intent2 = getIntent();
        if (intent2.getExtras().getInt("2") == 2) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

            transaction.replace(R.id.test, frag2);
            transaction.addToBackStack(null);
            transaction.commit(); //저장
        } else if (intent2.getExtras().getInt("3") == 3) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

            transaction.replace(R.id.test, frag3);
            transaction.addToBackStack(null);
            transaction.commit(); //저장
        }
        /*btn1 = (Button) findViewById(R.id.btn);
        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                transaction.replace(R.id.test, frag4);
                transaction.addToBackStack(null);
                transaction.commit(); //저장
            }
        });*/
    }
}
