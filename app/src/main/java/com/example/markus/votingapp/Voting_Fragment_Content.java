package com.example.markus.votingapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class Voting_Fragment_Content extends Fragment {

    ListView lv;

    //Testobjekte
    Adresse adr=new Adresse("Innrain",70,6020,"Innsbruck");
    Restaurant res1=new Restaurant("Chili",adr,"Döner/Pizza",3);
    Restaurant res2=new Restaurant("Speis",adr,"Burger",3.5);
    Restaurant res3=new Restaurant("Mc Donalds",adr,"Burger",2);
    Restaurant res4=new Restaurant("Burger King",adr,"Burger",5);

    public Voting_Fragment_Content() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout=inflater.inflate(R.layout.fragment_voting_content,null);
        lv= (ListView) layout.findViewById(R.id.lv_voting);
        ArrayList<Restaurant> restaurants=new ArrayList<Restaurant>();
        restaurants.add(res1);
        restaurants.add(res2);
        restaurants.add(res3);
        restaurants.add(res4);

        ListView_Voting_Adapter adapter=new ListView_Voting_Adapter(getContext(),R.layout.listview_voting_layout,restaurants);

        lv.setAdapter(adapter);

        return layout;
    }

}
