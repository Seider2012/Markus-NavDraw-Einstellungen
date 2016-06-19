package com.example.markus.votingapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Markus on 30.04.2016.
 */
public class Voting_ViewPagerAdapter extends FragmentPagerAdapter {

    String[] tabtitles;

    public Voting_ViewPagerAdapter(FragmentManager fm){
        super(fm);
    }

    public void getTitles(String[] tabtitles){
        this.tabtitles=tabtitles;
    }

    @Override
    public Fragment getItem(int position) {
        return new Voting_Fragment_Content();
    }

    @Override
    public int getCount() {
        return tabtitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitles[position];
    }
}
