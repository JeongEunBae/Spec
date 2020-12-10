package com.example.mobileproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ActivityRegistration extends AppCompatActivity {
    private TextView stv1, stv2, stv3, stv4, stv5, stv6, stv7, stv8;

    private CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10, cb11, cb12;
    private EditText et1, et2, et3, et4, et5, et6, et7, et8, et9, et10, et11, et12, et13, et14;
    private Button btn1, btn2, btn3, btn4, btn5, btn6;
    private Spinner spinner;
    private ArrayAdapter<String> adapter; //스피너 어댑터
    private String str1, str2, str3, str4, str5, str6, str7, str8;// 텍스트뷰에 대한 문자열
    private String str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24; //Edit텍스트에 대한 문자열
    private List<String> resultCheck; //체크박스 값 저장


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_registration);
        getSupportActionBar().setTitle("활동 등록");

        init();  //객체 초기화

        //스피너 등록
        final String[] phone_item = {"010", "011", "016", "017", "019"};
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, phone_item);
        spinner.setAdapter(adapter);

        //체크박스 값 저장
        cb1.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox)v).isChecked()) {
                    // TODO : CheckBox is checked.
                    resultCheck.add(cb1.getText().toString());
                } else {
                    // TODO : CheckBox is unchecked.
                    resultCheck.remove(cb1.getText().toString());
                }
            }
        }) ;

        cb2.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox)v).isChecked()) {
                    // TODO : CheckBox is checked.
                    resultCheck.add(cb2.getText().toString());
                } else {
                    // TODO : CheckBox is unchecked.
                    resultCheck.remove(cb2.getText().toString());
                }
            }
        }) ;
        cb3.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox)v).isChecked()) {
                    // TODO : CheckBox is checked.
                    resultCheck.add(cb3.getText().toString());
                } else {
                    // TODO : CheckBox is unchecked.
                    resultCheck.remove(cb3.getText().toString());
                }
            }
        }) ;
        cb4.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox)v).isChecked()) {
                    // TODO : CheckBox is checked.
                    resultCheck.add(cb4.getText().toString());
                } else {
                    // TODO : CheckBox is unchecked.
                    resultCheck.remove(cb4.getText().toString());
                }
            }
        }) ;
        cb5.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox)v).isChecked()) {
                    // TODO : CheckBox is checked.
                    resultCheck.add(cb5.getText().toString());
                } else {
                    // TODO : CheckBox is unchecked.
                    resultCheck.remove(cb5.getText().toString());
                }
            }
        }) ;
        cb6.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox)v).isChecked()) {
                    // TODO : CheckBox is checked.
                    resultCheck.add(cb6.getText().toString());
                } else {
                    // TODO : CheckBox is unchecked.
                    resultCheck.remove(cb6.getText().toString());
                }
            }
        }) ;
        cb7.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox)v).isChecked()) {
                    // TODO : CheckBox is checked.
                    resultCheck.add(cb7.getText().toString());
                } else {
                    // TODO : CheckBox is unchecked.
                    resultCheck.remove(cb7.getText().toString());
                }
            }
        }) ;
        cb8.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox)v).isChecked()) {
                    // TODO : CheckBox is checked.
                    resultCheck.add(cb8.getText().toString());
                } else {
                    // TODO : CheckBox is unchecked.
                    resultCheck.remove(cb8.getText().toString());
                }
            }
        }) ;
        cb9.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox)v).isChecked()) {
                    // TODO : CheckBox is checked.
                    resultCheck.add(cb9.getText().toString());
                } else {
                    // TODO : CheckBox is unchecked.
                    resultCheck.remove(cb9.getText().toString());
                }
            }
        }) ;
        cb10.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox)v).isChecked()) {
                    // TODO : CheckBox is checked.
                    resultCheck.add(cb10.getText().toString());
                } else {
                    // TODO : CheckBox is unchecked.
                    resultCheck.remove(cb10.getText().toString());
                }
            }
        }) ;
        cb11.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox)v).isChecked()) {
                    // TODO : CheckBox is checked.
                    resultCheck.add(cb11.getText().toString());
                } else {
                    // TODO : CheckBox is unchecked.
                    resultCheck.remove(cb11.getText().toString());
                }
            }
        }) ;
        cb12.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox)v).isChecked()) {
                    // TODO : CheckBox is checked.
                    resultCheck.add(et4.getText().toString());
                } else {
                    // TODO : CheckBox is unchecked.
                    resultCheck.remove(et4.getText().toString());
                }
            }
        }) ;



        //텍스트 값 가져와서 색 바꿔서 다시 셋팅 (*색 입히기)
        getTextString();
        changeColor();

        //파일 첨부 부분 --할것
        String szSendFilePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/mkdir"; //파일경로를 sd카드 밑으로
        File f = new File(szSendFilePath);
        final Uri fileUri = Uri.fromFile(f);
        //f.getCanonicalPath();
        //FileOutputStream fos = FileOutputStream(szSendFilePath);
/*
        String szSendFilePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/test.jpg";
        File f = new File(szSendFilePath);
        if (!f.exists()) {
            Toast.makeText(this, "파일이 없습니다.", Toast.LENGTH_SHORT).show();
        }
        final Uri fileUri = Uri.fromFile(f);
*/


        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                intent.putExtra(Intent.EXTRA_STREAM, fileUri);
                startActivityForResult(intent,10);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                et8.setText(null);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /*Intent it = new Intent(Intent.ACTION_SEND);
                it.setType("plain/text");

                String[] tos = { "hoya4232@naver.com" };
                it.putExtra(Intent.EXTRA_STREAM, fileUri);
                startActivity(it);*/
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("*/*");
                intent.putExtra(Intent.EXTRA_STREAM, fileUri);
                startActivityForResult(intent,10);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                et9.setText(null);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //여기에 저장 및 업로드 작업 코드 작성

                //화면 전환
                Intent intent = new Intent(ActivityRegistration.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ActivityRegistration.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


    //텍스트 값 가져오기
    private void getTextString() {
        //색 바꿀 텍스트 뷰
        str1 = stv1.getText().toString();
        str2 = stv2.getText().toString();
        str3 = stv3.getText().toString();
        str4 = stv4.getText().toString();
        str5 = stv5.getText().toString();
        str6 = stv6.getText().toString();
        str7 = stv7.getText().toString();
        str8 = stv8.getText().toString();

        //Edit 텍스트
        str11 = et1.getText().toString();
        str12 = et2.getText().toString();
        str13 = et3.getText().toString();
        str14 = et4.getText().toString();
        str15 = et5.getText().toString();
        str16 = et6.getText().toString();
        str17 = et7.getText().toString();
        str18 = et8.getText().toString(); //경로?
        str19 = et9.getText().toString(); //경로?
        str20 = et10.getText().toString();
        str21 = et11.getText().toString();
        str22 = et12.getText().toString();
        str23 = et13.getText().toString();
        str24 = et14.getText().toString(); //가격
    }

    //색바꾸기
    private void changeColor() {
        SpannableStringBuilder ssb1 = new SpannableStringBuilder(str1);
        ssb1.setSpan(new ForegroundColorSpan(Color.parseColor("#f00000")), 3, 4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        stv1.setText(ssb1);

        SpannableStringBuilder ssb2 = new SpannableStringBuilder(str2);
        ssb2.setSpan(new ForegroundColorSpan(Color.parseColor("#f00000")), 3, 4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        stv2.setText(ssb2);

        SpannableStringBuilder ssb3 = new SpannableStringBuilder(str3);
        ssb3.setSpan(new ForegroundColorSpan(Color.parseColor("#f00000")), 3, 4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        stv3.setText(ssb3);

        SpannableStringBuilder ssb4 = new SpannableStringBuilder(str4);
        ssb4.setSpan(new ForegroundColorSpan(Color.parseColor("#f00000")), 5, 6, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        stv4.setText(ssb4);

        SpannableStringBuilder ssb5 = new SpannableStringBuilder(str5);
        ssb5.setSpan(new ForegroundColorSpan(Color.parseColor("#f00000")), 5, 6, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        stv5.setText(ssb5);

        SpannableStringBuilder ssb6 = new SpannableStringBuilder(str6);
        ssb6.setSpan(new ForegroundColorSpan(Color.parseColor("#f00000")), 2, 3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        stv6.setText(ssb6);

        SpannableStringBuilder ssb7 = new SpannableStringBuilder(str7);
        ssb7.setSpan(new ForegroundColorSpan(Color.parseColor("#f00000")), 3, 4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        stv7.setText(ssb7);

        SpannableStringBuilder ssb8 = new SpannableStringBuilder(str8);
        ssb8.setSpan(new ForegroundColorSpan(Color.parseColor("#f00000")), 3, 4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        stv8.setText(ssb8);
    }

    //객체 초기화
    private void init() {
        stv1 = (TextView) findViewById(R.id.stv1);
        stv2 = (TextView) findViewById(R.id.stv2);
        stv3 = (TextView) findViewById(R.id.stv3);
        stv4 = (TextView) findViewById(R.id.stv4);
        stv5 = (TextView) findViewById(R.id.stv5);
        stv6 = (TextView) findViewById(R.id.stv6);
        stv7 = (TextView) findViewById(R.id.stv7);
        stv8 = (TextView) findViewById(R.id.stv8);

        cb1 = (CheckBox)findViewById(R.id.check1);
        cb2 = (CheckBox)findViewById(R.id.check2);
        cb3 = (CheckBox)findViewById(R.id.check3);
        cb4 = (CheckBox)findViewById(R.id.check4);
        cb5 = (CheckBox)findViewById(R.id.check5);
        cb6 = (CheckBox)findViewById(R.id.check6);
        cb7 = (CheckBox)findViewById(R.id.check7);
        cb8 = (CheckBox)findViewById(R.id.check8);
        cb9 = (CheckBox)findViewById(R.id.check9);
        cb10 = (CheckBox)findViewById(R.id.check10);
        cb11 = (CheckBox)findViewById(R.id.check11);
        cb12 = (CheckBox)findViewById(R.id.check12);

        et1 = (EditText)findViewById(R.id.tv_activity);
        et2 = (EditText)findViewById(R.id.tv_organizer1);
        et3 = (EditText)findViewById(R.id.tv_organizer2);
        et4 = (EditText)findViewById(R.id.tv_other);
        et5 = (EditText)findViewById(R.id.tv_date1);
        et6 = (EditText)findViewById(R.id.tv_date2);
        et7 = (EditText)findViewById(R.id.tv_contents);
        et8 = (EditText)findViewById(R.id.tv_post); //경로?
        et9 = (EditText)findViewById(R.id.tv_attach); //경로?
        et10 = (EditText)findViewById(R.id.tv_manager);
        et11 = (EditText)findViewById(R.id.tv_homepage);
        et12 = (EditText)findViewById(R.id.tv_phone1);
        et13 = (EditText)findViewById(R.id.tv_phone2);
        et14 = (EditText)findViewById(R.id.tv_price);

        btn1 = (Button)findViewById(R.id.btn_post1);
        btn2 = (Button)findViewById(R.id.btn_post2);
        btn3 = (Button)findViewById(R.id.btn_attach1);
        btn4 = (Button)findViewById(R.id.btn_attach2);
        btn5 = (Button)findViewById(R.id.btn_save);
        btn6 = (Button)findViewById(R.id.btn_cancle);

        btn1 = findViewById(R.id.btn_post1);
        btn2 = findViewById(R.id.btn_post2);
        btn3 = findViewById(R.id.btn_attach1);
        btn4 = findViewById(R.id.btn_attach2);
        btn5 = findViewById(R.id.btn_save);
        btn6 = findViewById(R.id.btn_cancle);

        resultCheck = new ArrayList<>();
        spinner = (Spinner) findViewById(R.id.phone_spinner);
    }
}



