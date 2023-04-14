package dev.kaiv;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0,"canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        removeMoreElements(placesToVisit);
        System.out.println(placesToVisit);

    }
    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");

        //Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        //Stack methods
        list.push("Alice Springs");

    }

    private static void removeMoreElements(LinkedList<String> list){
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); //removes first element
        System.out.println(s1 + " was removed");

        System.out.println(list);

        String s2 = list.removeFirst(); //removes first element
        System.out.println(s2 + " was removed");

        System.out.println(list);

        String s3 = list.removeLast(); //removes first element
        System.out.println(s3 + " was removed");

        System.out.println(list);

        //Queue/Deque poll methods

        String p1 = list.poll(); //removes first element
        System.out.println(p1 + " was removed");
        String p2 = list.pollFirst(); //removes first element
        System.out.println(p2 + " was removed");
        String p3 = list.pollLast(); //removes first element
        System.out.println(p3 + " was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");


        System.out.println(list);

        String p4 = list.pop(); // removes first element
        System.out.println(p4 + " was removed");






    }
}
