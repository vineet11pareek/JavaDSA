package leetcode;

import java.util.Arrays;
/*
88. Merge Sorted Array
You are given two integer arrays nums1 and nums2,
sorted in non-decreasing order, and two integers m and n,
representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function,
but instead be stored inside the array nums1.
To accommodate this, nums1 has a length of m + n,
where the first m elements denote the elements that should be merged,
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Example 1:
    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    Output: [1,2,2,3,5,6]
    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Example 2:
    Input: nums1 = [1], m = 1, nums2 = [], n = 0
    Output: [1]
    Explanation: The arrays we are merging are [1] and [].
    The result of the merge is [1].

Example 3:
    Input: nums1 = [0], m = 0, nums2 = [1], n = 1
    Output: [1]
    Explanation: The arrays we are merging are [] and [1].
    The result of the merge is [1].
    Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 */
public class MergeSortedArray88 {
    public static void main(String[] args) {

        try {
            String s=null;
            System.out.println(s.length());
        } catch (RuntimeException e) {
            System.out.println("null error");
        }
        int[] nums1 = {-1,0,0,3,3,3,0,0,0};
        int[] nums2 = {1,2,2};
        merge1(nums1,6,nums2,3);

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int counter  = 0;
        for(int i=0;i<nums1.length;i++){
            while(counter<n){
                if(nums1[i] < nums2[counter] && i<m){
                    break;
                }else{
                    shiftArray(i,nums1);
                    m+=1;
                    nums1[i] = nums2[counter++];
                }

            }

        }
        Arrays.stream(nums1).forEach((i) -> System.out.println(i));

    }

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int x = m-1;
        int y = n-1;
        int i = m+n-1;

        while(i>=0 && y>=0){
            if(x>=0 && nums1[x]>nums2[y]){
                nums1[i]= nums1[x--];
            }else{
                nums1[i]= nums2[y--];
            }
            i--;
        }
    }
    public static int[] shiftArray(int n,int[] arr){
        for (int i = arr.length - 1; i > n; i--) {
            arr[i] = arr[i - 1];
        }
        return arr;
    }
}
