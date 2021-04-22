package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.R;
import com.hobbido.app.SuccessfullActivity;
import com.hobbido.app.adapter.AllTransactionAdapter;
import com.hobbido.app.adapter.CategoryAdapter;

import java.util.ArrayList;
import java.util.List;

public class AllTransactionActivity extends BaseActivity implements View.OnClickListener{
    ImageView back_img , menu_img;
    TextView tv_title;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_all_transaction);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_all_transaction, null, false);
        drawerLayout.addView(contentView, 0);
        toolbarSetup();
        initView();
    }


    public void toolbarSetup(){

        back_img = findViewById(R.id.back_img);
        back_img.setImageResource(R.drawable.group_37040);
        back_img.setOnClickListener(this);
        menu_img = findViewById(R.id.menu_img);
        menu_img.setOnClickListener(this);
        tv_title = findViewById(R.id.tv_title);
       tv_title.setText("All Transactions");
    }


    public void initView(){
        recyclerView = findViewById(R.id.recyclerView);
        setDataOnCategoryList();
    }


    public void setDataOnCategoryList() {

        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            arrayList.add("sannju");
        }
        AllTransactionAdapter adapter = new AllTransactionAdapter(this, arrayList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back_img:
                onBackPressed();
                break;
            case R.id.menu_img:
                checkDrawerOpen();
                break;

        }
    }

    public void dispatchToSuccessActivity(){
        Intent intent = new Intent(AllTransactionActivity.this, SuccessfullActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        finish();
    }

}