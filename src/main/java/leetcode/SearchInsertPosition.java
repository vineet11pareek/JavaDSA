package leetcode;

/*
35. Search Insert Position.

Given a sorted array of distinct integers and a target value,
return the index if the target is found. If not,
return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:
    Input: nums = [1,3,5,6], target = 5
    Output: 2

Example 2:
    Input: nums = [1,3,5,6], target = 2
    Output: 1

Example 3:
    Input: nums = [1,3,5,6], target = 7
    Output: 4

 */
public class SearchInsertPosition {
    public static void main(String[] args) {

        int[] num = {1,3,5,6};
        System.out.println(searchInsert(num,2));
    }
    public static int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length;
        int index = 0;
        while(left<right){
            int m = left + right / 2;
            if(nums[m]==target){
                return m;
            }else if(nums[m]<target){
                left = m+1;
            }else{
                right = m-1;
            }
        }

        return left;
    }
}
