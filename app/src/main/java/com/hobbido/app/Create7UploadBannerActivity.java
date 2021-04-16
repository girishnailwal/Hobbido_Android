package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Create7UploadBannerActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView back_img,menu_img;
    TextView tv_title,steps,cancelTv;
    Button next_button;
    ImageView uploadImage,uploadImage1,uploadVideoImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create4_upload_banner);
        initiView();
        toolbarSetUp();
    }

    private void initiView() {
        steps = findViewById(R.id.steps);
        cancelTv = findViewById(R.id.cancelTv);
        next_button = findViewById(R.id.next_button);
        next_button.setOnClickListener(this);
        uploadImage = findViewById(R.id.uploadImage);
        uploadImage.setOnClickListener(this);
        uploadImage1 = findViewById(R.id.uploadImage1);
        uploadImage1.setOnClickListener(this);
        uploadVideoImage = findViewById(R.id.uploadVideoImage);
        uploadVideoImage.setOnClickListener(this);
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
            case R.id.next_button:
                break;
            case R.id.uploadImage:
                break;
            case R.id.uploadImage1:
                break;
            case R.id.uploadVideoImage:
                break;
        }
    }
}