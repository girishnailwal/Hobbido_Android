package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HelpCenterActivity extends AppCompatActivity {

    ImageView back_img,menu_img;
    TextView tv_title,writeToUsTv,generalTv,hostTv,paymentTv,categoryNameTv;
    Button continue_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_center);

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
        menu_img= findViewById(R.id.menu_img);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Help Center");
    }


}