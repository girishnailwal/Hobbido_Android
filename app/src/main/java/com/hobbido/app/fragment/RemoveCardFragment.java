package com.hobbido.app.fragment;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.R;


public class RemoveCardFragment extends Fragment {

    ImageView back_img,menu_img;
    TextView tv_title,accountNumTv,expireDate,cancelTv;
    Button removeButton;
    Activity activity;

    public RemoveCardFragment(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_remove_card, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        customtool_baar(view);
    }



    private void initView(View view) {
        accountNumTv = view.findViewById(R.id.accountNumTv);
        expireDate = view.findViewById(R.id.expireDate);
        cancelTv = view.findViewById(R.id.cancelTv);

        removeButton = view.findViewById(R.id.removeButton);
    }

    private void customtool_baar(View view) {
        back_img= view.findViewById(R.id.back_img);
        menu_img= view.findViewById(R.id.menu_img);
        tv_title = view.findViewById(R.id.tv_title);
        tv_title.setText("Remove Card");
    }
}