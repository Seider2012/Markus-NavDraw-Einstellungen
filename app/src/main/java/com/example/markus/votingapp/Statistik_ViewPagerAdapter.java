package com.example.markus.votingapp;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Markus on 08.05.2016.
 */
public class Statistik_ViewPagerAdapter extends FragmentPagerAdapter {
    String[] tabtitles;

    public Statistik_ViewPagerAdapter(FragmentManager fm){
        super(fm);
    }

    public void getTitles(String[] tabtitles){
        this.tabtitles=tabtitles;
    }

    @Override
    public Fragment getItem(int position) {

        Statistik_Fragment_Content statfrag;

        if (position==0){
            statfrag=new Statistik_Fragment_Content();

            //Api abfrage
            String[] status = new String[] { "MC-Donalds", "Speis", "Burger-King","Chili" };


            double[] distribution = { 6, 3, 2, 3 };


            int[] colors = { Color.GREEN, Color.YELLOW, Color.RED,Color.BLUE };

            statfrag.setData(status,distribution,colors);
        }
        else{
            statfrag=new Statistik_Fragment_Content();

            //Api abfrage
            String[] status = new String[] { "Burger", "Döner", "Nudeln","Asiatisch" };


            double[] distribution = { 4, 3, 2, 1 };


            int[] colors = { Color.GREEN, Color.YELLOW, Color.RED,Color.BLUE };

            statfrag.setData(status,distribution,colors);
        }

        return statfrag;
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
