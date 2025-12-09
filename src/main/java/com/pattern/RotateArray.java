package com.pattern;

import java.util.Arrays;
import java.util.List;

public class RotateArray {
    
    public static void main(String[] args) {
        int [] arr = {2,5,7,21,34,37,41,42};

        //From first Approach without optimisation
        int [] arr1 = rotateArray(arr,2);
        int [] arr2 = rotateArrayOptimise(arr,2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }


    /*
    Time complexity  = O(n²), which is not good but solve the issue
    below code runs:
        * Outer loop: d times
        * Inner loop: n times
    Total = O(d × n)
    If d = n, it becomes O(n²) → very slow for large arrays.
    Space Complexity
        * Uses only a few variables → O(1).
     */
    private static int[] rotateArray(int [] arr, int d){
        for (int i=0; i<d;i++){
            int temp = arr[0];
            for(int j =0;j<=arr.length-1;j++){
                if(j<=arr.length-2){
                    arr[j] = arr[j+1];
                }
                if(j==arr.length-1){
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    /*
    Rotate left by d using:
1       ️* Reverse first d elements
        * Reverse remaining n - d
        * Reverse whole array
    ->Time Complexity: O(n)
    ->Space Complexity: O(1)
    ->No extra array needed
    ->Works even for large n
     */

    private static int[] rotateArrayOptimise(int[] arr, int d) {
        int n = arr.length;
        d = d % n;   // handle cases where d > n

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);

        return arr;
    }
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
