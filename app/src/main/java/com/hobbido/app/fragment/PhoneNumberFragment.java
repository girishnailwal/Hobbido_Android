package com.hobbido.app.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.hobbido.app.R;
import com.hobbido.app.activity.VerificationActivity;


public class PhoneNumberFragment extends Fragment implements View.OnClickListener {
    public static final String TAG = "PhoneNumberFragment";
    Button nextButton;
    public PhoneNumberFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_phone_number, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        nextButton = view.findViewById(R.id.nextButton);
        nextButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.nextButton:
                dispatchToVerificationActivity();
                break;
        }
    }

    private void dispatchToVerificationActivity() {

        Intent intent = new Intent(getActivity().getApplication(), VerificationActivity.class);
        startActivity(intent);
    }
}