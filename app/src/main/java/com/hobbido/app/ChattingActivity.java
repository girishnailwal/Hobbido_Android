package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.activity.BaseActivity;

public class ChattingActivity extends BaseActivity implements View.OnClickListener {
  ImageView sideBarMenuImageView,sideBarImageView,menuImageView,backImageView,sendImageView;
  TextView tv_title;
  RecyclerView recyclerView;
  EditText editChat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_chatting);*/
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_chatting, null, false);
        drawerLayout.addView(contentView, 0);

        initView();
        toolbarSetUp();
    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerView);
        editChat = findViewById(R.id.editChat);
        sendImageView = findViewById(R.id.sendImageView);
    }
    private void toolbarSetUp() {
        backImageView= findViewById(R.id.backImageView);
        backImageView.setOnClickListener(this);
        menuImageView= findViewById(R.id.menuImageView);
        menuImageView.setOnClickListener(this);
        tv_title = findViewById(R.id.tv_title);
        sideBarImageView= findViewById(R.id.sideBarImageView);
        sideBarMenuImageView= findViewById(R.id.sideBarMenuImageView);
        /*tv_title.setText("Notification");*/
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.backImageView:
                onBackPressed();
                break;
            case R.id.menuImageView:
                checkDrawerOpen();
                break;

        }
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        finish();
    }
}