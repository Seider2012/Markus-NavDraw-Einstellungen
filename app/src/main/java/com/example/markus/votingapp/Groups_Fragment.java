package com.example.markus.votingapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Groups_Fragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Groups_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Groups_Fragment extends Fragment {

    ExpandableListView lv;

    //Testobjekte
    Adresse adresse1=new Adresse("Peter-Habeler-Straße", 555, 6290, "Mayrhofen");
    Adresse adresse2=new Adresse("IrgendwoAmFlughafen", 1, 6020, "Innsbruck");
    PersonM personM1 = new PersonM("Lukas", "Mahlkencht", adresse1);
    PersonM personM2 = new PersonM("Patrick", "Penz", adresse2);
    PersonM personM3 = new PersonM("Stefan", "Wolf", adresse1);
    PersonM personM4 = new PersonM("Benjamin", "Cilga", adresse2);
    PersonM personM5 = new PersonM("Markus", "Egger", adresse1);



    GruppeM gruppeM1 = new GruppeM("BerwangerBisÖdemis");

    GruppeM gruppeM2 = new GruppeM("PenzBisWolf");

    public Groups_Fragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        gruppeM1.addMitglied(personM2);
        gruppeM1.addMitglied(personM3);
        gruppeM2.addMitglied(personM1);
        gruppeM2.addMitglied(personM4);
        gruppeM2.addMitglied(personM5);

        View layout= inflater.inflate(R.layout.fragment_groups,null);
        lv=(ExpandableListView)layout.findViewById(R.id.expandableListViewGroups);

        lv.setIndicatorBounds(100, 10);

        ArrayList<GruppeM> gruppen = new ArrayList<GruppeM>();
        gruppen.add(gruppeM1);
        gruppen.add(gruppeM2);
        ListView_AdapterGruppe adapter=new ListView_AdapterGruppe(getContext(), gruppen);
        lv.setAdapter(adapter);

        // Inflate the layout for this fragment
        return layout;
    }



}
