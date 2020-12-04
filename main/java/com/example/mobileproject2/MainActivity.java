package com.example.mobileproject2;

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

    private DrawerLayout drawerLayout;
    //private View drawerView;
    private NoticeList fragment5;
    private RecentLookUpList fragment6;
    Button btn1, btn2, btn3, btn4, btn5, btn6; //화면을 뿌릴 모든 자바 프로젝트에 복붙
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minjin);
        ActionBar ab = getSupportActionBar(); //액션바 객체 생성
        ab.setTitle("SPEC"); //타이틀 이름 변경

        fragment5 = new NoticeList();
        fragment6 = new RecentLookUpList();

        drawerLayout = (DrawerLayout)findViewById(R.id.drawer);
        btn1 = (Button)findViewById(R.id.nav_btn1);
        btn2 = (Button)findViewById(R.id.nav_btn2);
        btn3 = (Button)findViewById(R.id.nav_btn3);
        btn4 = (Button)findViewById(R.id.nav_btn4);
        btn5 = (Button)findViewById(R.id.nav_btn5);
        btn6 = (Button)findViewById(R.id.nav_btn6);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChangeInformation.class);
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                transaction.replace(R.id.frame, fragment5);
                transaction.addToBackStack(null);
                transaction.commit(); //저장
                drawerLayout.closeDrawers();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                transaction.replace(R.id.frame, fragment6);
                transaction.addToBackStack(null);
                transaction.commit(); //저장
                drawerLayout.closeDrawers();
            }
        });
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
