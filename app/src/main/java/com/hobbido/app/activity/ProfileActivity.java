package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.R;

public class ProfileActivity extends AppCompatActivity {
    ImageView back_img , menu_img;
    TextView tv_title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        initView();
    }

    public void initView(){
        back_img = findViewById(R.id.back_img);
        back_img.setImageResource(R.drawable.back_4);
        menu_img = findViewById(R.id.menu_img);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setVisibility(View.GONE);
    }
}