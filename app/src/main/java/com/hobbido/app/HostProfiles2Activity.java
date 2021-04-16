package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HostProfiles2Activity extends AppCompatActivity {
    ImageView back_img,menu_img;
    TextView tv_title,subTittleTv;
    ImageView fb_img,camera_img,twitter_img,tiktok_img;
    Button hostProfile_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host_profiles2);
        initView();
        toolbarSetUp();
    }

    private void initView() {
        fb_img = findViewById(R.id.fb_img);
        camera_img = findViewById(R.id.camera_img);
        twitter_img = findViewById(R.id.twitter_img);
        tiktok_img = findViewById(R.id.tiktok_img);

        subTittleTv = findViewById(R.id.subTittleTv);
        hostProfile_button = findViewById(R.id.hostProfile_button);
    }

    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        menu_img= findViewById(R.id.menu_img);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Host Profile");
    }
}