package com.kleberaluizio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian",8, 12);

         System.out.println("=".repeat(30));
        if(theatre.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }
        if(theatre.reserveSeat("B13")){
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat already reserved");
        }
        if(theatre.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theatre.Seat> priceSeat = new ArrayList<>(theatre.getSeats());
        priceSeat.add(theatre.new Seat("B00", 13.0));
        priceSeat.add(theatre.new Seat("A00", 13.0));
        Collections.sort(priceSeat,Theatre.PRICE_ORDER);
        printList(priceSeat);
    }

    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat : list){
            System.out.print(" "+ seat.getSeatNumber() + " $" + seat.getPrice() );
        }
        System.out.println();
        System.out.println("=".repeat(200));

    }

}

