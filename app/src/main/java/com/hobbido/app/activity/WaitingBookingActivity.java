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

import com.hobbido.app.R;
import com.hobbido.app.adapter.ProgramNewAdapter;
import com.hobbido.app.adapter.WaitingBookingAdapter;
import com.hobbido.app.dialog.CustomWaitingListDialog;
import com.hobbido.app.listener.DialogButtonListener;
import com.hobbido.app.listener.DialogButtonListenerWithText;

import java.util.ArrayList;
import java.util.List;

public class WaitingBookingActivity extends BaseActivity implements View.OnClickListener {
    RecyclerView recyclerView;
    ImageView back_img,menu_img;
    TextView tv_title;
    Button RemoveListButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_waiting_booking);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_waiting_booking, null, false);
        drawerLayout.addView(contentView, 0);
        initiView();
        toolbarSetUp();
        setDataOnCategoryList();
    }

    private void initiView() {
        recyclerView= findViewById(R.id.recyclerView);
        RemoveListButton = findViewById(R.id.RemoveListButton);
        RemoveListButton.setOnClickListener(this);
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
        switch (v.getId()){
            case R.id.back_img:
                onBackPressed();
                break;
        case R.id.RemoveListButton:
               showCustomWaitingListDialog();
                break;
            case R.id.menu_img:
                checkDrawerOpen();
                break;
        }
    }

    private void showCustomWaitingListDialog() {
        new CustomWaitingListDialog(this, new DialogButtonListenerWithText() {
            @Override
            public void onButtonClicked(String str) {
                if(str.equals("Confirm")){
                    finish();
                }else{
                    Intent intent = new Intent(WaitingBookingActivity.this,BookingWaitingListNewActivity.class);
                    startActivity(intent);
                }

            }
        }).show();
    }
}