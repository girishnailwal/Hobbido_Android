package com.hobbido.app.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hobbido.app.R;
import com.hobbido.app.activity.BaseActivity;
import com.hobbido.app.activity.BookingActivity;
import com.hobbido.app.activity.WishListActivity;
import com.hobbido.app.adapter.MyBookingAdapter;
import com.hobbido.app.adapter.UpComingAdapter;

import java.util.ArrayList;
import java.util.List;

public class UpComingFragment extends Fragment {

    RecyclerView recyclerView ;
    Activity activity;

    public UpComingFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_up_coming, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        setDataOnCategoryList();
    }

    public void initView(View view){
        recyclerView = view.findViewById(R.id.recyclerView);
    }


    public void setDataOnCategoryList() {

        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            arrayList.add("sannju");
        }

        UpComingAdapter adapter = new UpComingAdapter(activity, arrayList,this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(activity);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    public void dispatchToBookingActivity(){
        Intent intent = new Intent(activity, BookingActivity.class);
        startActivity(intent);
    }
}