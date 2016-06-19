package com.example.markus.votingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Markus on 09.04.2016.
 */
public class ListView_Voting_Adapter extends ArrayAdapter {

    private ArrayList<Restaurant> restaurants=new ArrayList<Restaurant>();

    public ListView_Voting_Adapter(Context context, int resource,ArrayList<Restaurant> restaurants){
        super(context,resource);
        this.restaurants=restaurants;
    }


    public void add(Restaurant object) {
        restaurants.add(object);
        super.add(object);
    }

    @Override
    public int getCount() {
        return restaurants.size();
    }

    @Override
    public Object getItem(int position) {
        return restaurants.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View zeile;
        Restaurant rs= (Restaurant) getItem(position);
        String resname=rs.getName();
        LayoutInflater inflater= (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        zeile=inflater.inflate(R.layout.listview_voting_layout,null);
        TextView name= (TextView) zeile.findViewById(R.id.tv_restname);

        name.setText(resname);
        
        return zeile;
    }
}
