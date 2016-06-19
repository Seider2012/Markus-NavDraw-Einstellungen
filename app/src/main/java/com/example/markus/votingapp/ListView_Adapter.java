package com.example.markus.votingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Markus on 09.04.2016.
 */
public class ListView_Adapter extends BaseExpandableListAdapter {

    private Context ctx;
    private ArrayList<Restaurant> restaurants=new ArrayList<Restaurant>();
    private int childcount =1;

    ListView_Adapter(Context ctx,ArrayList<Restaurant> restaurants){
        this.ctx=ctx;
        this.restaurants=restaurants;
    }

    @Override
    public int getGroupCount() {
        return restaurants.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return childcount;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return restaurants.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return restaurants.get(groupPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        Restaurant rs= (Restaurant)this.getGroup(groupPosition);
        String name=rs.getName();
        if(convertView==null){
            LayoutInflater layoutInflater= (LayoutInflater) this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView =layoutInflater.inflate(R.layout.listview_head_layout,null);
        }

            ((ImageView) convertView.findViewById(R.id.videos_group_indicator))
                    .setImageResource(isExpanded?R.drawable.ic_keyboard_arrow_up_black_24dp :R.drawable.ic_keyboard_arrow_down_black_24dp);



        TextView tv_name= (TextView) convertView.findViewById(R.id.tv_name);
        tv_name.setText(name);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        Restaurant rs= (Restaurant)this.getChild(groupPosition, childPosition);
        if(convertView==null){
            LayoutInflater layoutInflater= (LayoutInflater) this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView =layoutInflater.inflate(R.layout.listview_layout,null);
        }
        TextView strasse= (TextView) convertView.findViewById(R.id.tv_strasse);
        TextView nr= (TextView) convertView.findViewById(R.id.tv_nr);
        TextView typ= (TextView) convertView.findViewById(R.id.tv_typ);
        TextView entf= (TextView) convertView.findViewById(R.id.tv_entf);
        strasse.setText(rs.getAdresse().getStrasse());
        nr.setText(Integer.toString(rs.getAdresse().getHaunsnr()));
        typ.setText(rs.getTyp());
        entf.setText(Double.toString(rs.getEntfernung()));

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

}
