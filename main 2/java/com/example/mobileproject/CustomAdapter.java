package com.example.mobileproject;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
//recentlookup 어뎁터
public class CustomAdapter extends BaseAdapter {
    private ArrayList<RecentItem> list = new ArrayList<>(); //ArrayList 객체 생성
    public void CustomAdapter() { //생성자
    }

    public void addList(Drawable icon, String title, String date, String exp) { //리스트에 데이터 추가
        RecentItem item = new RecentItem();

        item.setImg(icon);
        item.setTitle(title);
        item.setDate(date);
        item.setExplanation(exp);
        list.add(item);
    }

    //ListView 그리는 함수
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //position는 ListView의 위치
        final int pos = position; //ListView 위치 기억 (첫 번째는 pos=0)
        final Context context = parent.getContext();

        if (convertView == null) {
            //LayoutInflater 생성
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_recent, parent, false);
        }
        //표시할 이미지 및 텍스트를 변수에 저장
        ImageView image = (ImageView) convertView.findViewById(R.id.iv1);
        TextView title = (TextView) convertView.findViewById(R.id.tv1);
        TextView date = (TextView) convertView.findViewById(R.id.tv2);
        TextView explanation = (TextView) convertView.findViewById(R.id.tv3);

        RecentItem listViewItem = list.get(position);

        //아이템 내 각 위젯에 데이터 반영
        image.setImageDrawable(listViewItem.getImg());
        title.setText(listViewItem.getTitle());
        date.setText(listViewItem.getDate());
        //explanation.setText(listViewItem.getExplanation());

        //리스트뷰 클릭이벤트
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return convertView;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}

