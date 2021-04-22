package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.activity.BaseActivity;

public class CurrencyActivity extends BaseActivity implements View.OnClickListener{
    ImageView back_img,menu_img;
    TextView tv_title,usdDollarTv,currencyTv;
    CheckBox checkBox;
    Button Continuebutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_currency);*/
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_currency, null, false);
        drawerLayout.addView(contentView, 0);

        initiView();
        toolbarSetUp();
    }

    private void initiView() {
        usdDollarTv= findViewById(R.id.usdDollarTv);
        currencyTv= findViewById(R.id.currencyTv);
        Continuebutton= findViewById(R.id.Continuebutton);
        Continuebutton.setOnClickListener(this);
        checkBox= findViewById(R.id.checkBox);
    }
    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back_img:
                onBackPressed();
                break;
            case R.id.Continuebutton:
                onBackPressed();
                break;
            case R.id.menu_img:
                checkDrawerOpen();
                break;
        }
    }
    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        back_img.setOnClickListener(this);
        menu_img= findViewById(R.id.menu_img);
        menu_img.setOnClickListener(this);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Currency");
    }
}