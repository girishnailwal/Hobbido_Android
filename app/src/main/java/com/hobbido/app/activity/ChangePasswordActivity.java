package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hobbido.app.R;

public class ChangePasswordActivity extends AppCompatActivity implements View.OnClickListener{
    Button saveButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        initView();
    }

    private void initView() {
        saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.saveButton:
                dispatchToChangePasswordActivity();
                break;
        }
    }

    private void dispatchToChangePasswordActivity() {
        Intent intent = new Intent(ChangePasswordActivity.this, HomeActivity.class);
        startActivity(intent);
    }
}