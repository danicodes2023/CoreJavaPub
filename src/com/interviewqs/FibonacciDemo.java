package com.interviewqs;
/*1)Write a Java program to generate the Fibonacci series up to n terms.
* 2)*/
public class FibonacciDemo {
    public static void main(String[] args) {
        printFibonacci(4);
        //System.out.println("\nSum of fib : "+ findSumOfFibonacci(4));
    }
    public static int findSumOfFibonacci(int num){
        int first = 0;
        int second = 1;
        int fib;
        int sum = first + second ;
        System.out.print(first + " " + second);
        for(int i = 3; i <= num; i++){
            fib = first + second;
            sum += fib;
            System.out.print(" " + fib);
            first = second;
            second = fib;
        }
        return sum;
    }
    public static void printFibonacci(int num){
        int first = 0;
        int second = 1;
        int fib;
        StringBuilder fibonacciSeries = new StringBuilder();
        fibonacciSeries.append(first).append(" ").append(second).append(" ");
        //System.out.print(first + " " + second);
        for(int i = 3; i <= num; i++){
            fib = first + second;
            fibonacciSeries.append(fib).append(" ");
            //System.out.print(" " + fib);
            first = second;
            second = fib;
        }
        System.out.println(fibonacciSeries.toString());
    }
}
