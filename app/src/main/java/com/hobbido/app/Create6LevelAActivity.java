package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Create6LevelAActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView back_img,menu_img;
    TextView tv_title,pressHoldTv,arrangeTv,steps,levelATv,levelBTv,cancelTv;
    Button next_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create6_level_a);

        initView();
        toolbarSetUp();
    }

    private void initView() {
        pressHoldTv = findViewById(R.id.pressHoldTv);
        arrangeTv = findViewById(R.id.arrangeTv);
        steps = findViewById(R.id.steps);
        levelATv = findViewById(R.id.levelATv);
        levelBTv = findViewById(R.id.levelBTv);

        cancelTv = findViewById(R.id.cancelTv);
        cancelTv.setOnClickListener(this);
        next_button = findViewById(R.id.next_button);
        next_button.setOnClickListener(this);
    }

    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        menu_img= findViewById(R.id.menu_img);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Create Activity");
    }

    @Override
    public void onClick(View v) {
       switch (v.getId()){
           case R.id.cancelTv:{
               break;
           } case R.id.next_button:{
               break;
           }
       }
    }
}