package com.pattern;

/*
THis program is to create a different pattern based on the requirement
 */
public class JavaPattern {
    public static void main(String[] args) {
        /* Print Pattern like below
        1111
        2222
        3333
        4444
         */
        printPattern(4);
        System.out.println();

        /* Print pattern like below
        1234
        1234
        1234
        1234
         */
        printPattern1(4);

        /* Print pattern like below
        1
        12
        123
        1234
         */

        printPattern2(4);

        /* Print pattern like below
           1
          121
         12321
        1234321
         */

        printPattern3(4);

    }

    public static void printPattern(int n){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void printPattern1(int n){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void printPattern2(int n){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void printPattern3(int n){
        for(int i =1;i<=n;i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            for(int j =i-1;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

