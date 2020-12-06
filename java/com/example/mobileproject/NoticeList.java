package com.example.mobileproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;

public class NoticeList extends Fragment {
    //공지사항 리스트뷰
    private View view;
    private ListView listview;
    private CustomAdapter2 adapter;
    private String[] Title = {"공지 내용", "공지 내용", "공지 내용", "공지 내용"}; //공모전 이름
    private String[] State = {"휴무", "업데이트", "공지", "공지"}; //공모전 날짜
    private String[] Date = {"2020/2", "2020/4", "2020/9", "2020/11"}; //공모전 설명

    public NoticeList() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.activity_notice, container, false);
        adapter = new CustomAdapter2(getActivity().getApplicationContext()); //어댑터 생성
        listview = (ListView) view.findViewById(R.id.listV2); //화면에 보여줄 리스트 뷰
        listview.setAdapter(adapter); //어댑터를 리스트에 적용

        for (int i = 0; i < Title.length; i++) { //타이틀 갯수가 곧 모든 데이터 하나 하나의 갯수(타이틀 갯수가 4개면 다른 데이터 갯수도 4개)
            //이미지 갯수 만큼 데이터를 리스트에 추가해서 출력
            adapter.addList2(Title[i], State[i], Date[i]);
        }

        //getActivity() 프래그먼트에서 컨텍스트 받아오는 것
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int check = listview.getCheckedItemPosition();
                //Toast.makeText(getActivity().getApplicationContext(), "hi"+position, Toast.LENGTH_SHORT).show();
                Toast.makeText(view.getContext(), "hi"+position, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), NoticeContents.class);
                //intent.putExtra("img", Integer.toString(data.get(position).getProfile()));
                //intent.putExtra("Title", adapter.getItemId(position));
                //intent.putExtra("Date", Date);
                startActivity(intent);
                adapter.notifyDataSetChanged();
            }
        });
        return view;
    }

}