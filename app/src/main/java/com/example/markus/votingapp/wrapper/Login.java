package com.example.markus.votingapp.wrapper;


public class Login {
    private int personID;
    private String username;
    private String password;
    private int rolleID;

    public Login(int personID, String username, String password, int rolleID) {
        this.personID = personID;
        this.username = username;
        this.password = password;
        this.rolleID = rolleID;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getRolleID() {
        return rolleID;
    }

    public void setRolleID(int rolleID) {
        this.rolleID = rolleID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
