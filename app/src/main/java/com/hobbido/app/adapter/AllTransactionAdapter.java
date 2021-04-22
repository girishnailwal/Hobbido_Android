package com.hobbido.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.hobbido.app.R;
import com.hobbido.app.activity.AllTransactionActivity;
import com.hobbido.app.activity.WalletActivity;

import java.util.List;

public class AllTransactionAdapter extends RecyclerView.Adapter<AllTransactionAdapter.MyViewHolder> {

    Context context;
    List<String> dataList;

    public AllTransactionAdapter(Context context, List<String> dataList){
        this.context = context;
        this.dataList = dataList;
    }


    @NonNull
    @Override
    public AllTransactionAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.all_transaction_single_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllTransactionAdapter.MyViewHolder holder, int position) {
         holder.itemView.setOnClickListener(v -> {
             ((AllTransactionActivity)context).dispatchToSuccessActivity();
         });

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
