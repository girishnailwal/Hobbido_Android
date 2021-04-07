package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.hobbido.app.R;
import com.hobbido.app.adapter.BecomeAHostAdapter;

import java.util.ArrayList;
import java.util.List;

public class BecomeHostActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_become_host);
        initView();
    }

    public void initView(){
        recyclerView = findViewById(R.id.recyclerView);
        setDataOnList();
    }


    public void setDataOnList() {
        List<String> arrayList = new ArrayList<>();
        BecomeAHostAdapter adapter = new BecomeAHostAdapter(this, arrayList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}