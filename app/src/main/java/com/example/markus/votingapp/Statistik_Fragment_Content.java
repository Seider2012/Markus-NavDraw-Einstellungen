package com.example.markus.votingapp;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import org.achartengine.ChartFactory;
import org.achartengine.GraphicalView;
import org.achartengine.model.CategorySeries;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.SimpleSeriesRenderer;


public class Statistik_Fragment_Content extends Fragment {




    private GraphicalView mChartView;


    // Pie Chart Slice Names
    String[] status;

    // Pie Chart Slice Values
    double[] distribution;

    // Color of each Pie Chart Slices
    int[] colors;

    public Statistik_Fragment_Content() {

    }

    public void setData(String[] names,double[] values,int[] colors){
        this.status=names;
        this.distribution=values;
        this.colors=colors;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }



        // Instantiating CategorySeries to plot Pie Chart
        CategorySeries distributionSeries = new CategorySeries("");
        for (int i = 0; i < distribution.length; i++) {

            // Adding a slice with its values and name to the Pie Chart
            distributionSeries.add(status[i], distribution[i]);
        }

        // Instantiating a renderer for the Pie Chart
        DefaultRenderer defaultRenderer = new DefaultRenderer();
        for (int i = 0; i < distribution.length; i++) {
            SimpleSeriesRenderer seriesRenderer = new SimpleSeriesRenderer();
            seriesRenderer.setColor(colors[i]);
            // Adding the renderer of a slice to the renderer of the pie chart
            defaultRenderer.addSeriesRenderer(seriesRenderer);
        }

        defaultRenderer.setChartTitle("");
        defaultRenderer.setDisplayValues(true);
        defaultRenderer.setShowLegend(false);
        defaultRenderer.setChartTitleTextSize(40);
        defaultRenderer.setLabelsTextSize(40);
        defaultRenderer.setLabelsColor(Color.BLACK);
        defaultRenderer.setZoomButtonsVisible(false);

        View view =  inflater.inflate(R.layout.fragment_statistik_content, container, false);
        LinearLayout chartContainer = (LinearLayout) view.findViewById(R.id.chart_container);

        mChartView = ChartFactory.getPieChartView(getActivity(),
                distributionSeries, defaultRenderer);

        // Adding the pie chart to the custom layout
        chartContainer.addView(mChartView);


        return view;
    }






}
