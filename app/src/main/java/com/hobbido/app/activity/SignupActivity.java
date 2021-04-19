package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.hobbido.app.R;

public class SignupActivity extends AppCompatActivity {

    TextView tv_terms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
       // setContentView(R.layout.test);
      //  initView();
      //  clickablePrivacyPolicy();
    }

    public void initView(){
        tv_terms = findViewById(R.id.tv_terms);
    }

    public void clickablePrivacyPolicy(){

        ClickableSpan terms = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Toast.makeText(SignupActivity.this, "Tesrm and condition", Toast.LENGTH_SHORT).show();

            }
        };

        ClickableSpan privacy = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Toast.makeText(SignupActivity.this, "Privay policy", Toast.LENGTH_SHORT).show();

            }
        };

        setClickableString(getString(R.string.terms_and_policy), tv_terms, new String[]{"terms of use", "privacy policy"}, new ClickableSpan[]{terms, privacy});


    }




    public void setClickableString(String wholeValue, TextView textView, final String[] clickableValue, ClickableSpan[] clickableSpans) {
        SpannableString spannableString = new SpannableString(wholeValue);

        for (int i = 0; i < clickableValue.length; i++) {
            ClickableSpan clickableSpan = clickableSpans[i];
            String link = clickableValue[i];

            int startIndexOfLink = wholeValue.indexOf(link);
            spannableString.setSpan(clickableSpan, startIndexOfLink, startIndexOfLink + link.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
        textView.setHighlightColor(
                Color.TRANSPARENT); // prevent TextView change background when highlight
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }
}