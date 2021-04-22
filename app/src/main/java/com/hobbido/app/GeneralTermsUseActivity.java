package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.activity.BaseActivity;

public class GeneralTermsUseActivity extends BaseActivity implements View.OnClickListener {
    ImageView back_img,menu_img;
    TextView tv_title,titleTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_general_terms_use);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_general_terms_use, null, false);
        drawerLayout.addView(contentView, 0);
        initView();
        toolbarSetUp();
    }
    private void initView() {
        titleTv = findViewById(R.id.titleTv);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back_img:
                onBackPressed();
                break;
            case R.id.menu_img:
                checkDrawerOpen();
                break;
        }
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        finish();
    }

    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        back_img.setOnClickListener(this);
        menu_img= findViewById(R.id.menu_img);
        menu_img.setOnClickListener(this);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("General Terms Of Use");
    }
}