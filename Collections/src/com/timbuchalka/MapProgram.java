package com.timbuchalka;


import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java is already exists");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language.");
            System.out.println("Java added successfully");
        }
        languages.put("Python", "interpreted, object-oriented, high level programming language with dynamic semantics.");
        languages.put("Algol", "an algorithmic language.");
        System.out.println(languages.put("BASIC", "Beginners ALL Purposes Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }

        System.out.println("=============================================");

        //languages.remove("Lisp");
        if (languages.remove("Algol", "an algorithmic language.")){
            System.out.println("Algol removed");
        }else {
            System.out.println("Algol not removed, key/value pari not found");
        }

        System.out.println(languages.replace("Lisp","a functional programing language with imperative features"));
        System.out.println(languages.replace("Scala","this will not be replaced"));
        for (String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
