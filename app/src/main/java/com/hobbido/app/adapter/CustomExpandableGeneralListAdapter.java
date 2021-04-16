package com.hobbido.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.R;

import java.util.List;
import java.util.Map;

public class CustomExpandableGeneralListAdapter extends BaseExpandableListAdapter {

    private Context context;
    private List<String> expandableListTitle;
    private Map<String,List<String>> expandableListDetail;

    public CustomExpandableGeneralListAdapter(Context context, List<String> expandableListTitle) {
        this.context = context;
        this.expandableListTitle = expandableListTitle;
    }
    @Override
    public int getGroupCount() {
        return this.expandableListTitle.size();
    }

    @Override
    public int getChildrenCount(int listPosition) {
        return this.expandableListDetail.get(this.expandableListTitle.get(listPosition)).size();
    }

    @Override
    public Object getGroup(int listPosition) {
        return this.expandableListTitle.get(listPosition);
    }

    @Override
    public Object getChild(int listPosition, int expandedListPosition) {
        return this.expandableListDetail.get(this.expandableListTitle.get(listPosition)).get(expandedListPosition);
    }

    @Override
    public long getGroupId(int listPosition) {
        return listPosition;
    }

    @Override
    public long getChildId(int listPosition, int expandedListPosition) {
        return expandedListPosition;
    }



    @Override
    public View getGroupView(int listPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String listTitle = (String) getGroup(listPosition);

        if(convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.general_list_group_single_row,null);
        }

        TextView listTitleGroup = (TextView) convertView.findViewById(R.id.listTitle);
        listTitleGroup.setText(listTitle);



        ImageView list_arrow_up_down = (ImageView) convertView.findViewById(R.id.arrowdown);

        if(isExpanded) {
            list_arrow_up_down.setImageDrawable(context.getResources().getDrawable(R.drawable.arrow_up));
        } else {
            list_arrow_up_down.setImageDrawable(context.getResources().getDrawable(R.drawable.xmlid_225));
        }

        return convertView;
    }

    @Override
    public View getChildView(int listPosition, int expandedListPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        String listItem = (String) getChild(listPosition, expandedListPosition);

        if(convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.general_list_item_single_row,null);
        }
        TextView expandedListItem = convertView.findViewById(R.id.expandedListItem);
        expandedListItem.setText(listItem);
        return convertView;
    }
    @Override
    public boolean hasStableIds() {
        return false;
    }


    @Override
    public boolean isChildSelectable(int listPosition, int expandedListPosition) {
        return true;
    }
}
