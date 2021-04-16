package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Create4OptionNameActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView back_img,menu_img;
    TextView tv_title,steps,addOptionTv,minimum_required,setUpCalenderTv,cancelTv;
    EditText editOptionName,editPriceUsd,editCapacity;
    ImageView plusImage;
    Spinner durationTypeSpinner;
    Button next_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create4_option_name);
        initView();
        toolbarSetUp();
    }

    private void initView() {
        steps = findViewById(R.id.steps);
        addOptionTv = findViewById(R.id.addOptionTv);
        minimum_required = findViewById(R.id.minimum_required);
        setUpCalenderTv = findViewById(R.id.setUpCalenderTv);
        cancelTv = findViewById(R.id.cancelTv);
        cancelTv.setOnClickListener(this);
        editOptionName = findViewById(R.id.editOptionName);
        editPriceUsd = findViewById(R.id.editPriceUsd);
        editCapacity = findViewById(R.id.editCapacity);

        plusImage = findViewById(R.id.plusImage);
        durationTypeSpinner = findViewById(R.id.durationTypeSpinner);
        next_button = findViewById(R.id.next_button);
        next_button.setOnClickListener(this);
    }

    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        menu_img= findViewById(R.id.menu_img);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Create Activity");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.next_button:
                break;
            case R.id.cancelTv:
                break;
        }
    }
}