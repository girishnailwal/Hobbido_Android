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
import com.hobbido.app.adapter.DetailScreenImagesAdapter;
import com.hobbido.app.adapter.FeaturedListingAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView featuredListing_recyclerview , near_by_recyclerView, whats_new_recyclerView, recommended_recyclerView;
    Activity activity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        setDataOnList();
        setDataOnNearByList();
        setDataOnWhatsNewList();
        setDataOnRecommendedList();
    }

   public void initView(View view){
       featuredListing_recyclerview = view.findViewById(R.id.featuredListing_recyclerview);
       near_by_recyclerView = view.findViewById(R.id.near_by_recyclerView);
       whats_new_recyclerView = view.findViewById(R.id.whats_new_recyclerView);
       recommended_recyclerView = view.findViewById(R.id.recommended_recyclerView);
    }

    public void setDataOnList() {
        List<String> stringList = new ArrayList<>();
        FeaturedListingAdapter  featuredListingAdapter = new FeaturedListingAdapter(activity, stringList);
        LinearLayoutManager llm = new LinearLayoutManager(activity);
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        featuredListing_recyclerview.setLayoutManager(llm);
        featuredListing_recyclerview.setAdapter(featuredListingAdapter);
    }

    public void setDataOnNearByList(){
        List<String> stringList = new ArrayList<>();
        FeaturedListingAdapter  featuredListingAdapter = new FeaturedListingAdapter(activity, stringList);
        LinearLayoutManager llm = new LinearLayoutManager(activity);
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        near_by_recyclerView.setLayoutManager(llm);
        near_by_recyclerView.setAdapter(featuredListingAdapter);
    }

    public void setDataOnWhatsNewList(){
        List<String> stringList = new ArrayList<>();
        FeaturedListingAdapter  featuredListingAdapter = new FeaturedListingAdapter(activity, stringList);
        LinearLayoutManager llm = new LinearLayoutManager(activity);
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        whats_new_recyclerView.setLayoutManager(llm);
        whats_new_recyclerView.setAdapter(featuredListingAdapter);
    }


    public void setDataOnRecommendedList(){
        List<String> stringList = new ArrayList<>();
        FeaturedListingAdapter  featuredListingAdapter = new FeaturedListingAdapter(activity, stringList);
        LinearLayoutManager llm = new LinearLayoutManager(activity);
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        recommended_recyclerView.setLayoutManager(llm);
        recommended_recyclerView.setAdapter(featuredListingAdapter);
    }
}