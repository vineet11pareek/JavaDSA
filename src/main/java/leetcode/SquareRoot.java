package leetcode;

/*
69. Sqrt(x)

Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

Example 1:
    Input: x = 4
    Output: 2
    Explanation: The square root of 4 is 2, so we return 2.

Example 2:
    Input: x = 8
    Output: 2
    Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 */
public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }
    public static int mySqrt(int x) {
        if(x<=0)
            return 0;
        long min = 1;
        long high = x;
        long result =1;
        while(min <=high){
            long mid = (min + high)/2;
            if(mid*mid <= x) {
                result = mid;
                min = mid + 1;
            }else{
                high = mid-1;
            }
        }

        return (int)result;
    }
}
