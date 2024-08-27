package com.leetcode.san;

public class TwoSum {

    public static void main(String[] args) {
        int[] results = twoSum(new int[]{2,3,4}, 6);
        for(int result: results){
            System.out.println(result);
        }
    }
    //Using for loop (O)n^2
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(target == nums[i]+nums[j])
                    return new int[]{i,j};
            }
        }
        return new int[0];
    }

}
