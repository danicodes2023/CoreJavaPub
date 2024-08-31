package com.interviewqs;

/*Write a Java program to reverse a string.*/
public class StringReverse {
    public static void main(String[] args) {
        String s = "AB";
        System.out.println("Reversed string : " + reverseString(s));
        System.out.println("Reversed string using reverseString2: " + reverseString2(s));
    }

    private static String reverseString(String s) {
        char[] reverse = new char[s.length()];
        for(int i = s.length()-1, j = 0; i >= 0 ; i--, j++) {
            reverse[j] = s.charAt(i);
        }
        return new String(reverse);
        //return Arrays.toString(reverse);
    }
    private static String reverseString2(String s) {// just another approach
        int left = 0;
        int right = s.length()-1;
        char []charArray = s.toCharArray();
        while(left < right){
            char temp;
            temp = s.charAt(left);
            charArray[left] = charArray[right];
            charArray[right] = temp;
            right--;
            left++;
        }
        return new String(charArray);
    }

}
