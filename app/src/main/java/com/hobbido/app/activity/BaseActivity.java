package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.hobbido.app.AppSettingActivity;
import com.hobbido.app.HelpCenterActivity;
import com.hobbido.app.LegalInfoActivity;
import com.hobbido.app.MessageActivity;
import com.hobbido.app.PaymentMethodActivity;
import com.hobbido.app.R;

public class BaseActivity extends AppCompatActivity implements View.OnClickListener {
    protected DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView myCartImageView,message_imge,walletImageView;
    ConstraintLayout myBooking_cl,prepaidSession_cl,myRewards_cl,paymentMethods_cl,wishlist_cl,language_cl,setting_cl,becomeAHost_cl,
            helpCenter_cl,aboutHobbido_cl,legal_cl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigationView);


        myBooking_cl = findViewById(R.id.myBooking_cl);
        myBooking_cl.setOnClickListener(v -> {
            closeDrawer();
            dispatchToMyBookingActivity();

        });
        prepaidSession_cl = findViewById(R.id.prepaidSession_cl);
        prepaidSession_cl.setOnClickListener(v -> {
            dispatchToPrepaidSessionActivity();
        });
        myRewards_cl = findViewById(R.id.myRewards_cl);
        myRewards_cl.setOnClickListener(this);
        paymentMethods_cl = findViewById(R.id.paymentMethods_cl);
        paymentMethods_cl.setOnClickListener(v -> {
            closeDrawer();
            dispatchToPaymentMethodActivity();
        });
        wishlist_cl = findViewById(R.id.wishlist_cl);
        wishlist_cl.setOnClickListener(v -> {
            closeDrawer();
            dispatchToWishListActivity();

        });
        language_cl = findViewById(R.id.language_cl);
        language_cl.setOnClickListener(v -> {
            closeDrawer();
            dispatchToLanguageActivity();
        });
        setting_cl = findViewById(R.id.setting_cl);
        setting_cl.setOnClickListener(v -> {
            closeDrawer();
            dispatchToAppSettingActivity();
        });
        becomeAHost_cl = findViewById(R.id.becomeAHost_cl);
        becomeAHost_cl.setOnClickListener(v -> {
            closeDrawer();
            dispatchToBecomeHostActivity();
        });
        helpCenter_cl = findViewById(R.id.helpCenter_cl);
        helpCenter_cl.setOnClickListener(v -> {
            closeDrawer();
            dispatchToHelpCenterActivity();
        });
        aboutHobbido_cl = findViewById(R.id.aboutHobbido_cl);

        legal_cl = findViewById(R.id.legal_cl);
        legal_cl.setOnClickListener(v -> {
            closeDrawer();
            dispatchToLegalInfoActivity();
        });
        myCartImageView = findViewById(R.id.myCartImageView);
        myCartImageView.setOnClickListener(v -> {
            closeDrawer();
            dispatchToMyCartActivity();
        });
        message_imge = findViewById(R.id.message_imge);
        message_imge.setOnClickListener(v -> {
            closeDrawer();
            dispatchToMessageActivity();
        });
        walletImageView = findViewById(R.id.walletImageView);
        walletImageView.setOnClickListener(v -> {
            closeDrawer();
            dispatchToWalletActivity();
        });
    }




    public void closeDrawer(){
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }



    public void checkDrawerOpen() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            drawerLayout.openDrawer(GravityCompat.START);
        }
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }



    private void dispatchToMyBookingActivity() {
        Intent intent = new Intent(BaseActivity.this,MyBookingActivity.class);
        startActivity(intent);
    }
    private void dispatchToPaymentMethodActivity() {
        Intent intent = new Intent(BaseActivity.this, PaymentMethodActivity.class);
        startActivity(intent);
    }
    private void dispatchToPrepaidSessionActivity() {
        Intent intent = new Intent(BaseActivity.this, PrepaidSessionActivity.class);
        startActivity(intent);
    }

    private void dispatchToLanguageActivity() {
        Intent intent = new Intent(BaseActivity.this, LanguageNewActivity.class);
        startActivity(intent);
    }
    private void dispatchToAppSettingActivity() {
        Intent intent = new Intent(BaseActivity.this, AppSettingActivity.class);
        startActivity(intent);
    }
    private void dispatchToBecomeHostActivity() {
        Intent intent = new Intent(BaseActivity.this, BecomeHostActivity.class);
        startActivity(intent);
    }
    private void dispatchToHelpCenterActivity() {
        Intent intent = new Intent(BaseActivity.this, HelpCenterActivity.class);
        startActivity(intent);
    }
    private void dispatchToLegalInfoActivity() {
        Intent intent = new Intent(BaseActivity.this, LegalInfoActivity.class);
        startActivity(intent);
    }
    private void dispatchToMyCartActivity() {
        Intent intent = new Intent(BaseActivity.this, MyCartActivity.class);
        startActivity(intent);
    }
    private void dispatchToMessageActivity() {
        Intent intent = new Intent(BaseActivity.this, MessageActivity.class);
        startActivity(intent);
    }
    protected void dispatchToWalletActivity() {
        Intent intent = new Intent(BaseActivity.this, WalletActivity.class);
        startActivity(intent);
    }
    private void dispatchToWishListActivity() {
        Intent intent = new Intent(BaseActivity.this, WishListActivity.class);
        startActivity(intent);
    }
    @Override
    public void onClick(View v) {

    }
}