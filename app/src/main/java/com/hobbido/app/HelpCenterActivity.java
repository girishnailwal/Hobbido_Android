package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.activity.BaseActivity;

public class HelpCenterActivity extends BaseActivity implements View.OnClickListener {

    ImageView back_img,menu_img;
    TextView tv_title,writeToUsTv,generalTv,hostTv,paymentTv,categoryNameTv;
    Button continue_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_help_center);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_help_center, null, false);
        drawerLayout.addView(contentView, 0);
        initView();
        toolbarSetUp();
    }

    private void initView() {
        writeToUsTv = findViewById(R.id.writeToUsTv);
        generalTv = findViewById(R.id.generalTv);
        hostTv = findViewById(R.id.hostTv);
        paymentTv = findViewById(R.id.paymentTv);
        categoryNameTv = findViewById(R.id.categoryNameTv);

        continue_button = findViewById(R.id.continue_button);
    }
    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        back_img.setOnClickListener(this);
        menu_img= findViewById(R.id.menu_img);
        menu_img.setOnClickListener(this);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Help Center");
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back_img:
                onBackPressed();
                break;
            case R.id.menu_img:
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