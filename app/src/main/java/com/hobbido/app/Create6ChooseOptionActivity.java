package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Create6ChooseOptionActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView back_img,menu_img;
    TextView tv_title,steps,circle_minus1,tv_value1,circle_plus1,cancelTv;
    Spinner chooseAnOptionTypeSpinner;
    ImageView plusImage;
    EditText editPackageName,editSessions,editDiscountAmount;
    Button next_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create6_choose_option);
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
        editPackageName = findViewById(R.id.editPackageName);
        editSessions = findViewById(R.id.editSessions);
        editDiscountAmount = findViewById(R.id.editDiscountAmount);

        plusImage = findViewById(R.id.plusImage);
        chooseAnOptionTypeSpinner = findViewById(R.id.chooseAnOptionTypeSpinner);
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