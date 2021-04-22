package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.R;
import com.hobbido.app.adapter.RiverRaftingAdapter;

import java.util.ArrayList;
import java.util.List;

public class RiverRaftingActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView back_img,menu_img;
    TextView tv_title;
    RecyclerView recycleview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_river_rafting);
        initView();
        setOnMessageDataList();
        toolbar();
    }

    public void initView() {
        recycleview = findViewById(R.id.recycleview);
    }

    public void setOnMessageDataList() {
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            arrayList.add("sannju");
        }

        RiverRaftingAdapter adapter = new RiverRaftingAdapter(this, arrayList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recycleview.setLayoutManager(layoutManager);
        recycleview.setAdapter(adapter);
    }

    public void toolbar() {
        back_img= findViewById(R.id.back_img);
        back_img.setOnClickListener(this);
        menu_img= findViewById(R.id.menu_img);
        menu_img.setVisibility(View.GONE);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("River Rafting");
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.back_img:
                dispatchToDetailsActivity();
                break;
        }
    }

    public void dispatchToDetailsActivity(){
        Intent intent = new Intent(RiverRaftingActivity.this, DetailsActivity.class);
        startActivity(intent);
    }
}