package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.activity.BaseActivity;
import com.hobbido.app.activity.BookingWaitingListNewActivity;
import com.hobbido.app.activity.CreateNewQueryActivity;
import com.hobbido.app.activity.MyBookingActivity;
import com.hobbido.app.activity.WalletActivity;
import com.hobbido.app.dialog.CustomAddToCartDialog;
import com.hobbido.app.dialog.CustomAddToWaitListDialog;
import com.hobbido.app.listener.DialogButtonListener;

public class SuccessfullActivity extends BaseActivity implements View.OnClickListener {

    Button need_help_button;
    ImageView back_img,menu_img;
    TextView tv_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_successfull);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_successfull, null, false);
        drawerLayout.addView(contentView, 0);
       initView();
        toolbarSetUp();
    }

    public void initView(){
        need_help_button = findViewById(R.id.need_help_button);
        need_help_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.need_help_button:
                dispatchToCreateNewQueryActivity();
                break;
            case R.id.back_img:
                onBackPressed();
                break;
            case R.id.menu_img:
                checkDrawerOpen();
                break;
        }
    }

    private void dispatchToCreateNewQueryActivity() {
        Intent intent = new Intent(SuccessfullActivity.this, CreateNewQueryActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        Intent intent = new Intent(SuccessfullActivity.this, WalletActivity.class);
        startActivity(intent);
        finish();
    }
    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        back_img.setOnClickListener(this);
        menu_img= findViewById(R.id.menu_img);
        menu_img.setOnClickListener(this);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setVisibility(View.GONE);
    }
    public void showDialog(){
        new CustomAddToWaitListDialog(this, new DialogButtonListener() {
            @Override
            public void onButtonClicked() {

            }
        }).show();
    }
}