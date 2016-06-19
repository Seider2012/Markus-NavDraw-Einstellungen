package com.example.markus.votingapp;


import android.annotation.TargetApi;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Voting_Fragment extends Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;
    Voting_ViewPagerAdapter votingViewPagerAdapter;
    String[] tabtitles={"Restaurants","Typen"};
    View layout;
    View bar;
    private int farbe = 0xFF004FCA;

        public void farbeAendern(int color) {
            farbe=color;
        }
        public void setColor(int c){
            bar.setBackgroundColor(farbe);
        }

    public Voting_Fragment() {
        // Required empty public constructor
    }


    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        layout= inflater.inflate(R.layout.fragment_voting,null);
        tabLayout= (TabLayout) layout.findViewById(R.id.tabs);
        viewPager= (ViewPager) layout.findViewById(R.id.viewpager);
        votingViewPagerAdapter =new Voting_ViewPagerAdapter(getFragmentManager());
        votingViewPagerAdapter.getTitles(tabtitles);
        viewPager.setAdapter(votingViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        bar  = layout.findViewById(R.id.votingbar);
        this.setColor(farbe);
        return layout;
    }

}
