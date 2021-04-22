package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hobbido.app.R;

public class SucessUpdateActivity extends AppCompatActivity implements View.OnClickListener {
    Button closeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucess_update);
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
                dispatchToSetFaceIdActivity();
                break;
        }
    }

    private void dispatchToSetFaceIdActivity() {
        Intent intent = new Intent(SucessUpdateActivity.this, SetFaceIdActivity.class);
        startActivity(intent);
        finish();
    }
}