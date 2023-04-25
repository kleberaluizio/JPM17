package com.kleberaluizio;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String name;

    private ArrayList<T> league = new ArrayList<T>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team){
        if (league.contains(team)){
            System.out.println(team.getName() + " is already in this league");
            return false;
        } else {
            league.add(team);
            System.out.println(team.getName() + " is in the " + this.name);
            return true;
        }
    }

    public void showLeagueTable(){
        Collections.sort(league);

        System.out.println("--- Rankings ---");
        for (T team : league){
            System.out.println(team.getName() + ": "+team.ranking());
        }
    }
}
