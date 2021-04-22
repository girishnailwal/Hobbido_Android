package com.hobbido.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hobbido.app.R;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.MyViewHolders> {
   Context context;
   List<String> dataList;

public NotificationAdapter(Context context,List<String> dataList){
    this.context = context;
    this.dataList = dataList;
}


    @NonNull
    @Override
    public MyViewHolders onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.notification_single_row,parent,false);
        return new MyViewHolders(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolders holder, int position) {
//     if(position==0){
//         holder.acceptTv.setVisibility(View.VISIBLE);
//         holder.acceptTv.setVisibility(View.VISIBLE);
//     }else {
//         holder.acceptTv.setVisibility(View.GONE);
//         holder.acceptTv.setVisibility(View.GONE);
//     }
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyViewHolders extends RecyclerView.ViewHolder {
     ImageView subimg;
     TextView tv_title,tv_time,tv_subtittle,acceptTv,rejectTv;
     public MyViewHolders(@NonNull View itemView) {
         super(itemView);
         subimg = itemView.findViewById(R.id.subimg);
         tv_title = itemView.findViewById(R.id.tv_title);
         tv_time = itemView.findViewById(R.id.tv_time);
         tv_subtittle = itemView.findViewById(R.id.tv_subtittle);
         acceptTv = itemView.findViewById(R.id.acceptTv);
         rejectTv = itemView.findViewById(R.id.rejectTv);
     }
 }
}
