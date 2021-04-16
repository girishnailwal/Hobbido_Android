package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Create4LevelNameActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView back_img,menu_img;
    TextView tv_title,steps,add_option,circle_minus1,tv_value1,circle_plus1,cancelTv,setUpCalenderTv;
    EditText editLevelName,editPrice,editCapacity;
    ImageView plusImage;
    Button next_button;
    Spinner durationTypeSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create4_level_name);
        initView();
        toolbarSetUp();
    }
    private void initView() {
        steps = findViewById(R.id.steps);
        circle_minus1 = findViewById(R.id.circle_minus1);
        tv_value1 = findViewById(R.id.tv_value1);
        circle_plus1 = findViewById(R.id.circle_plus1);
        cancelTv = findViewById(R.id.cancelTv);
        cancelTv.setOnClickListener(this);
        editLevelName = findViewById(R.id.editLevelName);
        editPrice = findViewById(R.id.editPrice);
        editCapacity = findViewById(R.id.editCapacity);

        plusImage = findViewById(R.id.plusImage);
        setUpCalenderTv = findViewById(R.id.setUpCalenderTv);
        durationTypeSpinner = findViewById(R.id.durationTypeSpinner);
        next_button = findViewById(R.id.next_button);
        next_button.setOnClickListener(this);
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

    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        menu_img= findViewById(R.id.menu_img);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Create Activity");
    }
}