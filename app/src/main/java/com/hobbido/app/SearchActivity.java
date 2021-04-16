package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {
    ImageView back_img,menu_img,notification;
    EditText editSearchLocation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        initView();
        toolbarSetUp();
    }

    private void initView() {
        editSearchLocation = findViewById(R.id.editSearchLocation);
    }

    private void toolbarSetUp() {
        back_img= findViewById(R.id.imageView26);
        menu_img= findViewById(R.id.imageView27);
        notification = findViewById(R.id.imageView28);
        notification.setVisibility(View.GONE);
    }
}