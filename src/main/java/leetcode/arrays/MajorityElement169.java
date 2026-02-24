package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


/*
169. Majority Element

Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.

Example 1:
    Input: nums = [3,2,3]
    Output: 3

Example 2:
    Input: nums = [2,2,1,1,1,2,2]
    Output: 2

 */
public class MajorityElement169 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));

    }
    public static int majorityElement(int[] nums) {
        AtomicInteger max = new AtomicInteger();
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        map.entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(entry -> max.set(entry.getKey()));
        return max.get();
    }

    public static int majorityElementDiff(int[] nums) {
       int count=0;
       int candidate=0;
       for(int num:nums){
           if(count==0){
               candidate=num;
           }
           count += (num==candidate)?1:-1;
       }
       return candidate;
    }
}
