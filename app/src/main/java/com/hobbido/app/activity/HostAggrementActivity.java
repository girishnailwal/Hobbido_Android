package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.R;

public class HostAggrementActivity extends AppCompatActivity implements View.OnClickListener {
   ImageView backImageView;
   TextView tv_skip_for_now;
   Button agreeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host_aggrement);
        initView();

    }

    private void initView() {
        backImageView = findViewById(R.id.backImageView);
        backImageView.setOnClickListener(this);
        tv_skip_for_now= findViewById(R.id.tv_skip_for_now);
        tv_skip_for_now.setOnClickListener(this);
        agreeButton = findViewById(R.id.agreeButton);
        agreeButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.backImageView:
                dispatchToBecomeHostActivity();
                break;
            case R.id.tv_skip_for_now:
                dispatchToBecomeHostActivity();
                break;
            case R.id.agreeButton:
                dispatchToBankDetailsActivity();
                break;
        }
    }

    private void dispatchToBankDetailsActivity() {
        Intent intent = new Intent(HostAggrementActivity.this, BankDetailsActivity.class);
        startActivity(intent);
        finish();
    }

    private void dispatchToBecomeHostActivity() {
        Intent intent = new Intent(HostAggrementActivity.this, BecomeHostActivity.class);
        startActivity(intent);
        finish();
    }
}