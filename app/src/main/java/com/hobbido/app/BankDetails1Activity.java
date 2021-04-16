package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.dialog.CustomConfirmDialog;
import com.hobbido.app.listener.DialogButtonListener;

public class BankDetails1Activity extends AppCompatActivity implements View.OnClickListener {
    ImageView back_img,menu_img;
    TextView tv_title;
    EditText editCountryRemittance,editBankName,editBranchAddress,editSwiftCode,editRoutingNumber,editBeneficiaryName,
            editBeneficiaryAccount,editBeneficiaryAddress;
    Button changeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_details1);
        initView();
        toolbarSetUp();
    }

    private void initView() {
        editCountryRemittance = findViewById(R.id.editCountryRemittance);
        editBankName = findViewById(R.id.editBankName);
        editBranchAddress = findViewById(R.id.editBranchAddress);
        editSwiftCode = findViewById(R.id.editSwiftCode);
        editRoutingNumber = findViewById(R.id.editRoutingNumber);
        editBeneficiaryName = findViewById(R.id.editBeneficiaryName);
        editBeneficiaryAccount = findViewById(R.id.editBeneficiaryAccount);
        editBeneficiaryAddress = findViewById(R.id.editBeneficiaryAddress);
        changeButton = findViewById(R.id.changeButton);
        changeButton.setOnClickListener(this);
    }

    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        menu_img= findViewById(R.id.menu_img);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Bank Details");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.changeButton:
                showCustomConfirmDialog();
                break;
        }
    }

    private void showCustomConfirmDialog() {
        new CustomConfirmDialog(this, new DialogButtonListener() {
            @Override
            public void onButtonClicked() {

            }
        }).show();
    }
}