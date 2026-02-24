package leetcode.arrays;

import java.util.*;
/*
136. Single Number

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
    Input: nums = [2,2,1]
    Output: 1

Example 2:
    Input: nums = [4,1,2,1,2]
    Output: 4

Example 3:
    Input: nums = [1]
    Output: 1
 */
public class SingleNumber136 {
    public static void main(String[] args) {
        int num[] = {4,1,2,1,2};
        System.out.println(singleNumber( num));
        System.out.println(singleNumberDiff( num));
    }
    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }

    public static int singleNumberDiff(int[] nums) {
       Set<Integer> set = new HashSet<>();
       for (int num : nums) {
           if(set.contains(num)){
               set.remove(num);
           }else  {
               set.add(num);
           }
       }
       return set.iterator().next();
    }
}
