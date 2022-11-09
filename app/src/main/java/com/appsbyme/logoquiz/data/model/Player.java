package com.appsbyme.logoquiz.data.model;

import java.util.UUID;

public class Player {

    private String name;

    private String uid;

    public Player() {}

    public Player(String name) {
        this.name = name;
        this.uid = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
