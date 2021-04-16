package com.hobbido.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hobbido.app.R;

import java.util.List;

public class RiverRaftingAdapter extends RecyclerView.Adapter<RiverRaftingAdapter.MyViewHolder> {

    Context context;
    List<String> dataList;

    public RiverRaftingAdapter(Context context,List<String> dataList){
        this.context = context;
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.river_rafting_list_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView subimg;
        TextView tv_title,tv_time,tv_subtittle;
        RatingBar ratingBar;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            subimg = itemView.findViewById(R.id.subimg);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_time = itemView.findViewById(R.id.tv_time);
            tv_subtittle = itemView.findViewById(R.id.tv_subtittle);
            ratingBar = itemView.findViewById(R.id.ratingBar);
        }
    }
}
