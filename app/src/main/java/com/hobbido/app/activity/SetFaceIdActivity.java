package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hobbido.app.R;

public class SetFaceIdActivity extends AppCompatActivity implements View.OnClickListener{
    Button enableButton;
    TextView tv_skip_for_now;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_face_id);
        initView();
    }

    private void initView() {
        enableButton = findViewById(R.id.enableButton);
        enableButton.setOnClickListener(this);
        tv_skip_for_now = findViewById(R.id.tv_skip_for_now);
        tv_skip_for_now.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.enableButton:
                dispatchToHomeActivity();
                break;
            case R.id.tv_skip_for_now:
                dispatchToHomeActivity();
                break;
        }
    }



    private void dispatchToHomeActivity() {
        Intent intent = new Intent(SetFaceIdActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }

}