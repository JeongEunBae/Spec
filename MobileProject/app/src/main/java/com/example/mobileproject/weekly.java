package com.example.mobileproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.CalendarMode;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;

import java.util.Calendar;

import devs.mulham.horizontalcalendar.HorizontalCalendar;

public class weekly extends AppCompatActivity {
    private KwangWeekList frag4;

    private View view;
    private ListView listview;
    private KwangWeekListAdapter adapter;
    private String[] Title = {"모바일 수업", "객체 수업", "못 자는 날", "방콕하기"}; //활동 명
    private String[] Date = {"12월 7일", "12월 7일", "12월 7일", "12월 7일"}; //날짜 받아서 넣기


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly);

        //리스트뷰
        frag4 = new KwangWeekList();
        adapter = new KwangWeekListAdapter(getApplicationContext()); //어댑터 생성
        listview = (ListView) findViewById(R.id.list); //화면에 보여줄 리스트 뷰
        listview.setAdapter(adapter); //어댑터를 리스트에 적용

        for (int i = 0; i < Title.length; i++) { //타이틀 갯수가 곧 모든 데이터 하나 하나의 갯수(타이틀 갯수가 4개면 다른 데이터 갯수도 4개)
            //이미지 갯수 만큼 데이터를 리스트에 추가해서 출력
            adapter.addItem(Title[i], Date[i]);
        }
        adapter.notifyDataSetChanged();
        //여기까지


        MaterialCalendarView materialCalendarView = (MaterialCalendarView) findViewById(R.id.calendarView);

        materialCalendarView.state().edit()
                .setFirstDayOfWeek(Calendar.SUNDAY)
                .setMinimumDate(CalendarDay.from(2017, 0, 1))
                .setMaximumDate(CalendarDay.from(2030, 11, 31))
                .setCalendarDisplayMode(CalendarMode.WEEKS)
                .commit();

        materialCalendarView.addDecorators(
                new SundayDecorator(),
                new SaturdayDecorator(),
                new OnDayDecorator());

        ImageButton calbtn = (ImageButton) findViewById(R.id.calbtn);
        calbtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

                Intent intent = new Intent(getApplicationContext(), activityCal.class);

                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);


                startActivity(intent);
            }

        });

        ImageButton checkbtn = (ImageButton) findViewById(R.id.checkbtn);
        checkbtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

                Intent intent = new Intent(getApplicationContext(), weekly.class);

                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
            }

        });


        ImageButton bulbbtn = (ImageButton) findViewById(R.id.bulbbtn);
        bulbbtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

                Intent intent = new Intent(getApplicationContext(), search_activity.class);

                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

                startActivity(intent);
            }

        });

        ImageButton searchbtn = (ImageButton) findViewById(R.id.searchbtn);
        searchbtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

                Intent intent = new Intent(getApplicationContext(), KwangSearchMain.class);

                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

                startActivity(intent);
            }

        });
    }


}