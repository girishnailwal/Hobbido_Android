package com.hobbido.app.fragment;

import android.app.Activity;
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
import com.hobbido.app.adapter.RegularNewAdapter;
import com.hobbido.app.bottomSheet.OptionABottomSheet;
import com.hobbido.app.bottomSheet.SortBottomSheet;

import java.util.ArrayList;
import java.util.List;


public class RegularNewFragment extends Fragment implements OptionABottomSheet.ItemClickListener {


    RecyclerView recyclerView;
    Activity activity;

    public RegularNewFragment() {
        // Required empty public constructor
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
        return inflater.inflate(R.layout.fragment_regular_new, container, false);
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

        RegularNewAdapter adapter = new RegularNewAdapter(activity, arrayList,this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(activity);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void showOptionBottomSheet() {


        /*OptionABottomSheet sortBottomSheet = OptionABottomSheet.newInstance();
        sortBottomSheet.show(getActivity().getSupportFragmentManager(), OptionABottomSheet.TAG);*/
    }
    @Override
    public void onItemClick(String item) {

    }
}