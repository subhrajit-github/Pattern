package com.Numbers_Problem;

import java.util.Scanner;

public class PallindromeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Start of the Range");
		int st=sc.nextInt();
		System.out.println("Enter the End of the Range");
		int end=sc.nextInt();
       for(int i=st;i<=end;i++) {
    	   int rev=0;
    	   int num=i;
    	   while(num>0) {
    		   int rem=num%10;
    		   rev=rev*10+rem;
    		   num/=10;
    	   }
    	   if(rev==i) {
    		   System.out.println("The pallindrome number between "+st+" and "+end+" is "+i);
    	   }
       }
	}

}
