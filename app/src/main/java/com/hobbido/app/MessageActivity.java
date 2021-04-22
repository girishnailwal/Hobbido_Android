package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
import com.hobbido.app.adapter.CategoryAdapter;
import com.hobbido.app.adapter.MessageAdapter;

import java.util.ArrayList;
import java.util.List;

public class MessageActivity extends BaseActivity implements View.OnClickListener{

    ImageView back_img,menu_img;
    TextView tv_title;
    RecyclerView recyclerView;
    EditText editTextTextPersonName4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_message);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_message, null, false);
        drawerLayout.addView(contentView, 0);
        initView();
        setOnMessageDataList();
        toolbarSetUp();
    }



    private void initView() {
        recyclerView = findViewById(R.id.recyclerView);
        editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);
    }

    private void setOnMessageDataList() {
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            arrayList.add("sannju");
        }

        MessageAdapter adapter = new MessageAdapter(this, arrayList);
        GridLayoutManager manager = new GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
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
        tv_title.setText("Messages");
    }
}