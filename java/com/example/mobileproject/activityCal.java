package com.example.mobileproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class activityCal extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    private DrawerLayout drawerLayout;
    private View drawerView;
    private Button btn1, btn2, btn3, btn4, btn5, btn6;
    private KwangInterested frag1;
    private NoticeList frag2;
    private RecentLookUpList frag3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_item);
        drawerView = findViewById(R.id.drawer);

        frag1 = new KwangInterested();
        frag2 = new NoticeList();
        frag3 = new RecentLookUpList();
        ImageButton btn = (ImageButton)findViewById(R.id.btn_open);
        Button btn1 = (Button)findViewById(R.id.nav_btn1);
        Button btn2 = (Button)findViewById(R.id.nav_btn2);
        Button btn3 = (Button)findViewById(R.id.nav_btn3);
        Button btn4 = (Button)findViewById(R.id.nav_btn4);
        Button btn5 = (Button)findViewById(R.id.nav_btn5);
        Button btn6 = (Button)findViewById(R.id.nav_btn6);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChangeInformation.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), applyMoim.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KwangSteamed.class);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Test.class);
                intent.putExtra("1", 1);
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Test.class);
                intent.putExtra("2", 2);
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Test.class);
                intent.putExtra("3", 3);
                startActivity(intent);
            }
        });







        ImageButton calbtn = (ImageButton) findViewById(R.id.calbtn);
        calbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), activityCal.class);

                startActivity(intent);
            }

        });

        ImageButton checkbtn = (ImageButton) findViewById(R.id.checkbtn);
        checkbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), DetailActivityActivity.class);

                startActivity(intent);
            }

        });


        ImageButton bulbbtn = (ImageButton) findViewById(R.id.bulbbtn);
        bulbbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), search_activity.class);

                startActivity(intent);
            }

        });

        ImageButton searchbtn = (ImageButton) findViewById(R.id.searchbtn);
        searchbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), KwangSearchMain.class);

                startActivity(intent);
            }

        });

        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new FABClickListener());


    }



    class FABClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), applyCal.class);

            startActivity(intent);
        }
    }

}
