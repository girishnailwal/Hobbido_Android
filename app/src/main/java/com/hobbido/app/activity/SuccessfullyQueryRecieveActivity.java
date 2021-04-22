package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hobbido.app.R;
import com.hobbido.app.SuccessfullActivity;

public class SuccessfullyQueryRecieveActivity extends AppCompatActivity implements View.OnClickListener {
   Button closeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successfully_query_recieve);
        initView();
    }

    private void initView() {
        closeButton = findViewById(R.id.closeButton);
        closeButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.closeButton:
                dispatchToWalletActivity();
                break;
        }
    }

    private void dispatchToWalletActivity() {
        Intent intent = new Intent(SuccessfullyQueryRecieveActivity.this, WalletActivity.class);
        startActivity(intent);
    }
}