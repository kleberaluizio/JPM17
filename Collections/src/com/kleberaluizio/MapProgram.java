package com.kleberaluizio;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java","a compiled high level, object-oriented, plattform independant language");
            System.out.println("Java added successfully");
        }
        languages.put("Python","an interpreted, object-oriented, high level programing language with dynamic semantics");
        languages.put("Algol","an algorithmic language");
        languages.put("BASIC","Beginners all purposes Symbolic Instruction Code");
        languages.put("Lisp","Therein lies madness");

        System.out.println(languages.get("Java"));
        System.out.println(languages.get("Lisp"));

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java","this course is about Java");
        }

        System.out.println("=".repeat(100));
        for(String key : languages.keySet()){
            System.out.println(key + ": " +languages.get(key));
        }




    }
}
