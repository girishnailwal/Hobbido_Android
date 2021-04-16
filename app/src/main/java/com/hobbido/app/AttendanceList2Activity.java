package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AttendanceList2Activity extends AppCompatActivity {
    ImageView back_img,menu_img;
    TextView tv_title,optionTv,dateTv,totalSlotsTv,availableSlotsTv,usernameTv,numberSlotsTv,username1Tv,numberSlots1Tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance_list2);

        initView();
        toolbarSetUp();
    }


    private void initView() {
        optionTv = findViewById(R.id.optionTv);
        dateTv = findViewById(R.id.dateTv);
        totalSlotsTv = findViewById(R.id.totalSlotsTv);
        availableSlotsTv = findViewById(R.id.availableSlotsTv);

        usernameTv = findViewById(R.id.usernameTv);
        numberSlotsTv = findViewById(R.id.numberSlotsTv);
        username1Tv = findViewById(R.id.username1Tv);
        numberSlots1Tv = findViewById(R.id.numberSlots1Tv);
    }
    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        menu_img= findViewById(R.id.menu_img);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Who's Coming");
    }
}