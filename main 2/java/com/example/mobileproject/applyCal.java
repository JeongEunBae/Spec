package com.example.mobileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class applyCal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply_cal);
        ImageButton calbtn = (ImageButton) findViewById(R.id.calbtn);
        calbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), activityCal.class);

                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

                startActivity(intent);
            }

        });

        ImageButton closebtn = (ImageButton) findViewById(R.id.closebtn);
        closebtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                finish();
            }

        });

        Button checkbtn1 = (Button) findViewById(R.id.applyActivity);
        checkbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText)findViewById(R.id.inputTitle);
                String checkt = editText.getText().toString();
                Toast.makeText(getApplicationContext(), checkt, Toast.LENGTH_LONG).show();
            }
        });

        ImageButton checkbtn = (ImageButton) findViewById(R.id.checkbtn);
        checkbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), weekly.class);

                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

                startActivity(intent);
            }

        });


        ImageButton bulbbtn = (ImageButton) findViewById(R.id.bulbbtn);
        bulbbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), search_activity.class);

                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

                startActivity(intent);
            }

        });

        ImageButton searchbtn = (ImageButton) findViewById(R.id.searchbtn);
        searchbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), KwangSearchMain.class);

                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

                startActivity(intent);
            }

        });


    }
}