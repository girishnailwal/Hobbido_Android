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

import com.hobbido.app.AppSettingActivity;
import com.hobbido.app.QrCodeActivity;
import com.hobbido.app.R;
import com.hobbido.app.adapter.WaitingBookingAdapter;
import com.hobbido.app.dialog.CustomAppSettingDialog;
import com.hobbido.app.dialog.CustomBookingDialog;
import com.hobbido.app.listener.DialogButtonListenerWithText;

import java.util.ArrayList;
import java.util.List;

public class BookingActivity extends BaseActivity implements View.OnClickListener {
    ImageView back_img,menu_img,qrCodeImageView;
    TextView tv_title;
    RecyclerView recyclerView;
    Button cancelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_booking);*/

        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_booking, null, false);
        drawerLayout.addView(contentView, 0);

        initView();
        toolbarSetUp();
        setDataOnCategoryList();
    }
    private void initView() {
        recyclerView= findViewById(R.id.recyclerView);
        cancelButton = findViewById(R.id.cancelButton);
        cancelButton.setOnClickListener(this);
        qrCodeImageView = findViewById(R.id.qrCodeImageView);
        qrCodeImageView.setOnClickListener(this);
    }

    public void setDataOnCategoryList() {

        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            arrayList.add("sannju");
        }

        WaitingBookingAdapter adapter = new WaitingBookingAdapter(this, arrayList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        back_img.setOnClickListener(this);
        menu_img= findViewById(R.id.menu_img);
        menu_img.setOnClickListener(this);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Booking");
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        finish();
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
           case R.id.qrCodeImageView:
                dispatchToQrCodeActivity();
                break;
         case R.id.cancelButton:
             showCustomAppDialog();
                break;

        }
    }
    private void showCustomAppDialog() {
        new CustomBookingDialog(this, new DialogButtonListenerWithText() {
            @Override
            public void onButtonClicked(String str) {
                if(str.equals("Confirm")){
                    finish();
                }else{
                    finish();
                }

            }
        }).show();
    }
    private void dispatchToQrCodeActivity() {
        Intent intent = new Intent(BookingActivity.this, QrCodeActivity.class);
        startActivity(intent);
    }
}