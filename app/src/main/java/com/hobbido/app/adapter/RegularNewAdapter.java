package com.hobbido.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.hobbido.app.R;

import com.hobbido.app.fragment.RegularNewFragment;

import java.util.List;

public class RegularNewAdapter extends RecyclerView.Adapter<RegularNewAdapter.MyViewHolder> {

    Context context;
    List<String> dayList;
    Fragment fragment;
    public RegularNewAdapter(Context context, List<String> list,Fragment fragment) {
        this.context = context;
        this.dayList = list;
        this.fragment = fragment;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.regular_new_single_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.redeemTv.setOnClickListener(v -> {
            ((RegularNewFragment)fragment).showOptionBottomSheet();
        });

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView redeemTv;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            redeemTv = itemView.findViewById(R.id.redeemTv);

        }
    }

}
