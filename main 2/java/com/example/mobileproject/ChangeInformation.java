package com.example.mobileproject;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ChangeInformation extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changeinform);

        final String[] email_item ={"naver.com", "gamil.com", "hotmail.com",
                "nate.com", "kakao.com", "daum.net"};
        final String[] phone_item ={"010", "011", "016", "017", "019"};
        final String[] area_item ={"지역", "부산", "울산", "김해", "창원"};
        final String[] category_item ={"카테고리", "011", "016", "017", "019"};
        final String[] field_item ={"분야", "공모전", "봉사", "자격증"};
        final String[] job_item ={"직군","대학생", "취준생", "수험생", "회사원"};

        Spinner spinner = (Spinner)findViewById(R.id.email_spinner);
        Spinner spinner2 = (Spinner)findViewById(R.id.phone_spinner);
        Spinner spinner3 = (Spinner)findViewById(R.id.area_spinner);
        Spinner spinner4 = (Spinner)findViewById(R.id.category_spinner);
        Spinner spinner5 = (Spinner)findViewById(R.id.field_spinner);
        Spinner spinner6 = (Spinner)findViewById(R.id.job_spinner);

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, email_item);
        spinner.setAdapter(adapter);

        adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, phone_item);
        spinner2.setAdapter(adapter);

        adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, area_item);
        spinner3.setAdapter(adapter);

        adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, category_item);
        spinner4.setAdapter(adapter);

        adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, field_item);
        spinner5.setAdapter(adapter);

        adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, job_item);
        spinner6.setAdapter(adapter);
    }
}
