package com.kleberaluizio;

public abstract class animal {
    private String name;

    public animal(String name) {
        this.name = name;
    }
    //06:23 o video parou

    public abstract void eat();
    public abstract void breath();

    public String getName() {
        return name;
    }
}
