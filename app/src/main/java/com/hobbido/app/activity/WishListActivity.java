package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.R;
import com.hobbido.app.adapter.AllTransactionAdapter;
import com.hobbido.app.adapter.WishlistAdapter;

import java.util.ArrayList;
import java.util.List;

public class WishListActivity extends BaseActivity implements View.OnClickListener{
    ImageView back_img,menu_img;
    TextView tv_title;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_wish_list);*/
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_wish_list, null, false);
        drawerLayout.addView(contentView, 0);
        initView();
        toolbarSetUp();
        setDataOnCategoryList();
    }

    public void initView(){
        recyclerView = findViewById(R.id.recyclerView);

    }


    public void setDataOnCategoryList() {

        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            arrayList.add("sannju");
        }
        WishlistAdapter adapter = new WishlistAdapter(this, arrayList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back_img:
                onBackPressed();
                break;
            case R.id.menu_img:
                checkDrawerOpen();
                break;

        }
    }
    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        back_img.setOnClickListener(this);
        menu_img= findViewById(R.id.menu_img);
        menu_img.setOnClickListener(this);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Wishlist");
    }

    public void dispatchDetailsNewActivity(){
        Intent intent = new Intent(WishListActivity.this,DetailsNewActivity.class);
        startActivity(intent);
    }
}