package dev.kaiv;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;

public class SecondMain {
    public static void main(String[] args) {
        boolean shutdown = false;
        ArrayList<String> grocery = new ArrayList<>();

        while(!shutdown) {
            Object[] options = {0,1,2};
            Object choice = JOptionPane.showOptionDialog(null, """
                    0 - to shutdown
                    1 - to add item(s) to list (comma delimited list)
                    2 - to remove any items (comma delimited list)
                                    
                    Enter a number for which action you want to do:
                    """, "Available Actions", JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null, options, options[0]);
            int choiceNumber = Integer.parseInt(choice.toString());

            switch (choiceNumber) {
                case 0:
                    shutdown = true;
                    break;
                case 1:
                    addItems(grocery);
                    break;
                case 2:
                    removeItems(grocery);
                    break;
                default:

            }
            printList(grocery);
        }
    }
    public static void addItems(ArrayList grocery){
        var input = JOptionPane.showInputDialog(null,"Add item(s) to list (comma delimited list)",JOptionPane.DEFAULT_OPTION);
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
        var input = JOptionPane.showInputDialog(null,"Remove item(s) to list (comma delimited list)",JOptionPane.DEFAULT_OPTION);
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
        StringBuilder message = new StringBuilder();
        for (Object item : grocery){
            message.append(String.format("%-5s","\u2022")+item.toString() + "\n");
        }
        JOptionPane.showMessageDialog(null, message," GROCERY LIST ",JOptionPane.PLAIN_MESSAGE);

    }
}
