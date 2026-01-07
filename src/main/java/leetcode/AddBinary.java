package leetcode;

public class AddBinary {
    public static void main(String[] args) {

    }
    public static String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        int carry = 0;

        int index =0;
        if(aChar.length >= bChar.length){
            index = aChar.length;
        }else{
            index = bChar.length;
        }
        for (int i = index-1; i >=0 ; i--) {
            if(i< a.length() && i<b.length()){
                if(aChar[i]!=bChar[i]){

                }
            }

        }

        return "";
    }
}
