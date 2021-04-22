package com.hobbido.app.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.R;
import com.hobbido.app.listener.DialogButtonListener;
import com.hobbido.app.listener.DialogButtonListenerWithText;

public class CustomAppSettingDialog extends Dialog implements View.OnClickListener{
    DialogButtonListenerWithText listener;
    String message, alert;
    TextView messageText, alertText;
    Button logoutButton,cancelButton;
    ImageView close_img;

    public CustomAppSettingDialog(Context context, DialogButtonListenerWithText listener){
        super(context);
        this.listener = listener;
        this.message = message;
        this.alert = alert;
        this.setCancelable(false);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.app_setting_dialog_layout);

        getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        getWindow().setGravity(Gravity.CENTER_HORIZONTAL);
        close_img = findViewById(R.id.close_img);
        close_img.setOnClickListener(this);
        logoutButton = findViewById(R.id.logoutButton);
        logoutButton.setOnClickListener(v -> {
            if(listener!=null){
                listener.onButtonClicked("Logout");
            }
        });
        cancelButton = findViewById(R.id.cancelButton);
        cancelButton.setOnClickListener(v -> {
            if(listener!=null){
                listener.onButtonClicked("Cancel");
            }
        });


    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.close_img:
                dismiss();
                break;

        }
    }

}
