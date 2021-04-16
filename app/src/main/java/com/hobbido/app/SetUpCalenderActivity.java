package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.adapter.CreateAdapter;
import com.hobbido.app.adapter.SetupCalenderAdapter;

import java.util.ArrayList;
import java.util.List;

public class SetUpCalenderActivity extends AppCompatActivity {
    ImageView back_img,menu_img;
    TextView tv_title,minimum_required,add_option,steps;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_up_calender);

        initView();
        toolbarSetUp();
        setOnMessageDataList();
    }
    private void initView() {
        recyclerView = findViewById(R.id.recyclerView);
        steps = findViewById(R.id.steps);
        add_option = findViewById(R.id.add_option);
        minimum_required = findViewById(R.id.minimum_required);
    }

    private void setOnMessageDataList() {
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            arrayList.add("sannju");
        }

        SetupCalenderAdapter adapter = new SetupCalenderAdapter(this, arrayList);
        GridLayoutManager manager = new GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }
    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        menu_img= findViewById(R.id.menu_img);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Setup Calender");
    }
}