package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayRemoveDuplicate {
    public static void main(String[] args) {
        //
        // A string array with duplicate values
        //
        String[] data = {"A", "C", "B", "D", "A", "B", "E", "D", "B", "C"};
        System.out.println("Original array         : " + Arrays.toString(data));

        //
        // Convert it to list as we need the list object to create a set object.
        // A set is a collection object that cannot have a duplicate values, so
        // by converting the array to a set the duplicate value will be removed.
        //
        List<String> list = Arrays.asList(data);
        Set<String> set = new HashSet<String>(list);

        System.out.print("Remove duplicate result: ");
        
        //
        // Create an array to convert the Set back to array. The Set.toArray()
        // method copy the value in the set to the defined array.
        //
        //int res = set.size();
        //System.out.println("int res:" + res);
        //System.out.println("str res:" + String[set.size]);
        String[] result = new String[set.size()];      
        set.toArray(result);
        for (String s : result) {
            System.out.print(s + ", ");                                  
        }
        //
        // The TreeSet class is an implementation of a SortedSet, this means
        // that when your are using the TreeSet to store you data collections
        // you'll get the items ordered base on its elements natural order.
        //
        System.out.println("");
        System.out.print("Print set in order: ");
        Set<String> set2 = new TreeSet<String>(set);
        for (String x : set2){        
        	System.out.print(x + ", ");
        }
    }
}
