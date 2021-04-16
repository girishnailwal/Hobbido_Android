package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.adapter.MessageAdapter;
import com.hobbido.app.dialog.CustomAppSettingDialog;
import com.hobbido.app.listener.DialogButtonListener;

import java.util.ArrayList;
import java.util.List;

public class AppSettingActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView back_img,menu_img;
    TextView tv_title,disable_bio_loginTv,notificationsTv,distanceUnitTv,currencyTv,logOutTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_setting);
        initView();
        toolbarSetUp();
    }

    private void initView() {
        disable_bio_loginTv = findViewById(R.id.disable_bio_loginTv);
        notificationsTv = findViewById(R.id.notificationsTv);
        distanceUnitTv = findViewById(R.id.distanceUnitTv);
        currencyTv = findViewById(R.id.currencyTv);
        logOutTv = findViewById(R.id.logOutTv);
        logOutTv.setOnClickListener(this);
    }



    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        menu_img= findViewById(R.id.menu_img);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("App Settings");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.logOutTv:
                showCustomAppDialog();
                break;
        }
    }

    private void showCustomAppDialog() {
        new CustomAppSettingDialog(this, new DialogButtonListener() {
            @Override
            public void onButtonClicked() {

            }
        }).show();
    }
}