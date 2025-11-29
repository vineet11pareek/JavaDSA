package search;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {2,5,7,21,34,37,41,42};
        System.out.println(binarySearch(arr,37));
    }

    public static int binarySearch(int [] arr,int n){
        int l = 0;
        int r = arr.length-1;

        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==n){
                return mid;
            }else if(arr[mid] > n){
                r = mid -1;
            }else{
                l = mid +1;
            }
        }
        return -1;
    }
}
