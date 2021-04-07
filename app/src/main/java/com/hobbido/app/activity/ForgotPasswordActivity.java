package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hobbido.app.R;
import com.hobbido.app.fragment.EmailFragment;
import com.hobbido.app.fragment.PhoneNumberFragment;

import java.util.ArrayList;

public class ForgotPasswordActivity extends AppCompatActivity implements View.OnClickListener {

    Button phone_number_button,email_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_passoword);
        initView();
        showPhoneNumberFragment();
    }

    public void initView(){
        phone_number_button = findViewById(R.id.phone_number_button);
        email_button = findViewById(R.id.email_button);

        phone_number_button.setOnClickListener(this);
        email_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.phone_number_button:
                showPhoneNumberFragment();
                break;

            case R.id.email_button:
                showEmailFragment();
                break;
        }
    }


    public void showPhoneNumberFragment() {
        selectedPhoneNumberButton();
        PhoneNumberFragment fragment = new PhoneNumberFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_left);
        fragmentTransaction.replace(R.id.fragment_container, fragment, PhoneNumberFragment.TAG);
        fragmentTransaction.commit();
    }


    public void showEmailFragment() {
        selectedEmailButton();
        EmailFragment fragment = new EmailFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
        fragmentTransaction.replace(R.id.fragment_container, fragment, PhoneNumberFragment.TAG);
        fragmentTransaction.commit();
    }

    private void selectedPhoneNumberButton() {
        
        phone_number_button.setTextColor(getResources().getColor(R.color.white));
        email_button.setTextColor(getResources().getColor(R.color.ColorBlack));
        phone_number_button.setBackground(getResources().getDrawable(R.drawable.rounded_purpale_bg));
        email_button.setBackground(getResources().getDrawable(R.drawable.unselected_gray_btn_bg));
    }

    private void selectedEmailButton() {
        email_button.setTextColor(getResources().getColor(R.color.white));
        phone_number_button.setTextColor(getResources().getColor(R.color.ColorBlack));
        email_button.setBackground(getResources().getDrawable(R.drawable.rounded_purpale_bg));
        phone_number_button.setBackground(getResources().getDrawable(R.drawable.unselected_gray_btn_bg));
    }
}