package com.example.markus.votingapp.wrapper;


public class Rolle {
    private int rolleID;
    private String name;

    public Rolle(int rolleID, String name) {
        this.rolleID = rolleID;
        this.name = name;
    }

    public int getRolleID() {
        return rolleID;
    }

    public void setRolleID(int rolleID) {
        this.rolleID = rolleID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
