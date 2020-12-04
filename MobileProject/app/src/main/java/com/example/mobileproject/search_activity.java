package com.example.mobileproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


public class search_activity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_activity);

        ImageButton imgbtn = (ImageButton) findViewById(R.id.first);
        imgbtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

                Intent intent = new Intent(getApplicationContext(), detail_askActivity.class);

                startActivity(intent);
            }

        });

    }


}
