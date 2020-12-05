package com.example.mobileproject;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class RecentLookUpList extends Fragment {
    //--최근본모임--
    private ListView listview;
    private CustomAdapter adapter;
    private int[] img = {R.drawable.k1, R.drawable.k2, R.drawable.k3, R.drawable.k4}; //공모전 그림
    private String[] Title = {"공모전 1", "공모전 2", "공모전 3", "공모전 4"}; //공모전 이름
    private String[] Date = {"2020/2", "2020/4", "2020/6", "2020/7"}; //공모전 날짜
    private String[] Explanation = {"공모전 1 예시입니다.", "공모전 2 예시입니다.", "공모전 3 예시입니다.", "공모전 4 예시입니다."}; //공모전 설명
    //--최근본모임 끝--
    public RecentLookUpList(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_recent, container, false);

        ActionBar actionBar = ((MainActivity)getActivity()).getSupportActionBar();
        actionBar.setTitle("최근 본 모임");
        actionBar.setDisplayHomeAsUpEnabled(true); //뒤로가기버튼생성

        adapter = new CustomAdapter(); //어댑터 생성
        listview = (ListView) view.findViewById(R.id.listV1); //화면에 보여줄 리스트 뷰
        listview.setAdapter(adapter); //데이터 추가 후 어댑터를 리스트에 적용

        for(int i = 0; i<Title.length; i++){ //타이틀 갯수가 곧 모든 데이터 하나 하나의 갯수(타이틀 갯수가 4개면 다른 데이터 갯수도 4개)
            //이미지 갯수 만큼 데이터를 리스트에 추가해서 출력
            adapter.addList(ContextCompat.getDrawable(this.getContext(), img[i]),
                    Title[i], Date[i], Explanation[i]);
        }
        adapter.notifyDataSetChanged();

        return view;
    }
}
