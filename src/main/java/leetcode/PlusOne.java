package leetcode;

import java.util.Arrays;

/*
66. Plus one

You are given a large integer represented as an integer array digits,
where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order.
The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

Example 1:
    Input: digits = [1,2,3]
    Output: [1,2,4]
    Explanation: The array represents the integer 123.
    Incrementing by one gives 123 + 1 = 124.
    Thus, the result should be [1,2,4].

Example 2:
    Input: digits = [4,3,2,1]
    Output: [4,3,2,2]
    Explanation: The array represents the integer 4321.
    Incrementing by one gives 4321 + 1 = 4322.
    Thus, the result should be [4,3,2,2].

Example 3:
    Input: digits = [9]
    Output: [1,0]
    Explanation: The array represents the integer 9.
    Incrementing by one gives 9 + 1 = 10.
    Thus, the result should be [1,0].
 */
public class PlusOne {
    public static void main(String[] args) {

        int[] digits = {9,8,9};
        int[] result = plusOne(digits);
        Arrays.stream(result).forEach(System.out::println);
    }
    public static int[] plusOne(int[] digits) {
        if(digits.length<=0){
            return digits;
        }
        for (int i=digits.length-1;0<=i;i--) {

            if(digits[i]+1>9 && i!=0){
                digits[i] = 0;
            }else if(digits[i]+1>9 && i==0){
                digits = Arrays.copyOf(digits, digits.length + 1);
                digits = shiftArray(digits);
                digits[i] = 1;
                digits[i+1] = 0;
            }else{
                digits[i] = digits[i]+1;
                break;
            }
        }
        return digits;
    }
    public static int[] shiftArray(int[] digits){
        for (int i = digits.length-1; 0 < i; i--) {
            int temp = digits[i];
            digits[i]=digits[i-1];
            digits[i-1] = temp;

        }
        return digits;
    }
}
