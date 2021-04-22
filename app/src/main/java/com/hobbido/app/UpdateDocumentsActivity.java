package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class UpdateDocumentsActivity extends AppCompatActivity {
    ImageView back_img,menu_img;
    TextView tv_title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_documents);
        toolbarSetUp();
    }

    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        menu_img= findViewById(R.id.menu_img);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Update Documents");
    }
}