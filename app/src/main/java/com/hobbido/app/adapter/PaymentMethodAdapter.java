package com.hobbido.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hobbido.app.R;

import java.util.List;

public class PaymentMethodAdapter extends RecyclerView.Adapter<PaymentMethodAdapter.MyViewHolder> {

    Context context;
    List<String> dataList;
    public PaymentMethodAdapter(Context context, List<String> dataList){
        this.context = context;
        this.dataList = dataList;
    }


    @NonNull
    @Override
    public PaymentMethodAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.payment_method_single_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PaymentMethodAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView image47;
        TextView accountNumberTv;
        RadioButton radioButton;
        EditText editCvv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image47 = itemView.findViewById(R.id.image47);
            accountNumberTv = itemView.findViewById(R.id.accountNumberTv);
            radioButton = itemView.findViewById(R.id.radioButton);
            editCvv = itemView.findViewById(R.id.editCvv);
        }

    }
}
