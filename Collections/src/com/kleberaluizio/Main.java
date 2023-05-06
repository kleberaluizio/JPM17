package com.kleberaluizio;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian",8, 12);

        System.out.println("=".repeat(30));
        if(theatre.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

    }

    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat : list){
            System.out.print(" "+ seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=".repeat(30));

    }

}

