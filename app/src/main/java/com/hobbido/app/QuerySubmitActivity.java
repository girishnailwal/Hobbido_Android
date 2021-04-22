package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class QuerySubmitActivity extends AppCompatActivity {

    Button closeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query_submit);
        closeButton = findViewById(R.id.closeButton);
    }
}