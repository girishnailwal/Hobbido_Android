package com.hobbido.app.fragment;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.R;
import com.hobbido.app.adapter.MessageAdapter;
import com.hobbido.app.adapter.RiverRaftingAdapter;

import java.util.ArrayList;
import java.util.List;

public class RiverRaftingFragment extends Fragment {

    ImageView back_img,menu_img;
    TextView tv_title;
    RecyclerView recycleview;
    Activity activity;

   public RiverRaftingFragment(){

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
        return inflater.inflate(R.layout.fragment_river_rafting, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        setOnMessageDataList();
        customtool_baar();
    }



    public void initView(View view) {
        recycleview = view.findViewById(R.id.recycleview);
    }

    public void setOnMessageDataList() {
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            arrayList.add("sannju");
        }

        RiverRaftingAdapter adapter = new RiverRaftingAdapter(activity, arrayList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(activity);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recycleview.setLayoutManager(layoutManager);
        recycleview.setAdapter(adapter);
    }

    public void customtool_baar() {
        back_img= getView().findViewById(R.id.back_img);
        menu_img= getView().findViewById(R.id.menu_img);
        menu_img.setVisibility(View.GONE);
        tv_title = getView().findViewById(R.id.tv_title);
        tv_title.setText("River Rafting");
    }
}