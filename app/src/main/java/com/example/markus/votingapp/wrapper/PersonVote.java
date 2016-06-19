package com.example.markus.votingapp.wrapper;


public class PersonVote {
    private int personID;
    private int voteID;

    public PersonVote(int personID, int voteID) {
        this.personID = personID;
        this.voteID = voteID;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public int getVoteID() {
        return voteID;
    }

    public void setVoteID(int voteID) {
        this.voteID = voteID;
    }
}
