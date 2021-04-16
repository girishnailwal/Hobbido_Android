package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.adapter.CreateAdapter;
import com.hobbido.app.adapter.PaymentMethodAdapter;

import java.util.ArrayList;
import java.util.List;

public class PaymentMethodActivity extends AppCompatActivity {
    ImageView back_img,menu_img;
    TextView tv_title,savecardTv,addNewCardTv,amountPaidTv,rupeesTv;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);
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
        menu_img= findViewById(R.id.menu_img);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Payment Method");
    }
    public void onRadioButtonClicked(View view) {
    }
}