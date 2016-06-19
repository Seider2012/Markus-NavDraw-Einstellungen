package com.example.markus.votingapp.wrapper;
import android.annotation.TargetApi;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import com.example.markus.votingapp.R;
import com.example.markus.votingapp.MainActivity;
import com.example.markus.votingapp.Voting_Fragment;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link HintergrundEinstellung.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link HintergrundEinstellung#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HintergrundEinstellung extends android.support.v4.app.Fragment {
    Toolbar toolbar = null;
    private static Integer hintergrundfarbe = new Integer(0);
    Button btnnext2;
    /*protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_hintergrund_einstellung);
        btnnext2=(Button) findViewById(R.id.abutton);
        btnnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Einstellungen.class);
                view.getContext().startActivity(intent);
            }
        });
    }*/
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_hintergrund_einstellung, null);

        hintergrundfarbe = 0xFFFFFFFF;

        final ImageButton button = (ImageButton) layout.findViewById(R.id.imageButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                hintergrundfarbe = 0xFFDC6565;
                MainActivity.Utility.farbeChange(hintergrundfarbe);
            }
        });

        final Button bB = (Button) layout.findViewById(R.id.bButton);
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

    final ImageButton button2 = (ImageButton) layout.findViewById(R.id.imageButton2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                hintergrundfarbe = 0xFFECA355;
                MainActivity.Utility.farbeChange(hintergrundfarbe);
            }
        });

        final ImageButton button3 = (ImageButton) layout.findViewById(R.id.imageButton3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                hintergrundfarbe = 0xFFEEEB56;
                MainActivity.Utility.farbeChange(hintergrundfarbe);
            }
        });

        final ImageButton button4 = (ImageButton) layout.findViewById(R.id.imageButton5);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click#
                hintergrundfarbe = 0xFFA7F166;
                MainActivity.Utility.farbeChange(hintergrundfarbe);
            }
        });

        final ImageButton button5 = (ImageButton) layout.findViewById(R.id.imageButton4);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                hintergrundfarbe = 0xFF60DFA8;
                MainActivity.Utility.farbeChange(hintergrundfarbe);
            }
        });

        final ImageButton button6 = (ImageButton) layout.findViewById(R.id.imageButton6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                hintergrundfarbe = 0xFF5BEFF4;
                MainActivity.Utility.farbeChange(hintergrundfarbe);
            }
        });

        final ImageButton button7 = (ImageButton) layout.findViewById(R.id.imageButton7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                hintergrundfarbe = 0xFF33F7D3;
                MainActivity.Utility.farbeChange(hintergrundfarbe);
            }
        });

        final ImageButton button8 = (ImageButton) layout.findViewById(R.id.imageButton8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                hintergrundfarbe = 0xFFFE6CF9;
                MainActivity.Utility.farbeChange(hintergrundfarbe);
            }
        });

        final ImageButton button9 = (ImageButton) layout.findViewById(R.id.imageButton9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                hintergrundfarbe = 0xFFDD6AFC;
                MainActivity.Utility.farbeChange(hintergrundfarbe);
            }
        });

        final ImageButton button10 = (ImageButton) layout.findViewById(R.id.imageButton10);
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                hintergrundfarbe = 0xFFCAD1C4;
                MainActivity.Utility.farbeChange(hintergrundfarbe);
            }
        });

        final ImageButton button11 = (ImageButton) layout.findViewById(R.id.imageButton11);
        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                hintergrundfarbe = 0xFF9CB7E1;
                MainActivity.Utility.farbeChange(hintergrundfarbe);
            }
        });

        final ImageButton button12 = (ImageButton) layout.findViewById(R.id.imageButton12);
        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                hintergrundfarbe = 0xFFEABEAF;
                MainActivity.Utility.farbeChange(hintergrundfarbe);
            }
        });
/*
        final Button bButton = (Button) layout.findViewById(R.id.bButton);
        bButton.setOnClickListener(new  View.OnClickListener() {
            public void onClick(View v) {
                Einstellungen f7;
                f7 = new Einstellungen();

                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.fragment_container, Einstellungen.class);
                fragmentTransaction.commit();
            }
        });
*/
        return layout;
    }
}