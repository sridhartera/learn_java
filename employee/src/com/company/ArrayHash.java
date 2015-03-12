package com.company;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class ArrayHash {
    public static void main(String[] args) {
        //
        // Using a Generic can enable us to create a type specific collection
        // object. In the example below we create a Map whose key is an Integer
        // a have the value of a String.
        //
        Map<Integer, String> grades = new HashMap<Integer, String>();

        grades.put(1, "A");
        grades.put(2, "B");
        grades.put(3, "C");
        grades.put(4, "D");
        grades.put(5, "E");

        //
        // A value obtained from type specific collection doesn't not need to
        // be casted, it knows the type returned.
        //
        System.out.println("value from hash: "+grades.get(1));

        //
        // Creating a List that will contains a String only values.
        //
        List<String> dayNames = new ArrayList<String>();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");

        //
        // We also don't need to cast the retrieved value because it knows the
        // returned type object.
        //
        System.out.println("value from array: "+dayNames.get(0));
    }
}
