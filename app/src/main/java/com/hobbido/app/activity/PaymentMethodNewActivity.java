package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.R;

public class PaymentMethodNewActivity extends BaseActivity implements View.OnClickListener{
    ImageView back_img,menu_img;
    TextView tv_title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_payment_method_new);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_payment_method_new, null, false);
        drawerLayout.addView(contentView, 0);

        initiView();
        toolbarSetUp();
    }

    private void initiView() {
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        finish();
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
    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        back_img.setOnClickListener(this);
        menu_img= findViewById(R.id.menu_img);
        menu_img.setOnClickListener(this);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Payment Method");
    }
}