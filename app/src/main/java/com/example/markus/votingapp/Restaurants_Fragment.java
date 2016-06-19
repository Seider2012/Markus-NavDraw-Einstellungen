package com.example.markus.votingapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Restaurants_Fragment extends Fragment {

    ExpandableListView lv;

    //Testobjekte
    Adresse adr=new Adresse("Innrain",70,6020,"Innsbruck");
    Restaurant res1=new Restaurant("Chili",adr,"Döner/Pizza",3);
    Restaurant res2=new Restaurant("Speis",adr,"Burger",3.5);
    Restaurant res3=new Restaurant("Mc Donalds",adr,"Burger",2);
    Restaurant res4=new Restaurant("Burger King",adr,"Burger",5);


    public Restaurants_Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout= inflater.inflate(R.layout.fragment_restaurants,null);
        lv=(ExpandableListView)layout.findViewById(R.id.listView);

        lv.setIndicatorBounds(100,10);

        ArrayList<Restaurant> restaurants=new ArrayList<Restaurant>();
        restaurants.add(res1);
        restaurants.add(res2);
        restaurants.add(res3);
        restaurants.add(res4);
        ListView_Adapter adapter=new ListView_Adapter(getContext(),restaurants);
        lv.setAdapter(adapter);



        // Inflate the layout for this fragment
        return layout;
    }

}
