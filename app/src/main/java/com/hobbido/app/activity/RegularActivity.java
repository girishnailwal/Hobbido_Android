package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.hobbido.app.R;
import com.hobbido.app.bottomSheet.FilterBottomSheet;
import com.hobbido.app.fragment.EmailFragment;
import com.hobbido.app.fragment.PhoneNumberFragment;
import com.hobbido.app.fragment.ProgramFragment;
import com.hobbido.app.fragment.RegularFragment;

public class RegularActivity extends AppCompatActivity implements View.OnClickListener,FilterBottomSheet.ItemClickListener {

    Button regular_btn, program_btn;
    ImageView filter_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular);
        initView();
        showRegularFragment();
    }

    public void initView(){
        regular_btn = findViewById(R.id.regular_btn);
        program_btn = findViewById(R.id.program_btn);
        filter_img = findViewById(R.id.filter_img);
        program_btn.setOnClickListener(this);
        regular_btn.setOnClickListener(this);
        filter_img.setOnClickListener(this);
    }


    public void showRegularFragment() {
         selectedRegularButton();
        RegularFragment fragment = new RegularFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_left);
        fragmentTransaction.replace(R.id.fragment_container, fragment, PhoneNumberFragment.TAG);
        fragmentTransaction.commit();
    }


    public void showProgramFragment() {
        selectedProgramButton();
        ProgramFragment fragment = new ProgramFragment();
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



    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.regular_btn:
                showRegularFragment();
                break;

            case R.id.program_btn:
                showProgramFragment();
                break;

            case R.id.filter_img:
                showBottomSheet();
                break;
        }
    }


    public void showBottomSheet() {
        FilterBottomSheet filterBottomSheet = FilterBottomSheet.newInstance();
        //addPhotoBottomDialogFragment.setStyle(DialogFragment.STYLE_NORMAL,R.style.TransparentDialog);
        filterBottomSheet.show(getSupportFragmentManager(), FilterBottomSheet.TAG);
    }

    @Override
    public void onItemClick(String item) {

    }
}