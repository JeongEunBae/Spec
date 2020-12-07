package com.example.mobileproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

//activity_notice 어뎁터
public class CustomAdapter2 extends BaseAdapter {
    private Context context;
    private ArrayList<NoticeItem> data = new ArrayList<>();//ArrayList 객체 생성


    public CustomAdapter2(Context context) {
        this.context = context;
    }


    //ListView 그리는 함수
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        //position는 ListView의 위치

        int pos = position; //ListView 위치 기억 (첫 번째는 pos=0)
        Context context = parent.getContext();

        if (convertView == null) {
            //LayoutInflater 생성
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_notice, parent, false);
        }
        //표시할 이미지 및 텍스트를 변수에 저장
        TextView title = (TextView) convertView.findViewById(R.id.tv1);
        TextView state = (TextView) convertView.findViewById(R.id.btn1);
        TextView date = (TextView) convertView.findViewById(R.id.tv2);


        NoticeItem listViewItem = data.get(position);

        //아이템 내 각 위젯에 데이터 반영
        title.setText(listViewItem.getTitle());
        state.setText(listViewItem.getState());
        date.setText(listViewItem.getDate());

        //리스트뷰 위젯 클릭이벤트
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast myToast = Toast.makeText(v.getContext().getApplicationContext(), list2., Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(v.getContext(), NoticeContexts.class);
                //v.getContext().startActivity(intent);
            }
        });
        return convertView;
    }
    public void addList2(String title, String state, String date) { //리스트에 데이터 추가
        NoticeItem item2 = new NoticeItem();
        item2.setTitle(title);
        item2.setState(state);
        item2.setDate(date);

        data.add(item2);
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}