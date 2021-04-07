package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.hobbido.app.R;
import com.hobbido.app.adapter.BecomeAHostAdapter;
import com.hobbido.app.adapter.CategoryAdapter;

import java.util.ArrayList;
import java.util.List;

public class BankDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_detials);
    }
}