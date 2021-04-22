package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.R;
import com.hobbido.app.fragment.HistoryFragment;
import com.hobbido.app.fragment.PhoneNumberFragment;
import com.hobbido.app.fragment.UpComingFragment;
import com.hobbido.app.fragment.WaitingListFragment;

public class MyBookingActivity extends BaseActivity implements View.OnClickListener {

    Button watingList_btn, upcoming_btn, history_btn;
    ImageView back_img,menu_img;
    TextView tv_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_my_booking);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_my_booking, null, false);
        drawerLayout.addView(contentView, 0);

        initView();
        showWaitingListFragment();
        toolbarSetUp();
    }

    public void initView() {
        watingList_btn = findViewById(R.id.watingList_btn);
        upcoming_btn = findViewById(R.id.upcoming_btn);
        history_btn = findViewById(R.id.history_btn);

        watingList_btn.setOnClickListener(this);
        upcoming_btn.setOnClickListener(this);
        history_btn.setOnClickListener(this);
    }
    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        back_img.setOnClickListener(this);
        menu_img= findViewById(R.id.menu_img);
        menu_img.setOnClickListener(this);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("My Booking");
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.watingList_btn:
                selectedWaitListingButton();
                showWaitingListFragment();
                break;

            case R.id.upcoming_btn:
                selectedUpComingButton();
                showUpComingFragment();
                break;

            case R.id.history_btn:
                selectedHistoryButton();
                showHistoryFragment();
                break;
            case R.id.back_img:
                onBackPressed();
                break;
            case R.id.menu_img:
                checkDrawerOpen();
                break;

        }
    }


    public void selectedWaitListingButton(){
        watingList_btn.setTextColor(getResources().getColor(R.color.white));
        upcoming_btn.setTextColor(getResources().getColor(R.color.ColorLightBlack));
        history_btn.setTextColor(getResources().getColor(R.color.ColorLightBlack));

        watingList_btn.setBackground(getResources().getDrawable(R.drawable.rounded_purpale_bg));
        upcoming_btn.setBackground(getResources().getDrawable(R.drawable.unselected_gray_btn_bg));
        history_btn.setBackground(getResources().getDrawable(R.drawable.unselected_gray_btn_bg));

        Typeface typeface1 = ResourcesCompat.getFont(this, R.font.montserrat_semibold);
        watingList_btn.setTypeface(typeface1);

        Typeface typeface2 = ResourcesCompat.getFont(this, R.font.montserrat_regular);
        upcoming_btn.setTypeface(typeface2);
        history_btn.setTypeface(typeface2);
    }


    public void selectedUpComingButton(){
        upcoming_btn.setTextColor(getResources().getColor(R.color.white));
        watingList_btn.setTextColor(getResources().getColor(R.color.ColorLightBlack));
        history_btn.setTextColor(getResources().getColor(R.color.ColorLightBlack));

        upcoming_btn.setBackground(getResources().getDrawable(R.drawable.rounded_purpale_bg));
        watingList_btn.setBackground(getResources().getDrawable(R.drawable.unselected_gray_btn_bg));
        history_btn.setBackground(getResources().getDrawable(R.drawable.unselected_gray_btn_bg));

        Typeface typeface1 = ResourcesCompat.getFont(this, R.font.montserrat_semibold);
        upcoming_btn.setTypeface(typeface1);

        Typeface typeface2 = ResourcesCompat.getFont(this, R.font.montserrat_regular);
        watingList_btn.setTypeface(typeface2);
        history_btn.setTypeface(typeface2);
    }


    public void selectedHistoryButton(){
        history_btn.setTextColor(getResources().getColor(R.color.white));
        watingList_btn.setTextColor(getResources().getColor(R.color.ColorLightBlack));
        upcoming_btn.setTextColor(getResources().getColor(R.color.ColorLightBlack));

        history_btn.setBackground(getResources().getDrawable(R.drawable.rounded_purpale_bg));
        watingList_btn.setBackground(getResources().getDrawable(R.drawable.unselected_gray_btn_bg));
        upcoming_btn.setBackground(getResources().getDrawable(R.drawable.unselected_gray_btn_bg));

        Typeface typeface1 = ResourcesCompat.getFont(this, R.font.montserrat_semibold);
        history_btn.setTypeface(typeface1);

        Typeface typeface2 = ResourcesCompat.getFont(this, R.font.montserrat_regular);
        watingList_btn.setTypeface(typeface2);
        upcoming_btn.setTypeface(typeface2);
    }


    public void showWaitingListFragment() {
        WaitingListFragment fragment = new WaitingListFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_left);
        fragmentTransaction.replace(R.id.fragment_container, fragment, PhoneNumberFragment.TAG);
        fragmentTransaction.commit();
    }

    public void showUpComingFragment() {
        UpComingFragment fragment = new UpComingFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
        fragmentTransaction.replace(R.id.fragment_container, fragment, PhoneNumberFragment.TAG);
        fragmentTransaction.commit();
    }

    public void showHistoryFragment() {
        HistoryFragment fragment = new HistoryFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
        fragmentTransaction.replace(R.id.fragment_container, fragment, PhoneNumberFragment.TAG);
        fragmentTransaction.commit();
    }
}