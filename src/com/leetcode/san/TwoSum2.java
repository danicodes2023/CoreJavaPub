package com.leetcode.san;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.
        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        Example 2:

        Input: nums = [3,2,4], target = 6
        Output: [1,2]
        Example 3:

        Input: nums = [3,3], target = 6
        Output: [0,1]*/
public class TwoSum2 {
    public static void main(String[] args){
        int[] arr = {2,7,11,15,18};
        int target = 26;
        System.out.println(Arrays.toString(findTwoSum(arr, target)));
        System.out.println("findtwoSumAdv : "+Arrays.toString(findtwoSumAdv(arr, target)));
        System.out.println("twoSum : "+Arrays.toString(twoSum(arr, target)));
    }
    //Test 2 cases ; then do this pgm once more as a test<<<< TD
    public static int[] findtwoSumAdv(int[] nums, int target) {//Optimized for O(N)
        Map<Integer, Integer> sumMap = new HashMap<>();
        int complement;
        for(int i=0; i<nums.length; i++){
            complement = target - nums[i];
            if(sumMap.containsKey(complement))
                return new int[]{sumMap.get(complement), i};
            else
                sumMap.put(nums[i], i);
        }
        return new int[0];
    }
    public static int[] twoSum(int[] nums, int target){
        int comp;
        Map<Integer, Integer> compMap = new HashMap<>() ;
        for(int i = 0; i < nums.length; i++){
            comp = target - nums[i];
            if(compMap.containsKey(comp))
                return new int[]{compMap.get(comp), i};
            else
                compMap.put(nums[i], i);
        }
        return new int[0];
    }
    public static int[] findTwoSum(int[] inputArr, int target){// brute force solution O(N^2)
        for(int i = 0; i < inputArr.length; i++){
            for(int j = i+1; j < inputArr.length; j++)  {
                if(target == inputArr[i] + inputArr[j]) {
                    return new int[]{i,j};
                }
            }
        }
        return  new int[0];//same as new int[]{}
    }
}
