package com.example.mobileproject;

import android.os.Bundle;
import android.view.Window;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


public class search_activity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_activity);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
    }


}
