package com.example.markus.votingapp.wrapper;


public class GruppeVote {
    private int gruppeID;
    private int voteID;

    public GruppeVote(int gruppeID, int voteID) {
        this.gruppeID = gruppeID;
        this.voteID = voteID;
    }

    public int getGruppeID() {
        return gruppeID;
    }

    public void setGruppeID(int gruppeID) {
        this.gruppeID = gruppeID;
    }

    public int getVoteID() {
        return voteID;
    }

    public void setVoteID(int voteID) {
        this.voteID = voteID;
    }
}
