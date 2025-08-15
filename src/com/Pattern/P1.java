package com.Pattern;

public class P1 {
     public static void main(String [] args) {
    	 int n=5;
    	 for(int i=1;i<=n;i++) {
    		 for(int j=1;j<=5;j++){
    		if(i==1 || i==n ||j==(n/2)+1) {
    			System.out.print("*");
    		}
    		else {
    			System.out.print(" ");
    		}
    		 }
    		 System.out.println();
    		 }
    		 
     }
}
