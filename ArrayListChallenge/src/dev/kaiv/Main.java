package dev.kaiv;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean shutdown = false;
        ArrayList<String> groceries = new ArrayList<>();

        while(!shutdown) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    addItems(groceries);
                    break;
                case 2:
                    removeItems(groceries);
                    break;
                default:
                    shutdown = true;

            }
            printList(groceries);
        }
    }

    public static void printActions(){
        String textBlock = """
                    Available actions:
                    0 - to shutdown
                    1 - to add item(s) to list (comma delimited list)
                    2 - to remove any items (comma delimited list)
                                    
                    Enter a number for which action you want to do: """;
        System.out.println(textBlock + " ");
    }
    public static void addItems(ArrayList<String>  groceries){
        System.out.println("Add item(s) to list (comma delimited list)");
        var input = scanner.nextLine();
        String[] items = input.split(",");

        for(String item : items){
            item = item.trim();
            if(groceries.contains(item) || item.isBlank()) {
                continue;
            }
            groceries.add(item);
        }
    }

    public static void removeItems(ArrayList<String> groceries){
        System.out.println("Remove item(s) to list (comma delimited list)");
        var input = scanner.nextLine();
        String[] items = input.split(",");

        for(String item : items){
            item = item.trim();
            if(groceries.contains(item)) {
                groceries.remove(item);
            }
        }
    }

    public static void printList(ArrayList<String> groceries){
        groceries.sort(Comparator.naturalOrder());
        System.out.println("-".repeat(10) + " GROCERY LIST " + "-".repeat(10));
        System.out.println(groceries);
        System.out.println("-".repeat(34));
    }

}
