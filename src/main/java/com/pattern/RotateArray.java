package com.pattern;

public class RotateArray {
    public static void main(String[] args) {
        int [] arr = {2,5,7,21,34,37,41,42};
        int [] newArr = rotateArray(arr,2);
        for (int i : newArr) {
            System.out.print(i+" ");

        }
    }

    public static int[] rotateArray(int [] arr, int d){
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
}
