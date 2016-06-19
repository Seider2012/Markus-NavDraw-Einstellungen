package com.example.markus.votingapp.wrapper;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.v4.app.Fragment;
import com.example.markus.votingapp.R;


public class Einstellungen extends Fragment {
        Button btnnext1;
        Button btnnext2;
        Button btnnext3;
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
        savedInstanceState){
            View view = inflater.inflate(R.layout.fragment_einstellungen, container, false);
            btnnext1 = (Button) view.findViewById(R.id.hintergrundcolor);
            btnnext1.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    HintergrundEinstellung fH = new HintergrundEinstellung();
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, fH);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
            });
            btnnext2 = (Button) view.findViewById(R.id.language);
            btnnext2.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    Spracheinstellungen sE = new Spracheinstellungen();
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, sE);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
            });
            btnnext3 = (Button) view.findViewById(R.id.schrift);
            btnnext3.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {

                    Schrift fH = new Schrift();
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, fH);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
            });

            return view;
        }
    }
/*
HintergrundEinstellung f7= new HintergrundEinstellung();

    public void onCreate(LayoutInflater inflater, ViewGroup container,
                         Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final View hlayout;
        hlayout = inflater.inflate(R.layout.fragment_einstellungen, null);
      //  FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
     //   fragmentTransaction.commit();
        final Button aButton1 = (Button) hlayout.findViewById(R.id.hintergrundcolor);
        aButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, f7);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
     //           fragmentTransaction.replace(R.id.fragment_container, f7);
            }
        });
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout= inflater.inflate(R.layout.fragment_einstellungen,null);
        return layout;
    }
}
*/