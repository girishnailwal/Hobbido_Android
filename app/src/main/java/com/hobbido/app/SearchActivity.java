package com.hobbido.app;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.activity.BaseActivity;
import com.hobbido.app.activity.HomeActivity;
import com.hobbido.app.activity.RegularActivity;

public class SearchActivity extends BaseActivity implements View.OnClickListener{
    ImageView backImageView,menuImageView,notification;
    EditText editSearchLocation;
    DrawerLayout drawer;
    ActionBarDrawerToggle toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        initView();
        toolbarSetUp();
    }

    private void initView() {
        editSearchLocation = findViewById(R.id.editSearchLocation);
    }

    private void toolbarSetUp() {
        backImageView= findViewById(R.id.backImageView);
        backImageView.setOnClickListener(this);
        menuImageView= findViewById(R.id.menuImageView);
        menuImageView.setOnClickListener(this);
        notification = findViewById(R.id.notificationImageView);
        notification.setVisibility(View.GONE);
    }


    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        finish();
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.backImageView:
                dispatchToHomeActivity();
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

    private void dispatchToHomeActivity() {
        Intent intent = new Intent(SearchActivity.this, HomeActivity.class);
        startActivity(intent);


    }
}