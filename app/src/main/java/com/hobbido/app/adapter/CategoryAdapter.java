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

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyViewHolder> {
    int categoryImages[] = { R.drawable.mask_group_9,R.drawable.mask_group_10,R.drawable.mask_group_11,R.drawable.mask_group_11,R.drawable.mask_group_11, R.drawable.mask_group_11};
    Context context;
    List<String> dayList;
    public CategoryAdapter(Context context, List<String> list) {
        this.context = context;
        this.dayList = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.category_single_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String name = dayList.get(position);

        if(position == 0){
            holder.tv_category.setText("Singing");
            holder.img_category.setImageResource(categoryImages[position]);
        }else if(position == 1){
            holder.tv_category.setText("Dancing");
            holder.img_category.setImageResource(categoryImages[position]);
        }else if(position == 2){
            holder.tv_category.setText("Comedy");
            holder.img_category.setImageResource(categoryImages[position]);
        }else if(position == 3){
            holder.tv_category.setText("Singing");
            holder.img_category.setImageResource(categoryImages[position]);
        }else if(position == 4){
            holder.tv_category.setText("Dancing");
            holder.img_category.setImageResource(categoryImages[position]);
        }
        else if(position == 5){
            holder.tv_category.setText("Comedy");
            holder.img_category.setImageResource(categoryImages[position]);
        }

    }

    @Override
    public int getItemCount() {
        return dayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_category;
        ImageView img_category;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_category = (TextView) itemView.findViewById(R.id.tv_category);
            img_category = (ImageView) itemView.findViewById(R.id.img_category);
        }
    }
}
