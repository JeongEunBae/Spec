package com.example.mobileproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class search_activity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_activity);

        ImageButton imgbtn = (ImageButton) findViewById(R.id.first);
        imgbtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

                Intent intent = new Intent(getApplicationContext(), DetailActivityActivity.class);

                startActivity(intent);
            }

        });

        ImageButton inMoim = (ImageButton) findViewById(R.id.inMoim);
        inMoim.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

                Intent intent = new Intent(getApplicationContext(), indetailactivity.class);

                startActivity(intent);
            }

        });

        ImageButton calbtn = (ImageButton) findViewById(R.id.calbtn);
        calbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), activityCal.class);

                startActivity(intent);
            }

        });

        ImageButton checkbtn = (ImageButton) findViewById(R.id.checkbtn);
        checkbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), DetailActivityActivity.class);

                startActivity(intent);
            }

        });


        ImageButton bulbbtn = (ImageButton) findViewById(R.id.bulbbtn);
        bulbbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), search_activity.class);

                startActivity(intent);
            }

        });

        ImageButton searchbtn = (ImageButton) findViewById(R.id.searchbtn);
        searchbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), KwangSearchMain.class);

                startActivity(intent);
            }

        });

    }




}
