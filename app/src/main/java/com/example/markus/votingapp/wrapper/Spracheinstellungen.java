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
public class Spracheinstellungen extends android.support.v4.app.Fragment {

    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_spracheinstellungen, null);

        return layout;
    }
}