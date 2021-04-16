package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class CurrencyActivity extends AppCompatActivity {
    ImageView back_img,menu_img;
    TextView tv_title,usdDollarTv,currencyTv;
    CheckBox checkBox;
    Button Continuebutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        initiView();
        toolbarSetUp();
    }

    private void initiView() {
        usdDollarTv= findViewById(R.id.usdDollarTv);
        currencyTv= findViewById(R.id.currencyTv);
        Continuebutton= findViewById(R.id.Continuebutton);
        checkBox= findViewById(R.id.checkBox);
    }

    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        menu_img= findViewById(R.id.menu_img);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Currency");
    }
}