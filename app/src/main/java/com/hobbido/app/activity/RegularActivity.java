package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.hobbido.app.NotificationActivity;
import com.hobbido.app.R;
import com.hobbido.app.SearchActivity;
import com.hobbido.app.bottomSheet.FilterBottomSheet;
import com.hobbido.app.bottomSheet.SortBottomSheet;
import com.hobbido.app.fragment.EmailFragment;
import com.hobbido.app.fragment.PhoneNumberFragment;
import com.hobbido.app.fragment.ProgramFragment;
import com.hobbido.app.fragment.ProgramNewFragment;
import com.hobbido.app.fragment.RegularFragment;

public class RegularActivity extends BaseActivity implements View.OnClickListener,FilterBottomSheet.ItemClickListener, SortBottomSheet.ItemClickListener {

    Button regular_btn, program_btn;
    ImageView filter_img,backImageView,menuImageView,notificationImageView,sortImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular);
        initView();
        showRegularFragment();
        toolbarSetUp();
    }

    private void toolbarSetUp() {
        backImageView= findViewById(R.id.backImageView);
        backImageView.setOnClickListener(this);
        menuImageView= findViewById(R.id.menuImageView);
        menuImageView.setOnClickListener(this);
        notificationImageView= findViewById(R.id.notificationImageView);
        notificationImageView.setOnClickListener(this);

    }

    public void initView(){
        regular_btn = findViewById(R.id.regular_btn);
        program_btn = findViewById(R.id.program_btn);
        filter_img = findViewById(R.id.filter_img);
        sortImageView = findViewById(R.id.sortImageView);
        sortImageView.setOnClickListener(this);
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
        ProgramNewFragment fragment = new ProgramNewFragment();
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
            case R.id.backImageView:
                dispatchToSearchActivtiy();
                break;
            case R.id.notificationImageView:
                dispatchToNotificationActivity();
                break;
            case R.id.sortImageView:
                showSortBottomSheet();
                break;
            case R.id.menuImageView:
                    checkDrawerOpen();
                break;
        }
    }

    public void checkDrawerOpen() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            drawerLayout.openDrawer(GravityCompat.START);
        }
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }

    private void dispatchToNotificationActivity() {
        Intent intent = new Intent(RegularActivity.this, NotificationActivity.class);
        startActivity(intent);
    }

    private void dispatchToSearchActivtiy() {
        Intent intent = new Intent(RegularActivity.this, SearchActivity.class);
        startActivity(intent);

    }


    public void showBottomSheet() {
        FilterBottomSheet filterBottomSheet = FilterBottomSheet.newInstance();
        //addPhotoBottomDialogFragment.setStyle(DialogFragment.STYLE_NORMAL,R.style.TransparentDialog);
        filterBottomSheet.show(getSupportFragmentManager(), FilterBottomSheet.TAG);
    }
    private void showSortBottomSheet() {
        SortBottomSheet sortBottomSheet = SortBottomSheet.newInstance();
        sortBottomSheet.show(getSupportFragmentManager(), SortBottomSheet.TAG);
    }
    @Override
    public void onItemClick(String item) {

    }

    @Override
    public void onItemClick() {

    }
}