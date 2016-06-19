package com.example.markus.votingapp.wrapper;


public class GruppeMitglieder {
    private int gruppeID;
    private int personID;

    public GruppeMitglieder(int gruppeID, int personID) {
        this.gruppeID = gruppeID;
        this.personID = personID;
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
}
