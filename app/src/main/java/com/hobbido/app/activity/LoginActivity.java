package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
   TextView singupTv,tv_forgot_password,tv_skip_for_now;
   ImageView langImageView;
   Button continueButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
    }
    private void initView() {
        singupTv = findViewById(R.id.singupTv);
        singupTv.setOnClickListener(this);
        langImageView = findViewById(R.id.langImageView);
        langImageView.setOnClickListener(this);
        tv_forgot_password = findViewById(R.id.tv_forgot_password);
        tv_forgot_password.setOnClickListener(this);
        continueButton = findViewById(R.id.continueButton);
        continueButton.setOnClickListener(this);
        tv_skip_for_now = findViewById(R.id.tv_skip_for_now);
        tv_skip_for_now.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.singupTv:
                dispatchToSignUpActivity();
                break;
            case R.id.langImageView:
                dispatchToLanguageActivity();
                break;
            case R.id.tv_forgot_password:
                dispatchToForgetPasswordActivity();
                break;
            case R.id.continueButton:
                dispatchToHomeActivity();
                break;
            case R.id.tv_skip_for_now:
                dispatchToHomeActivity();
                break;
        }
    }




    private void dispatchToSignUpActivity() {
        Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
        startActivity(intent);
        finish();
    }
    private void dispatchToLanguageActivity() {
        Intent intent = new Intent(LoginActivity.this, LanguageActivity.class);
        startActivity(intent);
        finish();
    }

    private void dispatchToForgetPasswordActivity() {
        Intent intent = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
        startActivity(intent);
        finish();
    }

    private void dispatchToHomeActivity() {
        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }

}