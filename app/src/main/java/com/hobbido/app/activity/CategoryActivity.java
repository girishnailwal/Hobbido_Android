package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hobbido.app.R;
import com.hobbido.app.adapter.CategoryAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CategoryActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView recyclerView;
    Button nextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        initView();
        setDataOnCategoryList();
    }

    public void initView(){
        recyclerView = findViewById(R.id.recyclerView);
        nextButton = findViewById(R.id.nextButton);
        nextButton.setOnClickListener(this);
    }

    public void setDataOnCategoryList() {

        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            arrayList.add("sannju");
        }

        CategoryAdapter adapter = new CategoryAdapter(this, arrayList);
        GridLayoutManager manager = new GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.nextButton:
                dispatchToHostAggrementActivity();
                break;
        }
    }

    private void dispatchToHostAggrementActivity() {
        Intent intent = new Intent(CategoryActivity.this, HostAggrementActivity.class);
        startActivity(intent);
        finish();
    }
}