package com.interviewqs;

import java.util.Random;
/*Write a Java program to check if a number is prime.*/
public class PrimeDemo {
    public static void main(String[] args) {
        int num;
        for(int i = 0 ; i < 10 ; i++) {
            num = new Random().nextInt(23);
            System.out.println("Is " + num + " prime? : " + isPrime(num));
        }
    }
    public static boolean isPrime(int num){// complexity O(sqrt(N))
        if(num == 0 || num == 1) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false;
        for(int i = 3; i <= Math.sqrt(num); i = i+2){// i < num
            if(num % i == 0)
                return false;
        }
        return true;
    }
}
