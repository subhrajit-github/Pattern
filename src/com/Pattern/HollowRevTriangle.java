package com.Pattern;

public class HollowRevTriangle {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 1; i <= n; i++) {
            for (int j = n; j>=i; j--) {
              if (i == 1 || j == n-i+1 || i+j==6) {
                 System.out.print("*");
                } else {
                   System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
}
