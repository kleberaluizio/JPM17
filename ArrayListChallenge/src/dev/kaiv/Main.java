package dev.kaiv;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean shutdown = false;
        ArrayList<String> grocery = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        while(!shutdown) {
            String prompt = """
                    Available actions:
                    0 - to shutdown
                    1 - to add item(s) to list (comma delimited list)
                    2 - to remove any items (comma delimited list)
                                    
                    Enter a number for which action you want to do:
                    """;
            System.out.println(prompt);
            int choice = Integer.parseInt(s.nextLine());


            switch (choice) {
                case 0:
                    shutdown = true;
                    break;
                case 1:
                    System.out.println("Add item(s) to list (comma delimited list)");
                    addItems(grocery);
                    break;
                case 2:
                    System.out.println("Remove item(s) to list (comma delimited list)");
                    removeItems(grocery);
                    break;
                default:

            }
            printList(grocery);
        }
    }

    public static void addItems(ArrayList grocery){
        Scanner s = new Scanner(System.in);
        var input = s.nextLine();
        String[] items = input.split(",");

        for(String item : items){
            item = item.trim();
            if(grocery.contains(item)) {
                continue;
            }
            grocery.add(item);
        }
    }

    public static void removeItems(ArrayList grocery){
        Scanner s = new Scanner(System.in);
        var input = s.nextLine();
        String[] items = input.split(",");

        for(String item : items){
            item = item.trim();
            if(grocery.contains(item)) {
                grocery.remove(item);
            }
        }
    }

    public static void printList(ArrayList grocery){
        grocery.sort(Comparator.naturalOrder());
        System.out.println("-".repeat(10) + " GROCERY LIST " + "-".repeat(10));
        System.out.println(grocery);
        System.out.println("-".repeat(34));
    }

}
