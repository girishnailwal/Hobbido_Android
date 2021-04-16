package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.R;
import com.hobbido.app.fragment.PhoneNumberFragment;
import com.hobbido.app.fragment.RemoveCardFragment;
import com.hobbido.app.fragment.UpComingFragment;

public class PaymentDetailsActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView back_img,menu_img;
    TextView tv_title;
    EditText editCardHolderName,editCardNum,editExpDate,editCvv;
    Button addButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_details);

        initView();
        customtool_baar();
    }



    private void initView() {
        editCardHolderName= findViewById(R.id.editCardHolderName);
        editCardNum= findViewById(R.id.editCardNum);
        editExpDate= findViewById(R.id.editExpDate);
        editCvv= findViewById(R.id.editCvv);

        addButton= findViewById(R.id.addButton);
        addButton.setOnClickListener(this);
    }

    private void customtool_baar() {
        back_img= findViewById(R.id.back_img);
        menu_img= findViewById(R.id.menu_img);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Add New Card");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.addButton:
//                RemoveCardFragment fragment = new RemoveCardFragment();
//                FragmentManager fragmentManager = getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentTransaction.replace(R.id.fragment_container, fragment);
//                fragmentTransaction.commit();
                break;
        }
    }

}