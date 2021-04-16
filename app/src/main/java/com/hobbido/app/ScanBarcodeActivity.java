package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ScanBarcodeActivity extends AppCompatActivity {
    ImageView back_img,menu_img;
    TextView tv_title,sub_title,optionNameATv,usernameATv,numberSlotsTv,dateTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_barcode);
    }

    private void initView() {
        sub_title = findViewById(R.id.sub_title);
        optionNameATv = findViewById(R.id.optionNameATv);
        usernameATv = findViewById(R.id.usernameATv);
        numberSlotsTv = findViewById(R.id.numberSlotsTv);
        dateTv = findViewById(R.id.dateTv);
    }
    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        menu_img= findViewById(R.id.menu_img);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Scan Barcode");
    }
}