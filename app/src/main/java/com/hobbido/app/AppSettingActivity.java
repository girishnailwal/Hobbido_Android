package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.activity.BaseActivity;
import com.hobbido.app.activity.LoginActivity;
import com.hobbido.app.dialog.CustomAppSettingDialog;
import com.hobbido.app.listener.DialogButtonListenerWithText;

import java.util.ArrayList;
import java.util.List;

public class AppSettingActivity extends BaseActivity implements View.OnClickListener {

    ImageView back_img,menu_img;
    TextView tv_title,disable_bio_loginTv,notificationsTv,distanceUnitTv,currencyTv,logOutTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_app_setting);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_app_setting, null, false);
        drawerLayout.addView(contentView, 0);
        initView();
        toolbarSetUp();
    }

    private void initView() {
        disable_bio_loginTv = findViewById(R.id.disable_bio_loginTv);
        notificationsTv = findViewById(R.id.notificationsTv);
        notificationsTv.setOnClickListener(this);
        distanceUnitTv = findViewById(R.id.distanceUnitTv);
        distanceUnitTv.setOnClickListener(this);
        currencyTv = findViewById(R.id.currencyTv);
        currencyTv.setOnClickListener(this);
        logOutTv = findViewById(R.id.logOutTv);
        logOutTv.setOnClickListener(this);
    }



    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        back_img.setOnClickListener(this);
        menu_img= findViewById(R.id.menu_img);
        menu_img.setOnClickListener(this);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("App Settings");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.logOutTv:
                showCustomAppDialog();
                break;
            case R.id.back_img:
                onBackPressed();
                break;
            case R.id.menu_img:
                checkDrawerOpen();
                break;
           case R.id.distanceUnitTv:
                dispatchToDistanceActivity();
                break;
        case R.id.currencyTv:
                dispatchToCurrencyActivity();
                break;
        }
    }

    private void dispatchToDistanceActivity() {
        Intent intent = new Intent(AppSettingActivity.this, DistanceActivity.class);
        startActivity(intent);
    }
    private void dispatchToCurrencyActivity() {
        Intent intent = new Intent(AppSettingActivity.this, CurrencyActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        finish();
    }

    private void showCustomAppDialog() {
        new CustomAppSettingDialog(this, new DialogButtonListenerWithText() {
            @Override
            public void onButtonClicked(String str) {
                if(str.equals("Logout")){
                    Intent intent = new Intent(AppSettingActivity.this, LoginActivity.class);
                    startActivity(intent);
                }else{
                    finish();
                }

            }
        }).show();
    }
}