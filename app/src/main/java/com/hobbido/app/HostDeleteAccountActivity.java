package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HostDeleteAccountActivity extends AppCompatActivity {
    ImageView back_img,menu_img;
    TextView tv_title,title,sub_title,sub_mini_title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host_delete_account);
        initView();
        toolbarSetUp();
    }

    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        menu_img= findViewById(R.id.menu_img);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setVisibility(View.GONE);
    }

    private void initView() {
        title = findViewById(R.id.title);
        sub_title = findViewById(R.id.sub_title);
        sub_mini_title = findViewById(R.id.sub_mini_title);
    }

}