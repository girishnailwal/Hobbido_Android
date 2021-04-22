package com.hobbido.app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.hobbido.app.activity.LanguageActivity;

import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;
import static android.Manifest.permission_group.CAMERA;

public class SplashActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imageView;
    ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_splash);

      initView();


    }

    private void initView() {
        imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(this);
        constraintLayout = findViewById(R.id.constraintLayout);
        constraintLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageView:
                Intent intent = new Intent(SplashActivity.this, LanguageActivity.class);
                startActivity(intent);
                finish();
                break;
          case R.id.constraintLayout:
                Intent intent1 = new Intent(SplashActivity.this, LanguageActivity.class);
                startActivity(intent1);
                finish();
                break;
        }
    }
}