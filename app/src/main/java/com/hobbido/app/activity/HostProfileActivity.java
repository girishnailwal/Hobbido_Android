package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.R;
import com.hobbido.app.fragment.PhoneNumberFragment;
import com.hobbido.app.fragment.ProgramFragment;
import com.hobbido.app.fragment.RegularFragment;

public class HostProfileActivity extends BaseActivity implements View.OnClickListener {
    ImageView back_img , menu_img;
    TextView tv_title;
    Button regular_btn,program_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_host_profile);*/
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_host_profile, null, false);
        drawerLayout.addView(contentView, 0);

        initView();
        showRegularFragment();
    }

    public void initView(){
        back_img = findViewById(R.id.back_img);
        back_img.setOnClickListener(this);
        back_img.setImageResource(R.drawable.back_4);
        menu_img = findViewById(R.id.menu_img);
        menu_img.setOnClickListener(this);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setVisibility(View.GONE);



        regular_btn =findViewById(R.id.regular_btn);
        program_btn =findViewById(R.id.program_btn);
        regular_btn.setOnClickListener(this);
        program_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.regular_btn:
                selectedRegularButton();
                showRegularFragment();
                break;

            case R.id.program_btn:
                selectedProgramButton();
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
        /*super.onBackPressed();*/
        finish();
    }

    public void selectedRegularButton(){
      //  regular_btn.setTextColor(Color.parseColor("#fafafa"));
      //  program_btn.setTextColor(Color.parseColor("#7d8088"));
        regular_btn.setTextColor(getResources().getColor(R.color.white));
        program_btn.setTextColor(getResources().getColor(R.color.ColorLightBlack));
        regular_btn.setBackground(getResources().getDrawable(R.drawable.rounded_purpale_bg));
        program_btn.setBackground(getResources().getDrawable(R.drawable.unselected_gray_btn_bg));

        Typeface typeface1 = ResourcesCompat.getFont(this, R.font.montserrat_semibold);
        regular_btn.setTypeface(typeface1);
        Typeface typeface2 = ResourcesCompat.getFont(this, R.font.montserrat_regular);
        program_btn.setTypeface(typeface2);

    }


    public void selectedProgramButton(){
        //  regular_btn.setTextColor(Color.parseColor("#fafafa"));
        //  program_btn.setTextColor(Color.parseColor("#7d8088"));
        program_btn.setTextColor(getResources().getColor(R.color.white));
        regular_btn.setTextColor(getResources().getColor(R.color.color_gray_2));

        program_btn.setBackground(getResources().getDrawable(R.drawable.rounded_orange_bg));
        regular_btn.setBackground(getResources().getDrawable(R.drawable.unselected_gray_btn_bg));

        Typeface typeface1 = ResourcesCompat.getFont(this, R.font.montserrat_semibold);
        program_btn.setTypeface(typeface1);
        Typeface typeface2 = ResourcesCompat.getFont(this, R.font.montserrat_regular);
        regular_btn.setTypeface(typeface2);

    }


    public void showRegularFragment() {
        RegularFragment fragment = new RegularFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_left);
        fragmentTransaction.replace(R.id.fragment_container, fragment, PhoneNumberFragment.TAG);
        fragmentTransaction.commit();
    }


    public void showProgramFragment() {
        ProgramFragment fragment = new ProgramFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
        fragmentTransaction.replace(R.id.fragment_container, fragment, PhoneNumberFragment.TAG);
        fragmentTransaction.commit();
    }
}