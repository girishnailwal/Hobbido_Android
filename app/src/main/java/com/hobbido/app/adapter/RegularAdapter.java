package com.hobbido.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.hobbido.app.R;
import com.hobbido.app.fragment.RegularFragment;

import java.util.List;

public class RegularAdapter extends RecyclerView.Adapter<RegularAdapter.MyViewHolder> {

    Context context;
    List<String> dayList;
    Fragment fragment;
    public RegularAdapter(Context context, List<String> list, Fragment fragment) {
        this.context = context;
        this.dayList = list;
        this.fragment = fragment;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.regular_single_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
      holder.itemView.setOnClickListener(v -> {
          ((RegularFragment)fragment).dispatchToDetailsActivity();
      });
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView calenderImageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            calenderImageView = itemView.findViewById(R.id.calenderImageView);

        }
    }
}
