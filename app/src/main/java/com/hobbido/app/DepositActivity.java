package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class DepositActivity extends AppCompatActivity {
    ImageView back_img,menu_img;
    TextView tv_title,amountPaidTv,rupeesTv,headerRupeesTv;
    EditText editEnterAmount,editApplyVoucher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposit);
        initView();
        toolbarSetUp();

    }
    private void initView() {
        amountPaidTv = findViewById(R.id.amountPaidTv);
        editApplyVoucher = findViewById(R.id.editApplyVoucher);
        editEnterAmount = findViewById(R.id.editEnterAmount);
        rupeesTv = findViewById(R.id.rupeesTv);
        headerRupeesTv = findViewById(R.id.headerRupeesTv);
    }
    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        menu_img= findViewById(R.id.menu_img);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Deposit");
    }
}