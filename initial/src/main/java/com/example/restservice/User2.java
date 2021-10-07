package com.example.restservice;

public class User2 {
    private final long id;
    private final String name;

    public User2(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
