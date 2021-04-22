package com.hobbido.app.bottomSheet;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.hobbido.app.R;

public class OptionABottomSheet extends BottomSheetDialogFragment implements View.OnClickListener {

    public static final String TAG = "ActionBottomDialog";
    private ItemClickListener mListener;

    public static OptionABottomSheet newInstance(){
        return new OptionABottomSheet();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.option_a_bottom_sheet,container,false);
    }

    @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof ItemClickListener){
            mListener = (ItemClickListener) context;
        }else {
            throw new RuntimeException(context.toString()+"must implement ItemClickListener");
        }
    }


    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

        }
    }

    public interface ItemClickListener {
        void onItemClick(String item);
    }
}
