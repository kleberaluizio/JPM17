package com.kleberaluizio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> items = new ArrayList<>(); // raw type, ArrayList is a generic
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDouble(items);
    }
    private static void printDouble(ArrayList<Integer> n){
        for(int i : n){
            System.out.println(i * 2);
        }
    }
}
