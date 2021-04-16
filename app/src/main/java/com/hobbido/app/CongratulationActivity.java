package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CongratulationActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView back_img,menu_img;
    TextView tv_title,title,sub_title,sub_mini_title,visitingListTv,home_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congratulation);
        initView();
        toolbarSetUp();
    }
    private void initView() {
        title = findViewById(R.id.title);
        sub_title = findViewById(R.id.sub_title);
        sub_mini_title = findViewById(R.id.sub_mini_title);
        visitingListTv = findViewById(R.id.visitingListTv);
        visitingListTv.setOnClickListener(this);
        home_button  = findViewById(R.id.home_button);
        home_button.setOnClickListener(this);

    }
    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        menu_img= findViewById(R.id.menu_img);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setVisibility(View.GONE);
    }

    @Override
    public void onClick(View v) {
     switch (v.getId()){
         case R.id.visitingListTv:
         break;
         case R.id.home_button:
             break;
     }
    }
}