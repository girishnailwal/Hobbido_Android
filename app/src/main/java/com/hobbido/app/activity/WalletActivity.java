package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.DepositActivity;
import com.hobbido.app.R;
import com.hobbido.app.SuccessfullActivity;
import com.hobbido.app.adapter.AllTransactionAdapter;
import com.hobbido.app.adapter.RecentTransactionAdapter;
import com.hobbido.app.bottomSheet.FilterNewBottomSheet;

import java.util.ArrayList;
import java.util.List;

public class WalletActivity extends BaseActivity implements View.OnClickListener, FilterNewBottomSheet.ItemClickListener{
    ImageView back_img,menu_img,filterImageView;
    TextView tv_title,depositTv;
    RecyclerView recyclerView;
    Button allTransactionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_wallet);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_wallet, null, false);
        drawerLayout.addView(contentView, 0);
        initView();
        toolbarSetUp();
        setDataOnCategoryList();
    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerView);

        depositTv = findViewById(R.id.depositTv);
        depositTv.setOnClickListener(this);
        allTransactionButton = findViewById(R.id.allTransactionButton);
        allTransactionButton.setOnClickListener(this);
        filterImageView = findViewById(R.id.filterImageView);
        filterImageView.setOnClickListener(this);

    }

    private void setDataOnCategoryList() {
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            arrayList.add("sannju");
        }
        RecentTransactionAdapter adapter = new RecentTransactionAdapter(this, arrayList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
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
         case R.id.depositTv:
                dispatchToDepositActivity();
                break;
        case R.id.allTransactionButton:
                dispatchToAllTransactionActivity();
                break;
        case R.id.filterImageView:
                showFilterNewBottomSheet();
                break;
        }
    }

    private void showFilterNewBottomSheet() {

        FilterNewBottomSheet sortBottomSheet = FilterNewBottomSheet.newInstance();
        sortBottomSheet.show(getSupportFragmentManager(), FilterNewBottomSheet.TAG);
    }


    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        finish();
    }
    private void dispatchToAllTransactionActivity() {
        Intent intent = new Intent(WalletActivity.this, AllTransactionActivity.class);
        startActivity(intent);
    }

    private void dispatchToDepositActivity() {
        Intent intent = new Intent(WalletActivity.this, DepositActivity.class);
        startActivity(intent);
    }

    public void dispatchToSuccessfullActivity(){
        Intent intent = new Intent(WalletActivity.this, SuccessfullActivity.class);
        startActivity(intent);
    }
    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        back_img.setOnClickListener(this);
        menu_img= findViewById(R.id.menu_img);
        menu_img.setOnClickListener(this);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setVisibility(View.GONE);
    }

    @Override
    public void onItemClick(String item) {

    }
}