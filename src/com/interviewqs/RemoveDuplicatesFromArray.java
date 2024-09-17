package com.interviewqs;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* Write a Java program to remove duplicates from an array.*/
public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        //int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] array = IntStream.rangeClosed(1, 260).toArray();
        array[9] = 1;
        System.out.println(removeDupli(array));
    }
    private static String removeDupli(int[] array) {
        Set<Integer> numberSet = new HashSet<>();// Use LinkedHashSet if order needs to be guaranteed
        for(int num : array)
            numberSet.add(num);
        return numberSet.toString();
    }
    private static String removeDuplicatesUsingStreams(int[] array) {
        return Arrays.stream(array) // Creates an IntStream from the array
                .distinct()    // Removes duplicates
                .boxed()       // Converts IntStream to Stream<Integer>
                .collect(Collectors.toList()) // Collects into a List<Integer>
                .toString();   // Converts List to String
    }
}
