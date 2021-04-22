package com.hobbido.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.internal.$Gson$Preconditions;
import com.hobbido.app.R;
import com.hobbido.app.fragment.HomeFragment;

import java.util.List;

public class FeaturedListingAdapter extends RecyclerView.Adapter<FeaturedListingAdapter.MyViewHolder> {

    Context context;
    List<String> dayList;
    Fragment fragment;


    public FeaturedListingAdapter(Context context, List<String> list, Fragment fragment) {
        this.context = context;
        this.dayList = list;
        this.fragment = fragment;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.featured_listing_single_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
       // String name = dayList.get(position);

        holder.itemView.setOnClickListener(v -> {
            ((HomeFragment)fragment).dispatchToDetailsActivity();
        });

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
