package com.example.markus.votingapp.wrapper;


public class Person {
    private int personID;
    private String vorname;
    private String nachname;

    public Person(int personID, String nachname, String vorname) {
        this.personID = personID;
        this.nachname = nachname;
        this.vorname = vorname;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
}
