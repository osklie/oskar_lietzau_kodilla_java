package com.kodilla.patterns.strategy.social;

public class Millennials extends User {

    public Millennials(String userName) {
        super(userName);
        this.socialPublisher = new SnapchatPublisher();
    }
}