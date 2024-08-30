package com.interviewqs;

public class Factorial {
    public static void main(String[] args){
        int num = 6;
        System.out.println("Factorial of " + num + " : " + factorial(num));
        System.out.println("Factorial of " + num + " factorialLoop : " + factorialLoop(num));
    }
    private static int factorial(int num) {//Using recursion; Time complexity : O(n); space: O(n)
        if(num == 0) {
            return 1;
        }
        return num * factorial(num-1);
        //return num == 0? 1: num * factorial(num-1);
    }
    private static int factorialLoop(int num) {//Using loop; Time complexity : O(n); space: O(1)
        int factorial = 1;
        for(int i = 2; i <= num; i++){
            factorial *= i;
        }
        return factorial;
    }
}
