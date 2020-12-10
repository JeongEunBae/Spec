package com.example.mobileproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class KwangApplicationDetailsAdapter extends BaseAdapter {

    private Context mContext;
    private List<KwangApplicationDetailsItem> mData = new ArrayList<>();


    public KwangApplicationDetailsAdapter(Context context) {
        this.mContext = context;
    }


    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //int pos = position; //ListView 위치 기억 (첫 번째는 pos=0)
        Context context = parent.getContext();

        if (convertView == null) {
            //LayoutInflater 생성
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.kwang_application_details_item, parent, false);
        }
        //표시할 이미지 및 텍스트를 변수에 저장
        TextView title = (TextView) convertView.findViewById(R.id.tv1);
        TextView date = (TextView) convertView.findViewById(R.id.tv2);
        TextView pos = (TextView) convertView.findViewById(R.id.tv3);
        TextView type = (TextView) convertView.findViewById(R.id.tv4);
        TextView payment = (TextView) convertView.findViewById(R.id.tv5);
        TextView state = (TextView) convertView.findViewById(R.id.tv6);


        KwangApplicationDetailsItem listViewItem = mData.get(position);

        //아이템 내 각 위젯에 데이터 반영
        title.setText(listViewItem.getTitle());
        date.setText(listViewItem.getDate());
        pos.setText(listViewItem.getPositision());
        type.setText(listViewItem.getType());
        payment.setText(listViewItem.getPayment());
        state.setText(listViewItem.getState());

        //리스트뷰 위젯 클릭이벤트
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return convertView;
    }
    public void addItem(String title, String date, String pos, String type, String payment, String state){
        KwangApplicationDetailsItem item = new KwangApplicationDetailsItem();
        item.setTitle(title);
        item.setDate(date);
        item.setPositision(pos);
        item.setType(type);
        item.setPayment(payment);
        item.setState(state);

        mData.add(item);
    }
}
