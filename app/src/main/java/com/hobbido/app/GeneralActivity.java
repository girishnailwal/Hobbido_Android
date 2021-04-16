package com.hobbido.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.adapter.CustomExpandableGeneralListAdapter;

import java.util.ArrayList;
import java.util.List;

public class GeneralActivity extends AppCompatActivity {
    ImageView back_img,menu_img;
    TextView tv_title;
    ExpandableListView expandableListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);
        initView();
        toolbarSetUp();

        expandableListView.setOnChildClickListener((parent, v, groupPosition, childPosition, id) -> {
            // Toast.makeText(getApplicationContext(),expandableListTitle.get(groupPosition) + " -> "+ expandableListDetail.get(expandableListTitle.get(groupPosition)).get(childPosition), Toast.LENGTH_SHORT).show();
            int index = parent.getFlatListPosition(ExpandableListView.getPackedPositionForChild(groupPosition, childPosition));
            parent.setItemChecked(index, true);
            selectedchildPosition = index;
            return false;
        });
    }
    private void initView() {
        expandableListView = findViewById(R.id.expandableListView);
        expandiblelistbind();
    }
    public int selectedchildPosition = 0;
    public void expandiblelistbind() {
        List<String> string_list = new ArrayList<>();
        for(int i = 0; i<2;i++){
            string_list.add("Arjun");
        }
        CustomExpandableGeneralListAdapter expandableListAdapter = new CustomExpandableGeneralListAdapter(this, string_list);
        expandableListView.setAdapter(expandableListAdapter);
        expandableListView.setOnGroupExpandListener(groupPosition -> {
            for (int g = 0; g < expandableListAdapter.getGroupCount(); g++) {
                if (g != groupPosition) {
                    expandableListView.collapseGroup(g);
                }
            }
        });
    }
    private void toolbarSetUp() {
        back_img= findViewById(R.id.back_img);
        menu_img= findViewById(R.id.menu_img);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("General");
    }
}