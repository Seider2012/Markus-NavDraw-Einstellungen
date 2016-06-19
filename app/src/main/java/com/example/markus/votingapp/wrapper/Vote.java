package com.example.markus.votingapp.wrapper;


public class Vote {
    private int voteID;
    private int personID;
    private int gruppeID;
    private String restaurant;
    private String datum;

    public Vote(int voteID, int personID, int gruppeID, String restaurant, String datum) {
        this.voteID = voteID;
        this.personID = personID;
        this.gruppeID = gruppeID;
        this.restaurant = restaurant;
        this.datum = datum;
    }

    public int getVoteID() {
        return voteID;
    }

    public void setVoteID(int voteID) {
        this.voteID = voteID;
    }

    public int getGruppeID() {
        return gruppeID;
    }

    public void setGruppeID(int gruppeID) {
        this.gruppeID = gruppeID;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }
}
