package com.example.markus.votingapp;

/**
 * Created by Markus on 09.04.2016.
 */
public class Adresse {

    private String strasse;
    private int haunsnr;
    private int plz;
    private String ort;

    public Adresse(String strasse, int haunsnr, int plz, String ort) {
        this.strasse = strasse;
        this.haunsnr = haunsnr;
        this.plz = plz;
        this.ort = ort;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public void setHaunsnr(int haunsnr) {
        this.haunsnr = haunsnr;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getStrasse() {
        return strasse;
    }

    public int getHaunsnr() {
        return haunsnr;
    }

    public int getPlz() {
        return plz;
    }

    public String getOrt() {
        return ort;
    }
}
