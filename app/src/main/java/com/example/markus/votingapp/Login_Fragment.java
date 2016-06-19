package com.example.markus.votingapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Login_Fragment extends Fragment {


    public Login_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View layout=inflater.inflate(R.layout.fragment_login,null);
        Button b=(Button)layout.findViewById(R.id.bt_register);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction ft= getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container,new Register_Fragment());
                ft.commit();

            }
        });
        // Inflate the layout for this fragment
        return layout;
    }



}
