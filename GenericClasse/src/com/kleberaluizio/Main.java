package com.kleberaluizio;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckam = new SoccerPlayer("Beckham");

        Team adelaideCrows = new Team("Adelaide Crows");

        adelaideCrows.addPlayer(joe);
        adelaideCrows.addPlayer(pat);
        adelaideCrows.addPlayer(beckam);

        System.out.println(adelaideCrows.numPlayers());

        //indo para o video 163
    }
}
