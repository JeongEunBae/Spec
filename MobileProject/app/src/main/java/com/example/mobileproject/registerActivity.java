package com.example.mobileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class registerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

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

        Button saveBtn = (Button) findViewById(R.id.btn_save);
        saveBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                JSON();
            }
        });


    }


    public void JSON(){
        EditText activityname = (EditText)findViewById(R.id.tv_organizerplus1);
        String activityName = activityname.getText().toString();

        EditText activitypeople = (EditText)findViewById(R.id.tv_organizer1);
        String activityPeople = activitypeople.getText().toString();

        EditText activitycompany = (EditText)findViewById(R.id.tv_organizer2);
        String activityCompany = activitycompany.getText().toString();

        EditText startdate = (EditText)findViewById(R.id.tv_date1);
        String startDate = startdate.getText().toString();

        @SuppressLint("SimpleDateFormat") SimpleDateFormat startFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            Date starting = startFormat.parse(startDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        EditText enddate = (EditText)findViewById(R.id.tv_date2);
        String endDate = enddate.getText().toString();

        SimpleDateFormat endFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        try {
            Date ending = endFormat.parse(endDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        EditText content = (EditText)findViewById(R.id.tv_contents);
        String contents = content.getText().toString();

        EditText tv_price = (EditText)findViewById(R.id.tv_price);
        String tv_Price = tv_price.getText().toString();

        Integer Price = Integer.parseInt(tv_Price);

        EditText tv_post = (EditText)findViewById(R.id.tv_post);
        String tv_Post = tv_post.getText().toString();

        EditText tv_attach = (EditText)findViewById(R.id.tv_attach);
        String tv_Attach = tv_attach.getText().toString();

        EditText tv_manager = (EditText)findViewById(R.id.tv_manager);
        String tv_Manager = tv_manager.getText().toString();

        EditText tv_homepage = (EditText)findViewById(R.id.tv_homepage);
        String tv_Homepage = tv_attach.getText().toString();

        EditText tv_phone1 = (EditText)findViewById(R.id.tv_phone1);
        String tv_Phone = tv_phone1.getText().toString();

        Integer tvPhoneNum = Integer.parseInt(tv_Phone);

        JSONObject obj = new JSONObject();
        try {
            obj.put("activityName", activityName);
            obj.put("activityPeople", activityPeople);
            obj.put("activityCompany", activityCompany);
            obj.put("starting", "starting");
            obj.put("ending", "ending");
            obj.put("contents", contents);
            obj.put("tv_Price", Price);
            obj.put("tv_Post", tv_Post);
            obj.put("tv_Attach", tv_Attach);
            obj.put("tv_Manager", tv_Manager);
            obj.put("activityCompany", activityCompany);
            obj.put("tv_Homepage", tv_Homepage);
            obj.put("tvPhoneNum", tvPhoneNum);
            Toast.makeText(getApplicationContext(), obj.toString(), Toast.LENGTH_SHORT).show();

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}