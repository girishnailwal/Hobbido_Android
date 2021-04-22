package com.hobbido.app.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.hobbido.app.NotificationActivity;
import com.hobbido.app.R;
import com.hobbido.app.SearchActivity;
import com.hobbido.app.fragment.CategoriesFragment;
import com.hobbido.app.fragment.HomeFragment;
import com.hobbido.app.fragment.PhoneNumberFragment;
import com.hobbido.app.fragment.RegularFragment;

public class HomeActivity extends BaseActivity implements BottomNavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    ImageView backImageView,notificationImageView,searchImageView;
    BottomNavigationView bottomNavigation;
    ImageView menuImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_home2);
//        setContentView(R.layout.nav_drawer_layout);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_home2, null, false);
        drawerLayout.addView(contentView, 0);
        initView();
        showHomeFragment();

        initView();
        toolbarSetUp();
        showHomeFragment();

    }



    public void initView() {
        menuImageView = findViewById(R.id.menuImageView);
        bottomNavigation = findViewById(R.id.bottom_navigation);
        // bottomNavigation.setLabelVisibilityMode(LabelVisibilityMode.LABEL_VISIBILITY_LABELED);
        bottomNavigation.setOnNavigationItemSelectedListener(this);
        bottomNavigation.setItemIconTintList(null);
        searchImageView = findViewById(R.id.searchImageView);
        searchImageView.setOnClickListener(this);
        menuImageView.setOnClickListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_home:
                showHomeFragment();
                break;

            case R.id.nav_category:
                //  mapFragmentHide();
                showCategoriesFragment();
                break;


        }
        return true;
    }

    private void showCategoriesFragment() {
        CategoriesFragment fragment = new CategoriesFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment, PhoneNumberFragment.TAG);
        fragmentTransaction.commit();
    }


    public void showHomeFragment() {
        HomeFragment fragment = new HomeFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_left);
        fragmentTransaction.replace(R.id.fragment_container, fragment, PhoneNumberFragment.TAG);
        fragmentTransaction.commit();
    }

    private void toolbarSetUp() {
        backImageView = findViewById(R.id.backImageView);
        backImageView.setVisibility(View.GONE);
        notificationImageView = findViewById(R.id.notificationImageView);
        notificationImageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.searchImageView:
                dispatchToSearchActivity();
                break;
            case R.id.notificationImageView:
                dispatchToNotificationActivity();
                break;

            case R.id.menuImageView:
                checkDrawerOpen();
                break;

        }
    }

    private void dispatchToNotificationActivity() {
        Intent intent = new Intent(HomeActivity.this, NotificationActivity.class);
        startActivity(intent);

    }

    private void dispatchToSearchActivity() {
        Intent intent = new Intent(HomeActivity.this, SearchActivity.class);
        startActivity(intent);

    }
}