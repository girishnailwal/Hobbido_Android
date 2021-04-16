package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hobbido.app.dialog.CustomAddToCartDialog;
import com.hobbido.app.dialog.CustomAddToWaitListDialog;
import com.hobbido.app.listener.DialogButtonListener;

public class SuccessfullActivity extends AppCompatActivity  implements View.OnClickListener {

    Button need_help_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successfull);
       initView();
    }

    public void initView(){
        need_help_button = findViewById(R.id.need_help_button);
        need_help_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.need_help_button:
                showDialog();
                break;
        }
    }

    public void showDialog(){
        new CustomAddToWaitListDialog(this, new DialogButtonListener() {
            @Override
            public void onButtonClicked() {

            }
        }).show();
    }
}