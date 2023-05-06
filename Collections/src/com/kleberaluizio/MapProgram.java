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

//        languages.remove("Lisp");
        if(languages.remove("Algol","an algorithmic language")){
            System.out.println("Algol removed");
        }else {
            System.out.println("Algol not removed, ky/value pair not found!");
        }
        System.out.println("=".repeat(100));

        if(languages.replace("Lisp","Therein lies madness "," a functional programming language with imperative features")){
            System.out.println("Lisp replaced");
        }else{
            System.out.println("Lisp was not replaced");
        }
        System.out.println(languages.replace("Scala","This will not be added"));

        System.out.println("=".repeat(100));
        for(String key : languages.keySet()){
            System.out.println(key + ": " +languages.get(key));
        }




    }
}
