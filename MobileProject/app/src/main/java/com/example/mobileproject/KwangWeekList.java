package com.example.mobileproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class KwangWeekList extends Fragment {
    //날짜 선택 시 리스트 뜨게 할 것
    private View view;
    private ListView listview;
    private KwangWeekListAdapter adapter;
    private String[] Title = {"모바일 수업", "객체 수업", "못 자는 날", "방콕하기"}; //활동 명
    private String[] Date = {"12월 7일", "12월 7일", "12월 7일", "12월 7일"}; //날짜 받아서 넣기

    public KwangWeekList() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.activity_weekly, container, false);

        adapter = new KwangWeekListAdapter(getActivity().getApplicationContext()); //어댑터 생성
        listview = (ListView) view.findViewById(R.id.list); //화면에 보여줄 리스트 뷰
        listview.setAdapter(adapter); //어댑터를 리스트에 적용

        for (int i = 0; i < Title.length; i++) { //타이틀 갯수가 곧 모든 데이터 하나 하나의 갯수(타이틀 갯수가 4개면 다른 데이터 갯수도 4개)
            //이미지 갯수 만큼 데이터를 리스트에 추가해서 출력
            adapter.addItem(Title[i], Date[i]);
        }
        adapter.notifyDataSetChanged();
        //getActivity() 프래그먼트에서 컨텍스트 받아오는 것
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            }
        });
        return view;
    }

}