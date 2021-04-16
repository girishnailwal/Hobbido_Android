package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class QrCodeActivity extends AppCompatActivity {
    ImageView back_img,menu_img;
    TextView tv_title;
    ImageView imageView44;
    Button shareButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_code);
        initView();
        toolbarSetUp();
    }
    private void initView() {
        imageView44 = findViewById(R.id.imageView44);
        shareButton = findViewById(R.id.shareButton);
    }

    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        menu_img= findViewById(R.id.menu_img);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("QR Code");
    }
}