package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.activity.HomeActivity;
import com.hobbido.app.adapter.MessageAdapter;
import com.hobbido.app.adapter.NotificationAdapter;

import java.util.ArrayList;
import java.util.List;

public class NotificationActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView back_img,menu_img;
    TextView tv_title;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        initView();
        setOnMessageDataList();
        toolbarSetUp();
    }
    private void initView() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    private void setOnMessageDataList() {
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            arrayList.add("sannju");
        }

        NotificationAdapter adapter = new NotificationAdapter(this, arrayList);
        GridLayoutManager manager = new GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }

    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        back_img.setOnClickListener(this);
        menu_img= findViewById(R.id.menu_img);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Notification");
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.back_img:
                dispatchToHomeActivity();
                break;
        }
    }
    private void dispatchToHomeActivity() {
        Intent intent = new Intent(NotificationActivity.this, HomeActivity.class);
        startActivity(intent);

    }
}