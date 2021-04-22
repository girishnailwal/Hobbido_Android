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

public class SortBottomSheet extends BottomSheetDialogFragment implements View.OnClickListener {

    public static final String TAG = "ActionBottomDialog";

    private ItemClickListener mListener;

    public static SortBottomSheet newInstance() {
        return new SortBottomSheet();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // return inflater.inflate(R.layout.profile_image_picker_bottom_sheet, container, false);
        return inflater.inflate(R.layout.sort_bottom_sheet, container, false);
    }

    @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof ItemClickListener) {
            mListener = (ItemClickListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement ItemClickListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override public void onClick(View view) {

        switch(view.getId()){

        }

        // mListener.onItemClick(tvSelected.getText().toString());
        //dismiss();
    }

    public interface ItemClickListener {
        void onItemClick();
    }
}
