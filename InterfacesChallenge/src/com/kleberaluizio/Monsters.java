package com.kleberaluizio;

import java.util.List;

public class Monsters implements ISaveable{
    private String name;

    public Monsters(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Monsters{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        return null;
    }

    @Override
    public void read(List<String> savedValues) {

    }
}
