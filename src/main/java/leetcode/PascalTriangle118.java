package leetcode;

import java.util.ArrayList;
import java.util.List;
/*

118. Pascal's Triangle

Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:
    Input: numRows = 5
    Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:
    Input: numRows = 1
    Output: [[1]]

*/
public class PascalTriangle118 {
    public static void main(String[] args) {
       // generate(5);
        getRow(3);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalList = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if(j==1||j==i){
                    list.add(1);
                }else{
                    List<Integer> temp = finalList.get(i-2);
                        list.add(temp.get(j-2)+temp.get(j-1));
                }

            }
            finalList.add(list);
        }
        System.out.println(finalList);
        return finalList;
    }

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> finalList = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j==0||j==i){
                    list.add(1);
                }else{
                    List<Integer> temp = finalList.get(i-1);
                    list.add(temp.get(j-1)+temp.get(j));
                }

            }
            finalList.add(list);
        }
        System.out.println(finalList.get(rowIndex));
        return finalList.get(rowIndex);
    }

}
