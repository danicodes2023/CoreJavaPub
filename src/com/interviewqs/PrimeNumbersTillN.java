package com.interviewqs;
/*Write a program to print prime numbers till given number*/
public class PrimeNumbersTillN {
    public static void main(String[] args) {
        int num = 97;
        // Print all prime numbers till num
        printPrimes(num);
        printPrimesOptimized(num);
    }

    public static void printPrimesOptimized(int N) { //Sieve Of Eratosthenes
        if (N < 2) return;  // There are no prime numbers less than 2

        boolean[] isPrime = new boolean[N + 1];  // Array to track prime numbers
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;  // Assume all numbers are prime initially
        }

        for (int p = 2; p * p <= N; p++) {
            if (isPrime[p]) {  // If p is prime, mark its multiples as non-prime
                for (int i = p * p; i <= N; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        // Print all prime numbers
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
    private static void printPrimes(int num) {
        for (int i = 2; i <= num; i++) { // complexity O(n sqrt(n))
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int num){
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





