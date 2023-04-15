package dev.kaiv;

import java.util.LinkedList;
import java.util.Scanner;

record Place (String name, int distance){

    @Override
    public String toString(){
        return String.format("%s (%d)",name, distance);
    }
}

public class SecondMain {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit,adelaide);
        Place aliceSprings = new Place("Alice Springs", 2771);
        addPlace(placesToVisit,aliceSprings);
        Place brisbane = new Place("Brisbane", 917);
        addPlace(placesToVisit,brisbane);
        Place darwin = new Place("Darwin", 3972);
        addPlace(placesToVisit,darwin);
        Place melbourne = new Place("Melbourne", 877);
        addPlace(placesToVisit,melbourne);
        Place perth = new Place("Perth", 3923);
        addPlace(placesToVisit,perth);
        addPlace(placesToVisit,perth);

        System.out.println(placesToVisit);
    }

    private static void addPlace(LinkedList<Place> list, Place place){
        if (list.contains(place)){
            System.out.println("Found duplicate: " + place);
            return;
        }
        for (Place p: list){
            if (p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found duplicate: " + place);
                return;
            }
        }
        list.add(place);
    }
}
