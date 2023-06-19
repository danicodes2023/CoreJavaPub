package com.interviewqs;
/*Write a Java program to check if a string is a palindrome.*/
public class PalindromeDemo {
    public static void main(String args[]){
        System.out.println(isPaliBasic("MALAYALAM"));
        System.out.println(isPalindrome("MALAYALAM"));
    }
    public static boolean isPaliBasic(String word){
        int j = word.length()-1;
        for(int i = 0; i < word.length()/2; i++,j--){
            if(word.charAt(i) != word.charAt(j))
                return false;
        }
        return true;
    }
    public static boolean isPalindrome(String word) {
        int length = word.length();
        int mid = length / 2;
        for (int i = 0; i < mid; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
