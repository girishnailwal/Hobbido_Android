package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.activity.BaseActivity;
import com.hobbido.app.activity.WalletActivity;
import com.hobbido.app.adapter.CreateAdapter;
import com.hobbido.app.adapter.PaymentMethodAdapter;

import java.util.ArrayList;
import java.util.List;

public class PaymentMethodActivity extends BaseActivity implements View.OnClickListener {
    ImageView back_img,menu_img;
    TextView tv_title,savecardTv,addNewCardTv,amountPaidTv,rupeesTv;
    RecyclerView recyclerView;
    ConstraintLayout button_cl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_payment_method);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_payment_method, null, false);
        drawerLayout.addView(contentView, 0);
        initView();
        toolbarSetUp();
        setOnMessageDataList();
    }
    private void initView() {
        recyclerView = findViewById(R.id.recyclerView);
        amountPaidTv = findViewById(R.id.amountPaidTv);
        addNewCardTv = findViewById(R.id.addNewCardTv);
        savecardTv = findViewById(R.id.savecardTv);
        rupeesTv = findViewById(R.id.rupeesTv);
        button_cl = findViewById(R.id.button_cl);
        button_cl.setOnClickListener(this);
    }

    private void setOnMessageDataList() {
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            arrayList.add("sannju");
        }

        PaymentMethodAdapter adapter = new PaymentMethodAdapter(this, arrayList);
        GridLayoutManager manager = new GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }
    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        back_img.setOnClickListener(this);
        menu_img= findViewById(R.id.menu_img);
        menu_img.setOnClickListener(this);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Payment Method");
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menu_img:
                checkDrawerOpen();
                break;
            case R.id.back_img:
                onBackPressed();
                break;
          case R.id.button_cl:
              dispatchToWalletActivity();
                break;

        }
    }
    protected void dispatchToWalletActivity() {
        Intent intent = new Intent(PaymentMethodActivity.this, WalletActivity.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        finish();
    }



}