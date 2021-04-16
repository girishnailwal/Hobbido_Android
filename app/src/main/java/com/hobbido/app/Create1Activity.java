package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.hobbido.app.dialog.CustomCreateCancelDialog;
import com.hobbido.app.listener.DialogButtonListener;

public class Create1Activity extends AppCompatActivity implements View.OnClickListener {
    ImageView back_img,menu_img;
    TextView tv_title,steps,cancelTv;
    RadioButton radio_regular,radio_program;
    EditText editActiveName;
    Button next_button;
    Spinner selectCategorySpinner,selectSubCategorySpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create1);
        initView();
        toolbarSetUp();
    }

    private void initView() {
        selectCategorySpinner = findViewById(R.id.selectCategorySpinner);
        selectSubCategorySpinner = findViewById(R.id.selectSubCategorySpinner);
        cancelTv = findViewById(R.id.cancelTv);
        cancelTv.setOnClickListener(this);
        next_button = findViewById(R.id.next_button);
        next_button.setOnClickListener(this);
    }

    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        menu_img= findViewById(R.id.menu_img);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Create Activity");
    }
    public void onRadioButtonClicked(View view) {
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.next_button:

                break;
            case R.id.cancelTv:
                showCreateCancelDialog();
                break;
        }
    }

    private void showCreateCancelDialog() {
        new CustomCreateCancelDialog(this, new DialogButtonListener() {
            @Override
            public void onButtonClicked() {

            }
        }).show();
    }
}