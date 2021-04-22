package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.R;
import com.hobbido.app.adapter.BecomeAHostAdapter;
import com.hobbido.app.adapter.CategoryAdapter;
import com.hobbido.app.dialog.CustomAlertDialog;
import com.hobbido.app.listener.DialogButtonListener;

import java.util.ArrayList;
import java.util.List;

public class BankDetailsActivity extends AppCompatActivity implements View.OnClickListener {
    Button submitReviewButton;
    ImageView backImageView;
    TextView tv_skip_for_now;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_detials);
        initView();
    }
    private void initView() {
        backImageView = findViewById(R.id.backImageView);
        backImageView.setOnClickListener(this);
        tv_skip_for_now= findViewById(R.id.tv_skip_for_now);
        tv_skip_for_now.setOnClickListener(this);
        submitReviewButton = findViewById(R.id.submitReviewButton);
        submitReviewButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.backImageView:
                dispatchToHostAggrementActivity();
                break;
            case R.id.tv_skip_for_now:
                showCustomAlertDialog();
                break;
            case R.id.submitReviewButton:
                dispatchToSucessUpdateActivity();
                break;
        }
    }

    private void showCustomAlertDialog() {
        new CustomAlertDialog(this, new DialogButtonListener() {
            @Override
            public void onButtonClicked() {

            }
        }).show();
    }

    private void dispatchToSucessUpdateActivity() {
        Intent intent = new Intent(BankDetailsActivity.this, SucessUpdateActivity.class);
        startActivity(intent);
        finish();
    }

    private void dispatchToHostAggrementActivity() {
        Intent intent = new Intent(BankDetailsActivity.this, HostAggrementActivity.class);
        startActivity(intent);
        finish();
    }
}