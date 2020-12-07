package com.example.mobileproject;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mobileproject.KwangSearchListAdapter;

import java.util.ArrayList;
import java.util.List;

public class KwangSearchSecond extends Fragment {
    //공지사항 리스트뷰
    private View view;
    private ListView listview;
    private KwangSearchListAdapter adapter;
    private List<String> title = new ArrayList<>(); //공모전 이름
    private List<String> state = new ArrayList<>(); //공모전 날짜

    public KwangSearchSecond() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.kwang_search_first, container, false);

        adapter = new KwangSearchListAdapter(getActivity().getApplicationContext()); //어댑터 생성
        listview = (ListView) view.findViewById(R.id.list1); //화면에 보여줄 리스트 뷰
        listview.setAdapter(adapter); //어댑터를 리스트에 적용



        for (int i = 0; i < state.size(); i++) { //타이틀 갯수가 곧 모든 데이터 하나 하나의 갯수(타이틀 갯수가 4개면 다른 데이터 갯수도 4개)
            //이미지 갯수 만큼 데이터를 리스트에 추가해서 출력
            title.add("");

            adapter.addItem(title.get(i), state.get(i));
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
