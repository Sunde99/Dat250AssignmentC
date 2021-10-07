package com.example.restservice;

public class Poll {

    private final long id;
    private final String answer1;
    private final String answer2;
    private final String question;

    public Poll(long id, String answer1, String answer2, String question) {
        this.id = id;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.question = question;
    }

    public long getId() {
        return id;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getQuestion() {
        return question;
    }
}
