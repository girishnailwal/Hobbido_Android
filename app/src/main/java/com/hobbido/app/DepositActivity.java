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
import com.hobbido.app.activity.MyCartActivity;

public class DepositActivity extends BaseActivity implements View.OnClickListener {
    ImageView back_img,menu_img;
    TextView tv_title,amountPaidTv,rupeesTv,headerRupeesTv;
    EditText editEnterAmount,editApplyVoucher;
    ConstraintLayout button_cl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_deposit);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_deposit, null, false);
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
        button_cl = findViewById(R.id.button_cl);
        button_cl.setOnClickListener(this);
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
            case R.id.button_cl:
                dispatchToDeposit2Activity();
                break;
            case R.id.menu_img:
                checkDrawerOpen();
                break;
        }
    }

    private void dispatchToDeposit2Activity() {
        Intent intent = new Intent(DepositActivity.this, Deposit2Activity.class);
        startActivity(intent);
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