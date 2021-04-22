package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hobbido.app.R;

public class ProfileSetUpActivity extends AppCompatActivity implements View.OnClickListener {
    Button nextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_set_up);
        initView();
    }

    private void initView() {
        nextButton= findViewById(R.id.nextButton);
        nextButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.nextButton:
                dispatchToCategoryActivity();
                break;
        }
    }

    private void dispatchToCategoryActivity() {
        Intent intent = new Intent(ProfileSetUpActivity.this, CategoryActivity.class);
        startActivity(intent);
        finish();
    }
}