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
import com.hobbido.app.fragment.ProgramNewFragment;

import java.util.List;

public class ProgramNewAdapter extends RecyclerView.Adapter<ProgramNewAdapter.MyViewHolder> {

    Context context;
    List<String> dayList;
    Fragment fragment;
    public ProgramNewAdapter(Context context, List<String> list,Fragment fragment) {
        this.context = context;
        this.dayList = list;
        this.fragment = fragment;
    }

    @NonNull
    @Override
    public ProgramNewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.program_single_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgramNewAdapter.MyViewHolder holder, int position) {
        holder.itemView.setOnClickListener(v -> {
            ((ProgramNewFragment)fragment).dispatchToDetailsNewActivity();
        });
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
         ImageView imageView33,imageView32;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView32 = itemView.findViewById(R.id.imageView32);
            imageView32.setVisibility(View.GONE);
            imageView33 = itemView.findViewById(R.id.imageView33);
            imageView33.setVisibility(View.GONE);


        }
    }
}
