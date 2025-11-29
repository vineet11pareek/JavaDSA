package search;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {2,5,7,21,34,37,41,42};
        System.out.println(linearSearch(arr,37));
    }

    public static int linearSearch(int [] arr, int n){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
}
