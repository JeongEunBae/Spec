package com.example.mobileproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class KwangApplicationDetailsMain extends AppCompatActivity {
    private ListView listview;
    private KwangApplicationDetailsAdapter adapter;
    private List<String> arrlist1 = new ArrayList<>();
    private List<String> arrlist2 = new ArrayList<>();
    private List<String> arrlist3 = new ArrayList<>();
    private List<String> arrlist4 = new ArrayList<>();
    private List<String> arrlist5 = new ArrayList<>();
    private List<String> arrlist6 = new ArrayList<>();
    private String[] title = {"공모전 주제", "공모전 주제", "공모전 주제", "공모전 주제"};
    private String[] date = {"2020/09", "2020/05", "2020/03", "2020/02"};
    private String[] position = {"부산", "부산", "창원", "울산"};
    private String[] type = {"자유과제 마감 (6명)", "개인 예비접수 (1명)", "개인 예비접수 (1명)", "자유과제 마감(6명)"};
    private String[] payment = {"대기자", "미결제 / 대기자", "대기자", "대기자"};
    private String[] state = {"본 모임은 진행 중입니다.", "본 모임은 진행 중입니다.", "본 모임은 종료 됐습니다.", "본 모임은 종료 됐습니다."};
    private String str;
    private Spinner spinner;
    private TextView titles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kwang_application_details);
        titles = (TextView) findViewById(R.id.tv0);
        spinner = (Spinner) findViewById(R.id.spinner);
        final String[] item = {"최신순"};
        ArrayAdapter<String> adapters = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, item);
        spinner.setAdapter(adapters);

        adapter = new KwangApplicationDetailsAdapter(getApplicationContext());
        listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);
        //List<String> list = new ArrayList<>();
        for (int i = 0; i < title.length; i++) {
            arrlist1.add(title[i]);
            arrlist2.add(date[i]);
            arrlist3.add(position[i]);
            arrlist4.add(type[i]);
            arrlist5.add(payment[i]);
            arrlist6.add(state[i]);
            adapter.addItem(arrlist1.get(i), arrlist2.get(i), arrlist3.get(i), arrlist4.get(i), arrlist5.get(i), arrlist6.get(i));
        }
        adapter.notifyDataSetChanged();
        str = "총 "+title.length+"개의 모임";
        KwangApplicationDetailsItem a = new KwangApplicationDetailsItem();
        titles.setText(str);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }

}

