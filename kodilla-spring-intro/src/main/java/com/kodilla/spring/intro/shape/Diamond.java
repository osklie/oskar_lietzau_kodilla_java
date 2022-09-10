package com.kodilla.spring.intro.shape;

public class Diamond implements Shape {

    @Override
    public String draw() {
        System.out.println("This is a diamond");
        return "This is a diamond";
    }
}
