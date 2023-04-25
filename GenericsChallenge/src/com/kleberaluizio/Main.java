package com.kleberaluizio;

public class Main {
    public static void main(String[] args) {
        // ArrayList<Team> teams;
        // Collections.sort(teams);

        League<Team<FootballPlayer>> footballLeague = new League<>("Football National League");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        Team<SoccerPlayer> soccerTeam = new Team<>("Manchester United");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        //Matches
        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaideCrows,3,8);
        adelaideCrows.matchResult(fremantle,2,1);

        System.out.println("-".repeat(30));

        footballLeague.addTeam(fremantle);
        footballLeague.addTeam(adelaideCrows);
        footballLeague.addTeam(melbourne);
        footballLeague.addTeam(adelaideCrows);
        footballLeague.addTeam(hawthorn);

        footballLeague.showLeagueTable();


    }
}
