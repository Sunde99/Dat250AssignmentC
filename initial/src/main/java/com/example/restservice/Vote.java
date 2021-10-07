package com.example.restservice;

public class Vote {

    private final long id;
    private final Boolean vote;

    public Vote(long id, Boolean vote) {
        this.id = id;
        this.vote = vote;
    }

    public long getId() {
        return id;
    }

    public Boolean getVote() {
        return vote;
    }
}
