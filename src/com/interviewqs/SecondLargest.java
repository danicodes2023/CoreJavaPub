package com.interviewqs;

import java.util.Arrays;
/*Second largest number in an array , second smallest */
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 1, 6, 0};
        secondLargest(arr);
        secondSmallest(arr);
    }

    private static void secondLargest(int[] arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = n;
            } else if (n > secondLargest) {
                secondLargest = n;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Second largest: "+secondLargest);
    }
    private static void secondSmallest(int[] arr) {
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int n : arr) {
            if (n < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = n;
            } else if (n < secondSmallest) {
                secondSmallest = n;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Second Smallest: "+secondSmallest);
    }
}
