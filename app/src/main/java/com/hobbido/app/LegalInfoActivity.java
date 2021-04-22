package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.activity.BaseActivity;
import com.hobbido.app.activity.BookingWaitingListNewActivity;
import com.hobbido.app.activity.HostTermsUseActivity;
import com.hobbido.app.activity.MyBookingActivity;
import com.hobbido.app.activity.PrivarcyPolicyActivity;

public class LegalInfoActivity extends BaseActivity implements View.OnClickListener {

    ImageView back_img,menu_img;
    TextView tv_title,generalTermsTv,hostTermsTv,privacyPolicyTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_legal_info);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_legal_info, null, false);
        drawerLayout.addView(contentView, 0);
        initView();
        toolbarSetUp();
    }

    private void initView() {
        generalTermsTv = findViewById(R.id.generalTermsTv);
        generalTermsTv.setOnClickListener(this);
        hostTermsTv= findViewById(R.id.hostTermsTv);
        hostTermsTv.setOnClickListener(this);
        privacyPolicyTv = findViewById(R.id.privacyPolicyTv);
        privacyPolicyTv.setOnClickListener(this);
    }

    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        back_img.setOnClickListener(this);
        menu_img= findViewById(R.id.menu_img);
        menu_img.setOnClickListener(this);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Legal Info");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back_img:
                onBackPressed();
                break;
            case R.id.menu_img:
                checkDrawerOpen();
                break;
         case R.id.generalTermsTv:
                dispatchToGeneralTermsUseActivity();
                break;
            case R.id.hostTermsTv:
                dispatchToHostTermsUseActivity();
                break;
            case R.id.privacyPolicyTv:
                dispatchToPrivarcyPolicyActivity();
                break;

        }
    }

    private void dispatchToPrivarcyPolicyActivity() {
        Intent intent = new Intent(LegalInfoActivity.this, PrivarcyPolicyActivity.class);
        startActivity(intent);
    }

    private void dispatchToHostTermsUseActivity() {
        Intent intent = new Intent(LegalInfoActivity.this, HostTermsUseActivity.class);
        startActivity(intent);
    }

    private void dispatchToGeneralTermsUseActivity() {
        Intent intent = new Intent(LegalInfoActivity.this, GeneralTermsUseActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        finish();
    }
}