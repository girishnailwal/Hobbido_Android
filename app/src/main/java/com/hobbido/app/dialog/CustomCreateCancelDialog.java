package com.hobbido.app.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.hobbido.app.R;
import com.hobbido.app.listener.DialogButtonListener;

public class CustomCreateCancelDialog extends Dialog {
    DialogButtonListener listener;
    String message, alert;
    TextView messageText, alertText;
    Button okayBtn;

    public CustomCreateCancelDialog(Context context,DialogButtonListener listener) {
        super(context);
        this.listener = listener;
        this.message = message;
        this.alert = alert;
        this.setCancelable(false);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_create_cancel_dialog);

        getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        getWindow().setGravity(Gravity.CENTER_HORIZONTAL);
    }
}
