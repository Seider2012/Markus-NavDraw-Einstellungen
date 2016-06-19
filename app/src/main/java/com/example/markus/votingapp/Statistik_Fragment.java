package com.example.markus.votingapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Markus on 08.05.2016.
 */
public class Statistik_Fragment extends android.support.v4.app.Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;
    Statistik_ViewPagerAdapter statistikViewPagerAdapter;
    String[] tabtitles={"Restaurants","Typen"};
    View bar;
    View layout;
    private int farbe = 0xFF004FCA;

    public void farbeAendern(int color) {
        farbe=color;
    }
    public void setColor(int c){
        bar.setBackgroundColor(farbe);
    }
    public Statistik_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        layout= inflater.inflate(R.layout.fragment_statistik,null);
        tabLayout= (TabLayout) layout.findViewById(R.id.tabs);
        viewPager= (ViewPager) layout.findViewById(R.id.viewpager);
        statistikViewPagerAdapter =new Statistik_ViewPagerAdapter(getFragmentManager());
        statistikViewPagerAdapter.getTitles(tabtitles);
        viewPager.setAdapter(statistikViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        bar  = layout.findViewById(R.id.statistikbar);
        this.setColor(farbe);

        return layout;
    }

}


