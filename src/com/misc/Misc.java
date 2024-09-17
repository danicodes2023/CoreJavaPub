package com.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Misc {

    // add elements to a list then remove 1 in a loop;
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("Raj","Jane"));
        for( String s : strings){
            strings.remove("Raj");
            strings.add("Raj");
            System.out.println(s);
        }
        //Use ListIterator to Safely Add and Remove:
    }
}
