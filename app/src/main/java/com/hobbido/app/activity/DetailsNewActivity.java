package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;

import com.hobbido.app.R;
import com.hobbido.app.adapter.DetailScreenImagesAdapter;
import com.hobbido.app.fragment.DetailsFragment;
import com.hobbido.app.fragment.PhoneNumberFragment;
import com.hobbido.app.fragment.ProgramFragment;

import java.util.ArrayList;
import java.util.List;

public class DetailsNewActivity extends BaseActivity implements View.OnClickListener {

    Button details_btn,program_btn;
    RecyclerView recyclerView;
    ImageView messageImageView;
    ImageView back_img,menu_img;
    RatingBar ratingBar;
    CardView cardView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_details_new);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_details_new, null, false);
        drawerLayout.addView(contentView, 0);

        initView();
        showDetailsFragment();
        setRecipesImagesList();
        toolbarSetUp();
    }

    private void toolbarSetUp() {
        back_img = findViewById(R.id.back_img);
        back_img.setOnClickListener(this);
        menu_img= findViewById(R.id.menu_img);
        menu_img.setOnClickListener(this);
    }


    public void initView(){
        recyclerView = findViewById(R.id.recyclerView);
        details_btn = findViewById(R.id.details_btn);
        program_btn = findViewById(R.id.program_btn);
        messageImageView = findViewById(R.id.messageImageView);
        ratingBar = findViewById(R.id.ratingBar);
        cardView= findViewById(R.id.cardView);
        cardView.setOnClickListener(this);

        details_btn.setOnClickListener(this);
        program_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.details_btn:
                showDetailsFragment();
                selectedDetailsButton();
                break;
                

            case R.id.program_btn:
                showProgramFragment();
                selectedPackageButton();
                break;
            case R.id.back_img:
                dispatchToRegularActivity();
                break;
            case R.id.cardView:
                showRiverRiverRaftingActivity();
                break;
            case R.id.menu_img:
                checkDrawerOpen();
                break;
        }
    }



    private void dispatchToRegularActivity() {
        Intent intent = new Intent(DetailsNewActivity.this, RegularActivity.class);
        startActivity(intent);
    }
    private void showRiverRiverRaftingActivity() {
        Intent intent = new Intent(DetailsNewActivity.this,RiverRaftingActivity.class);
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
    


    public void showProgramFragment() {
        ProgramFragment fragment = new ProgramFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
        fragmentTransaction.replace(R.id.fragment_container, fragment, PhoneNumberFragment.TAG);
        fragmentTransaction.commit();
    }





    public void selectedDetailsButton(){
        details_btn.setTextColor(getResources().getColor(R.color.white));

        program_btn.setTextColor(getResources().getColor(R.color.ColorLightBlack));

        details_btn.setBackground(getResources().getDrawable(R.drawable.rounded_purpale_bg));
        program_btn.setBackground(getResources().getDrawable(R.drawable.unselected_gray_btn_bg));

        Typeface typeface1 = ResourcesCompat.getFont(this, R.font.montserrat_semibold);
        details_btn.setTypeface(typeface1);

        Typeface typeface2 = ResourcesCompat.getFont(this, R.font.montserrat_regular);

        program_btn.setTypeface(typeface2);
    }

   


    public void selectedPackageButton(){
        program_btn.setTextColor(getResources().getColor(R.color.white));
        details_btn.setTextColor(getResources().getColor(R.color.ColorLightBlack));

        program_btn.setBackground(getResources().getDrawable(R.drawable.rounded_purpale_bg));
        details_btn.setBackground(getResources().getDrawable(R.drawable.unselected_gray_btn_bg));


        Typeface typeface1 = ResourcesCompat.getFont(this, R.font.montserrat_semibold);
        program_btn.setTypeface(typeface1);

        Typeface typeface2 = ResourcesCompat.getFont(this, R.font.montserrat_regular);
        details_btn.setTypeface(typeface2);

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