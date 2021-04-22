package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.activity.BaseActivity;
import com.hobbido.app.activity.BookingWaitingListNewActivity;
import com.hobbido.app.activity.MyBookingActivity;
import com.hobbido.app.activity.WalletActivity;

public class Deposit2Activity extends BaseActivity implements View.OnClickListener{
    ImageView back_img,menu_img;
    TextView tv_title,amountPaidTv,rupeesTv,headerRupeesTv,appliedTv,voucherAppliedTv;
    TextView editEnterAmount,editApplyVoucher;
    ConstraintLayout button_cl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_deposit2);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_deposit2, null, false);
        drawerLayout.addView(contentView, 0);
        initView();
        toolbarSetUp();
    }

    private void initView() {
        amountPaidTv = findViewById(R.id.amountPaidTv);
        editApplyVoucher = findViewById(R.id.editApplyVoucher);
        editEnterAmount = findViewById(R.id.editEnterAmount);
        rupeesTv = findViewById(R.id.rupeesTv);
        headerRupeesTv = findViewById(R.id.headerRupeesTv);
        appliedTv = findViewById(R.id.appliedTv);
        voucherAppliedTv = findViewById(R.id.voucherAppliedTv);
        button_cl = findViewById(R.id.button_cl);
        button_cl.setOnClickListener(this);
    }
    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        Intent intent = new Intent(Deposit2Activity.this, WalletActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back_img:
                onBackPressed();
                break;
            case R.id.button_cl:
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
        tv_title.setText("Deposit");
    }
}