package dev.kaiv;

import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        HashMap<String, Integer> hashPlaces = new HashMap<String, Integer>() ;
        hashPlaces.put("Sydney",0);
        hashPlaces.put("Adelaide",1374);
        hashPlaces.put("Alice Springs",2771);
        hashPlaces.put("Brisbane",917);
        hashPlaces.put("Darwin",3972);
        hashPlaces.put("Melbourne",877);
        hashPlaces.put("Perth",3923);


        LinkedList<String> places = printCitiesByDistance(hashPlaces);
        ListIterator<String> iterator = places.listIterator();

        System.out.println("You are in Sidney!");
        System.out.println();

        printActions("Sydney", places);
    }
    public static void printActions(String city, LinkedList<String> places){
        String message = """
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """;
        System.out.println(message);
        String input = scanner.next();
        switch (input.toUpperCase().charAt(0)){
            case 'F':
                Forward(city,places);
                break;
            case 'B':
                Backward(city,places);
                break;
            case 'L':
                printList(city, places);
                break;
//            case 'M':
//                break;
            default:

        }

    }
    public static void Forward(String city, LinkedList<String> places){
        ListIterator<String> iterator = places.listIterator(places.indexOf(city)+1);

        if (iterator.hasNext()){
            city = iterator.next();
            System.out.println("You are in "+ city);
            System.out.println();
        }
        printActions(city, places);
    }
    public static void Backward(String city, LinkedList<String> places){
        ListIterator<String> iterator = places.listIterator(places.indexOf(city));

        if (iterator.hasPrevious()){
            city = iterator.previous();
            System.out.println(city);
            System.out.println("You are in "+ city);
            System.out.println();

        }
        printActions(city, places);
    }
    public static void printList(String city, LinkedList<String> places){
        System.out.println(places);
        System.out.println("-".repeat(30));
        printActions(city, places);
    }
    public static LinkedList<String> printCitiesByDistance(HashMap<String, Integer> hashPlaces){
        LinkedList<String> places = new LinkedList<>();
        LinkedList<Integer> distance = new LinkedList<>();

        for (String town : hashPlaces.keySet()){
            distance.add(hashPlaces.get(town));
        }
        distance.sort(Comparator.naturalOrder());

        for (int i =0; i< distance.size(); i++) {

            for (String town : hashPlaces.keySet()){
                    if (hashPlaces.get(town) == distance.get(i)){
                    places.add(town);
                }
            }
        }
//        System.out.println("Places by distance from Sidney: " + places);
        return places;
    }
}
