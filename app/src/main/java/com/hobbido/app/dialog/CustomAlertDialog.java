package com.hobbido.app.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView;

import com.hobbido.app.R;
import com.hobbido.app.activity.MyBookingActivity;
import com.hobbido.app.listener.DialogButtonListener;


public class CustomAlertDialog extends Dialog {
    DialogButtonListener listener;
    String message, alert;
    TextView messageText, alertText;
    Button okayBtn;
    ImageView closeImageView;

    public CustomAlertDialog(Context context, DialogButtonListener listener) {
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

        setContentView(R.layout.custom_alert_dialog);

        getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        getWindow().setGravity(Gravity.CENTER_HORIZONTAL);
        closeImageView = findViewById(R.id.closeImageView);
        closeImageView.setOnClickListener(v -> {
            dismiss();
        });
    }
}