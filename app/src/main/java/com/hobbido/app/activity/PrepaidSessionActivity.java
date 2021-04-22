package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.R;
import com.hobbido.app.fragment.PhoneNumberFragment;
import com.hobbido.app.fragment.Program1Fragment;
import com.hobbido.app.fragment.ProgramNewFragment;
import com.hobbido.app.fragment.RegularFragment;
import com.hobbido.app.fragment.RegularNewFragment;

public class PrepaidSessionActivity extends BaseActivity implements View.OnClickListener {
    ImageView back_img,menu_img;
    TextView tv_title;
    Button regular_btn, program_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_prepaid_session);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_prepaid_session, null, false);
        drawerLayout.addView(contentView, 0);
        initView();
        toolbarSetUp();
        showRegularFragment();
    }

    private void initView() {
        regular_btn = findViewById(R.id.regular_btn);
        program_btn = findViewById(R.id.program_btn);
        program_btn.setOnClickListener(this);
        regular_btn.setOnClickListener(this);
    }

    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        back_img.setOnClickListener(this);
        menu_img= findViewById(R.id.menu_img);
        menu_img.setOnClickListener(this);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Prepaid Sessions");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.regular_btn:
                showRegularFragment();
                break;

            case R.id.program_btn:
                showProgramFragment();
                break;
            case R.id.back_img:
                onBackPressed();
                break;
            case R.id.menu_img:
                checkDrawerOpen();
                break;
        }
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        finish();
    }

    public void showRegularFragment() {
        selectedRegularButton();
        RegularNewFragment fragment = new RegularNewFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_left);
        fragmentTransaction.replace(R.id.fragment_container, fragment, PhoneNumberFragment.TAG);
        fragmentTransaction.commit();
    }


    public void showProgramFragment() {
        selectedProgramButton();
        Program1Fragment fragment = new Program1Fragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
        fragmentTransaction.replace(R.id.fragment_container, fragment, PhoneNumberFragment.TAG);
        fragmentTransaction.commit();
    }

    private void selectedRegularButton() {
        regular_btn.setTextColor(getResources().getColor(R.color.white));
        program_btn.setTextColor(getResources().getColor(R.color.color_gray_2));
        regular_btn.setBackground(getResources().getDrawable(R.drawable.rounded_purpale_bg));
        program_btn.setBackground(getResources().getDrawable(R.drawable.unselected_gray_btn_bg));
    }


    private void selectedProgramButton() {
        program_btn.setTextColor(getResources().getColor(R.color.white));
        regular_btn.setTextColor(getResources().getColor(R.color.color_gray_2));
        //   regular_btn.setTextColor(Color.parseColor("#7d8088"));
        regular_btn.setBackground(getResources().getDrawable(R.drawable.unselected_gray_btn_bg));
        program_btn.setBackground(getResources().getDrawable(R.drawable.rounded_orange_bg));
    }
}