package com.example.markus.votingapp.wrapper;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.markus.votingapp.MainActivity;
import com.example.markus.votingapp.R;


public class Schrift extends Fragment {

    int schriftid =-2;
    int farbe=0xFF5BB0F5;
    TextView[] text=new TextView[12];


    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_schrift, null);






        final Button bB = (Button) layout.findViewById(R.id.bbutton);
        bB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Einstellungen e = new Einstellungen();
                android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, e);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        text[0] = (TextView) layout.findViewById(R.id.textView8);
        text[1] = (TextView) layout.findViewById(R.id.textView9);
        text[2] = (TextView) layout.findViewById(R.id.textView10);
        text[3] = (TextView) layout.findViewById(R.id.textView11);
        text[4] = (TextView) layout.findViewById(R.id.textView12);
        text[5] = (TextView) layout.findViewById(R.id.textView13);
        text[6] = (TextView) layout.findViewById(R.id.textView14);
        text[7] = (TextView) layout.findViewById(R.id.textView15);
        text[8] = (TextView) layout.findViewById(R.id.textView16);
        text[9] = (TextView) layout.findViewById(R.id.textView17);
        text[11] = (TextView) layout.findViewById(R.id.textView19);



        text[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setWhite();
                text[0].setBackgroundColor(farbe);
                schriftid= 0;
            }
        });
        text[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setWhite();
                text[1].setBackgroundColor(farbe);
                schriftid= 1;
            }
        });
        text[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setWhite();
                text[2].setBackgroundColor(farbe);
                schriftid= 2;
            }
        });
        text[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setWhite();
                text[3].setBackgroundColor(farbe);
                schriftid= 3;
            }
        });
        text[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setWhite();
                text[4].setBackgroundColor(farbe);
                schriftid= 4;
            }
        });
        text[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setWhite();
                text[5].setBackgroundColor(farbe);
                schriftid= 5;
            }
        });
        text[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setWhite();
                text[6].setBackgroundColor(farbe);
                schriftid= 6;
            }
        });
        text[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setWhite();
                text[7].setBackgroundColor(farbe);
                schriftid= 7;
            }
        });
        text[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setWhite();
                text[8].setBackgroundColor(farbe);
                schriftid= 8;
            }
        });
        text[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setWhite();
                text[9].setBackgroundColor(farbe);
                schriftid= 9;
            }
        });

        text[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setWhite();
                text[11].setBackgroundColor(farbe);
                schriftid= 11;
            }
        });

        final Button sB = (Button) layout.findViewById(R.id.sbutton);
        sB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.Utility.updateTitle(schriftid);
            }
        });


        final Button dB = (Button) layout.findViewById(R.id.defaultb);
        dB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                schriftid=-2;
                MainActivity.Utility.updateTitle(schriftid);
            }
        });




        return layout;
    }

    private void setWhite(){
        for(int i=0;i<text.length;i++){
            if(text[i]!=null) {
                text[i].setBackgroundColor(0xFFFFFFF);
            }
        }
    }
}
