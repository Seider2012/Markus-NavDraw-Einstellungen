package com.example.markus.votingapp;

import com.example.markus.votingapp.wrapper.Person;

import java.util.ArrayList;

/**
 * Created by Lukas on 24.04.2016.
 */
public class GruppeM {
    private String name;
    private ArrayList<PersonM> mitglieder=new ArrayList<PersonM>();


    public GruppeM(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMitglied(PersonM person){
        mitglieder.add(person);
    }

    public ArrayList<PersonM> getMitglieder(){
        return this.mitglieder;
    }

    public int getAnzMitglieder(){
        return mitglieder.size();
    }
}
