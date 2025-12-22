package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/*
1. Two Sum
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution,
and you may not use the same element twice.

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
    Output: [0,1]
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int target = 6;
        int[] result = twoSum1(nums,target);
        for (int i : result) {
            System.out.println(i);
        }

    }
    public static int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static int[] twoSum(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        int sum =0;
        boolean flag = false;
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                sum = nums[i];
                sum += nums[j];

                if(sum == target){
                    result.add(i);
                    result.add(j);
                    flag = true;
                    break;
                }
            }
            if(flag)
                break;

        }
        return result.stream().mapToInt(i->i).toArray();

    }
}
