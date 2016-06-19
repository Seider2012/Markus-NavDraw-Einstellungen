package com.example.markus.votingapp.wrapper;


public class Adresse {
    private int adresseID;
    private String strasse;
    private String Hausnummer;
    private int plz;
    private String ort;

    public Adresse(int adresseID, String hausnummer, String strasse, String ort, int plz) {
        this.adresseID = adresseID;
        Hausnummer = hausnummer;
        this.strasse = strasse;
        this.ort = ort;
        this.plz = plz;
    }

    public int getAdresseID() {
        return adresseID;
    }

    public void setAdresseID(int adresseID) {
        this.adresseID = adresseID;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausnummer() {
        return Hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        Hausnummer = hausnummer;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
}
