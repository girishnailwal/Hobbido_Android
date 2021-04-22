package com.hobbido.app.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.hobbido.app.R;
import com.hobbido.app.activity.CategoryActivity;
import com.hobbido.app.activity.HostAggrementActivity;
import com.hobbido.app.adapter.CategoryAdapter;

import java.util.ArrayList;
import java.util.List;


public class CategoriesFragment extends Fragment implements View.OnClickListener{
    RecyclerView recyclerView;
    Button nextButton;
    Activity activity;
    public CategoriesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = getActivity();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_categories, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        setDataOnCategoryList();
    }

    public void initView(View view){
        recyclerView = view.findViewById(R.id.recyclerView);
        nextButton = view.findViewById(R.id.nextButton);
        nextButton.setOnClickListener(this);
    }

    public void setDataOnCategoryList() {

        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            arrayList.add("sannju");
        }

        CategoryAdapter adapter = new CategoryAdapter(activity, arrayList);
        GridLayoutManager manager = new GridLayoutManager(activity, 3, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            /*case R.id.nextButton:
                dispatchToHostAggrementActivity();
                break;*/
        }
    }

   /* private void dispatchToHostAggrementActivity() {
        Intent intent = new Intent(activity, HostAggrementActivity.class);
        startActivity(intent);

    }*/
}