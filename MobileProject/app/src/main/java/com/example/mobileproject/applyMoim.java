package com.example.mobileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class applyMoim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply_moim);



        ImageButton calbtn = (ImageButton) findViewById(R.id.calbtn);
        calbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), activityCal.class);

                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
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

        Button doublecheck = (Button) findViewById(R.id.doublecheck);

        EditText email = (EditText) findViewById(R.id.addr);
        String checkMail = email.getText().toString();


        searchbtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

                if(email.getText().toString().equals("sjrndnfl@naver.com")){
                    Toast.makeText(getApplicationContext(), "중복된 메일입니다", Toast.LENGTH_SHORT);

                }else{
                    Toast.makeText(getApplicationContext(), "중복 확인 되었습니다.", Toast.LENGTH_SHORT);
                }


            }


        });

        Button finish = (Button) findViewById(R.id.btn_save);
        finish.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Toast.makeText(getApplicationContext(), "저장되었습니다.", Toast.LENGTH_SHORT);
                finish();
            }




        });

    }
}
