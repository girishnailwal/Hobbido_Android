package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hobbido.app.R;
import com.hobbido.app.SplashActivity;

public class LanguageActivity extends AppCompatActivity implements View.OnClickListener{
     Button continueButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        initView();
    }

    private void initView() {
        continueButton = findViewById(R.id.continueButton);
        continueButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.continueButton:
                Intent intent = new Intent(LanguageActivity.this, LoginActivity.class);
                startActivity(intent);
                break;
        }
    }
}