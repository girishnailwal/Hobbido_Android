package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hobbido.app.R;
import com.hobbido.app.fragment.PhoneNumberFragment;
import com.hobbido.app.fragment.RegularFragment;
import com.hobbido.app.fragment.WaitingListFragment;

public class MyBookingActivity extends AppCompatActivity implements View.OnClickListener {

    Button watingList_btn, upcoming_btn, history_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_booking);
        initView();
        showWaitingListFragment();
    }

    public void initView() {
        watingList_btn = findViewById(R.id.watingList_btn);
        upcoming_btn = findViewById(R.id.upcoming_btn);
        history_btn = findViewById(R.id.history_btn);

        watingList_btn.setOnClickListener(this);
        upcoming_btn.setOnClickListener(this);
        history_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.watingList_btn:
                showWaitingListFragment();
                break;

            case R.id.upcoming_btn:
                showWaitingListFragment();
                break;

            case R.id.history_btn:
                showWaitingListFragment();
                break;

        }
    }


    public void showWaitingListFragment() {
        WaitingListFragment fragment = new WaitingListFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_left);
        fragmentTransaction.replace(R.id.fragment_container, fragment, PhoneNumberFragment.TAG);
        fragmentTransaction.commit();
    }


}