package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.R;

public class MyCartActivity extends BaseActivity  implements View.OnClickListener{
    ImageView back_img,menu_img;
    TextView tv_title;
    ConstraintLayout button_cl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_my_cart);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_my_cart, null, false);
        drawerLayout.addView(contentView, 0);
        initView();
        toolbarSetUp();
    }

    private void initView() {
        button_cl = findViewById(R.id.button_cl);
        button_cl.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back_img:
                onBackPressed();
                break;
            case R.id.menu_img:
                checkDrawerOpen();
                break;
          case R.id.button_cl:
              dispatchToPaymentMethodNewActivity();
                break;
        }
    }

    private void dispatchToPaymentMethodNewActivity() {
        Intent intent = new Intent(MyCartActivity.this,PaymentMethodNewActivity.class);
        startActivity(intent);
    }

    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        back_img.setOnClickListener(this);
        menu_img= findViewById(R.id.menu_img);
        menu_img.setOnClickListener(this);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("My Cart");
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        finish();
    }
}