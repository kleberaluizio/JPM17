package com.kleberaluizio;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    //06:23 o video parou

    public abstract void eat();

    public abstract void breathe();

    public String getName() {
        return name;
    }
}