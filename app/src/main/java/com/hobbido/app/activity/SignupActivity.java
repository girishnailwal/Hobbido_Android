package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.hobbido.app.R;

public class SignupActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tv_terms;
    ImageView backImageViews,langImageView;
    Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
       initiViews();
        clickablePrivacyPolicy();
    }

    public void initiViews(){
        tv_terms = findViewById(R.id.tv_terms);
        backImageViews = findViewById(R.id.backImageViews);
        backImageViews.setOnClickListener(this);
        registerButton = findViewById(R.id.registerButton);
        registerButton.setOnClickListener(this);
        langImageView = findViewById(R.id.langImageView);
        langImageView.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.backImageViews:
                dispatchToLoginActivity();
                break;
            case R.id.registerButton:
                dispatchToProfileSetUpActivity();
                break;
            case R.id.langImageView:
                dispatchToLanguageActivity();
                break;
        }
    }

    private void dispatchToProfileSetUpActivity() {
        Intent intent = new Intent(SignupActivity.this, ProfileSetUpActivity.class);
        startActivity(intent);
        finish();
    }

    private void dispatchToLoginActivity() {
        Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
    private void dispatchToLanguageActivity() {
        Intent intent = new Intent(SignupActivity.this, LanguageActivity.class);
        startActivity(intent);
        finish();
    }
}