package com.string.san;

import java.util.List;

public class StringDemo {
    public static void main(String[] args){
        String name = "Jane ";
        String name2 = "Jane ";
        String name3 = new String("Jane");
        System.out.println(name.equals(name2));
        System.out.println(name == name2);
        System.out.println(name.hashCode() + " " + name2.hashCode());
        System.out.println(name == name3);
        List<String> list ;

    }
}
