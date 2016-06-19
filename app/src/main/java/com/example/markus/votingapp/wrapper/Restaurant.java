package com.example.markus.votingapp.wrapper;


public class Restaurant {
    private int restaurantID;
    private int typID;
    private int adresseID;
    private float Entfernung;
    private String speisekarte;

    public Restaurant(int restaurantID, int typID, int adresseID, float entfernung, String speisekarte) {
        this.restaurantID = restaurantID;
        this.typID = typID;
        this.adresseID = adresseID;
        Entfernung = entfernung;
        this.speisekarte = speisekarte;
    }

    public int getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(int restaurantID) {
        this.restaurantID = restaurantID;
    }

    public int getTypID() {
        return typID;
    }

    public void setTypID(int typID) {
        this.typID = typID;
    }

    public int getAdresseID() {
        return adresseID;
    }

    public void setAdresseID(int adresseID) {
        this.adresseID = adresseID;
    }

    public float getEntfernung() {
        return Entfernung;
    }

    public void setEntfernung(float entfernung) {
        Entfernung = entfernung;
    }

    public String getSpeisekarte() {
        return speisekarte;
    }

    public void setSpeisekarte(String speisekarte) {
        this.speisekarte = speisekarte;
    }
}
