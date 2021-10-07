package com.example.restservice;

public class Answer {

    private final long id;
    private final Boolean vote;
    private final long pollId;
    private final long user2_id;

    public Answer(long id, Boolean vote, long pollId, long user2_id) {
        this.id = id;
        this.vote = vote;
        this.pollId = pollId;
        this.user2_id = user2_id;
    }

    public long getId() {
        return id;
    }

    public Boolean getVote() {
        return vote;
    }

    public  long getPollId() {
        return pollId;
    }

    public long getUser2_id() {
        return pollId;
    }
}
