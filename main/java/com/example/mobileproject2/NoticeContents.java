package com.example.mobileproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NoticeContents extends AppCompatActivity {
    TextView tv;
    TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ntice_contents);
        Intent getIntent = getIntent();
        tv = (TextView)findViewById(R.id.tv1);
        //tv2 = (TextView)findViewById(R.id.tv2);

        String value = getIntent.getStringExtra("Title");
        //String value2 = getIntent.getStringExtra("Date");

        tv.setText(value);
        //tv2.setText(value2);
    }
}