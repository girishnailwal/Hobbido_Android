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
import com.hobbido.app.adapter.WaitingBookingAdapter;
import com.hobbido.app.dialog.CustomWaitingListDialog;
import com.hobbido.app.listener.DialogButtonListener;
import com.hobbido.app.listener.DialogButtonListenerWithText;

import java.util.ArrayList;
import java.util.List;

public class BookingWaitingListNewActivity extends BaseActivity implements View.OnClickListener{
    RecyclerView recyclerView;
    ImageView back_img,menu_img;
    TextView tv_title;
    Button checkOutButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_booking_waiting_list_new);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_booking_waiting_list_new, null, false);
        drawerLayout.addView(contentView, 0);
        initiView();
        toolbarSetUp();
        setDataOnCategoryList();
    }
    private void initiView() {
        recyclerView= findViewById(R.id.recyclerView);
        checkOutButton = findViewById(R.id.checkOutButton);
        checkOutButton.setOnClickListener(this);
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
        Intent intent = new Intent(BookingWaitingListNewActivity.this,MyBookingActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back_img:
                onBackPressed();
                break;
            case R.id.checkOutButton:
               dispatchToMyCartActivity();
                break;
            case R.id.menu_img:
                checkDrawerOpen();
                break;
        }
    }

    private void dispatchToMyCartActivity() {
        Intent intent = new Intent(BookingWaitingListNewActivity.this,MyCartActivity.class);
        startActivity(intent);
    }


}