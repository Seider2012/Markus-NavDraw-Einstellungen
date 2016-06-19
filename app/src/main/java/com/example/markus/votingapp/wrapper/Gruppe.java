package com.example.markus.votingapp.wrapper;


public class Gruppe {
    private int gruppeID;
    private String name;

    public Gruppe(int gruppeID, String name) {
        this.gruppeID = gruppeID;
        this.name = name;
    }

    public int getGruppeID() {
        return gruppeID;
    }

    public void setGruppeID(int gruppeID) {
        this.gruppeID = gruppeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
