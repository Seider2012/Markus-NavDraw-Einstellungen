package com.example.markus.votingapp;

/**
 * Created by Markus on 09.04.2016.
 */
public class Restaurant {

    private String name;
    private Adresse adresse;
    private String typ;
    private double entfernung;

    public Restaurant(String name, Adresse adresse, String typ, double entfernung) {
        this.name = name;
        this.adresse = adresse;
        this.typ = typ;
        this.entfernung = entfernung;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public double getEntfernung() {
        return entfernung;
    }

    public void setEntfernung(double entfernung) {
        this.entfernung = entfernung;
    }
}
