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
import com.hobbido.app.adapter.BecomeAHostAdapter;

import java.util.ArrayList;
import java.util.List;

public class BecomeHostActivity extends BaseActivity implements View.OnClickListener{
    RecyclerView recyclerView;
    Button becomeHostButton;
    TextView tv_skip_for_now;
    ImageView back_img,menu_img;
    TextView tv_title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_become_host);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_become_host, null, false);
        drawerLayout.addView(contentView, 0);
        initView();
        toolbarSetUp();
    }

    public void initView(){
        recyclerView = findViewById(R.id.recyclerView);
        becomeHostButton = findViewById(R.id.becomeHostButton);
        becomeHostButton.setOnClickListener(this);
        tv_skip_for_now = findViewById(R.id.tv_skip_for_now);
        tv_skip_for_now.setOnClickListener(this);
        setDataOnList();
    }

    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        back_img.setOnClickListener(this);
        menu_img= findViewById(R.id.menu_img);
        menu_img.setOnClickListener(this);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Become a Host");
    }
    public void setDataOnList() {
        List<String> arrayList = new ArrayList<>();
        BecomeAHostAdapter adapter = new BecomeAHostAdapter(this, arrayList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.becomeHostButton:
                dispatchToHostAggrementActivity();
                break;
            case R.id.tv_skip_for_now:
                dispatchToSetFaceIdActivity();
                break;
            case R.id.back_img:
                onBackPressed();
                break;
            case R.id.menu_img:
                checkDrawerOpen();
                break;
        }
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        finish();
    }

    private void dispatchToHostAggrementActivity() {
        Intent intent = new Intent(BecomeHostActivity.this, HostAggrementActivity.class);
        startActivity(intent);

    }

    private void dispatchToSetFaceIdActivity() {
        Intent intent = new Intent(BecomeHostActivity.this, SetFaceIdActivity.class);
        startActivity(intent);
    }
}