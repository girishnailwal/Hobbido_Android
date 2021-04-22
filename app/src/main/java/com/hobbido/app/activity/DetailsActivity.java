package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.hobbido.app.R;
import com.hobbido.app.adapter.DetailScreenImagesAdapter;
import com.hobbido.app.fragment.DetailsFragment;
import com.hobbido.app.fragment.OptionsFragment;
import com.hobbido.app.fragment.PackageFragment;
import com.hobbido.app.fragment.PhoneNumberFragment;
import com.hobbido.app.fragment.RegularFragment;

import java.util.ArrayList;
import java.util.List;

public class DetailsActivity extends AppCompatActivity implements View.OnClickListener {

    Button details_btn, options_btn,package_btn;
    RecyclerView recyclerView;
    ImageView back_img,menu_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detials);
        initView();
        showDetailsFragment();
        setRecipesImagesList();
        toolbar();
    }

    private void toolbar() {
        back_img = findViewById(R.id.back_img);
        back_img.setOnClickListener(this);
        menu_img= findViewById(R.id.menu_img);
    }

    public void initView(){
        recyclerView = findViewById(R.id.recyclerView);
        details_btn = findViewById(R.id.details_btn);
        options_btn = findViewById(R.id.options_btn);
        package_btn = findViewById(R.id.package_btn);

        details_btn.setOnClickListener(this);
        options_btn.setOnClickListener(this);
        package_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.details_btn:
                showDetailsFragment();
                selectedDetailsButton();
                break;

            case R.id.options_btn:
                showOptionsFragment();
                selectedOptionsButton();
                break;

            case R.id.package_btn:
                showPackageFragment();
                selectedPackageButton();
                break;
            case R.id.back_img:
                dispatchToRegularActivity();
                break;
        }
    }

    private void dispatchToRegularActivity() {
        Intent intent = new Intent(DetailsActivity.this, RegularActivity.class);
        startActivity(intent);
    }
    public void showDetailsFragment() {
        DetailsFragment fragment = new DetailsFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_left);
        fragmentTransaction.replace(R.id.fragment_container, fragment, PhoneNumberFragment.TAG);
        fragmentTransaction.commit();
    }

    public void showOptionsFragment() {
        OptionsFragment fragment = new OptionsFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
        fragmentTransaction.replace(R.id.fragment_container, fragment, PhoneNumberFragment.TAG);
        fragmentTransaction.commit();
    }


    public void showPackageFragment() {
        PackageFragment fragment = new PackageFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
        fragmentTransaction.replace(R.id.fragment_container, fragment, PhoneNumberFragment.TAG);
        fragmentTransaction.commit();
    }



    public void selectedDetailsButton(){
        details_btn.setTextColor(getResources().getColor(R.color.white));
        options_btn.setTextColor(getResources().getColor(R.color.ColorLightBlack));
        package_btn.setTextColor(getResources().getColor(R.color.ColorLightBlack));

        details_btn.setBackground(getResources().getDrawable(R.drawable.rounded_purpale_bg));
        options_btn.setBackground(getResources().getDrawable(R.drawable.unselected_gray_btn_bg));
        package_btn.setBackground(getResources().getDrawable(R.drawable.unselected_gray_btn_bg));

        Typeface typeface1 = ResourcesCompat.getFont(this, R.font.montserrat_semibold);
        details_btn.setTypeface(typeface1);

        Typeface typeface2 = ResourcesCompat.getFont(this, R.font.montserrat_regular);
        options_btn.setTypeface(typeface2);
        package_btn.setTypeface(typeface2);
    }

    public void selectedOptionsButton(){
        options_btn.setTextColor(getResources().getColor(R.color.white));
        details_btn.setTextColor(getResources().getColor(R.color.ColorLightBlack));
        package_btn.setTextColor(getResources().getColor(R.color.ColorLightBlack));

        options_btn.setBackground(getResources().getDrawable(R.drawable.rounded_purpale_bg));
        details_btn.setBackground(getResources().getDrawable(R.drawable.unselected_gray_btn_bg));
        package_btn.setBackground(getResources().getDrawable(R.drawable.unselected_gray_btn_bg));

        Typeface typeface1 = ResourcesCompat.getFont(this, R.font.montserrat_semibold);
        options_btn.setTypeface(typeface1);

        Typeface typeface2 = ResourcesCompat.getFont(this, R.font.montserrat_regular);
        details_btn.setTypeface(typeface2);
        package_btn.setTypeface(typeface2);
    }


    public void selectedPackageButton(){
        package_btn.setTextColor(getResources().getColor(R.color.white));
        details_btn.setTextColor(getResources().getColor(R.color.ColorLightBlack));
        options_btn.setTextColor(getResources().getColor(R.color.ColorLightBlack));

        package_btn.setBackground(getResources().getDrawable(R.drawable.rounded_purpale_bg));
        details_btn.setBackground(getResources().getDrawable(R.drawable.unselected_gray_btn_bg));
        options_btn.setBackground(getResources().getDrawable(R.drawable.unselected_gray_btn_bg));

        Typeface typeface1 = ResourcesCompat.getFont(this, R.font.montserrat_semibold);
        package_btn.setTypeface(typeface1);

        Typeface typeface2 = ResourcesCompat.getFont(this, R.font.montserrat_regular);
        details_btn.setTypeface(typeface2);
        options_btn.setTypeface(typeface2);
    }


    public void setRecipesImagesList() {
        List<String> stringList = new ArrayList<>();
        DetailScreenImagesAdapter detailScreenImagesAdapter = new DetailScreenImagesAdapter(this, stringList);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(detailScreenImagesAdapter);
    }


}