package com.leetcode.san;

import java.util.Arrays;

/*Write a java program to separate zeros from non-zeros in an integer array
i/p: [1,0,2,0,3,0,4,5] o/p: [1,2,3,4,5,0,0,0]*/
public class SeparateZeros {
    public static void main(String[] args){
        int[] array = {1,0,2,0,3,0,4,5};
        System.out.println("I/P : " + Arrays.toString(array));
        System.out.println("O/P : " + Arrays.toString(separateZeros(array)));
    }
    public static int[] separateZeros(int[] arr){
        for(int i = 0,j = 0; i < arr.length; i++){
            int temp;
            if(arr[i] != 0){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    return arr;
    }
}
