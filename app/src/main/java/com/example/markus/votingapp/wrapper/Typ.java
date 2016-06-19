package com.example.markus.votingapp.wrapper;


public class Typ {
    private int typID;
    private String name;

    public Typ(int typID, String name) {
        this.typID = typID;
        this.name = name;
    }

    public int getTypID() {
        return typID;
    }

    public void setTypID(int typID) {
        this.typID = typID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
