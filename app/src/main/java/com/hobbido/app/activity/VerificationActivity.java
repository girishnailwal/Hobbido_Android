package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.hobbido.app.R;

public class VerificationActivity extends AppCompatActivity implements View.OnClickListener {
   ImageView backImageView;
   Button nextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);
        initView();
    }

    private void initView() {
        backImageView = findViewById(R.id.backImageView);
        backImageView.setOnClickListener(this);
        nextButton = findViewById(R.id.nextButton);
        nextButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.nextButton:
                dispatchToChangePasswordActivity();
                break;
            case R.id.backImageView:
                onBackPressed();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        /*super.onBackPressed();*/
        finish();
    }

    private void dispatchToChangePasswordActivity() {
        Intent intent = new Intent(VerificationActivity.this, ChangePasswordActivity.class);
        startActivity(intent);
    }
}