package com.Numbers_Problem;

import java.util.Scanner;

public class NeonNum {
 public static void main(String [] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the start of the range");
	 int start=sc.nextInt();
	 System.out.println("Enter the end of the range");
	 int end=sc.nextInt();
	 for(int i=start;i<=end;i++) {
		 int square=i*i;
		 int sum=0;
		 while(square>0) {
			 int rem=square%10;
			 sum+=rem;
			 square/=10;
		 }
		 if(sum==i) {
			 System.out.println(i);
		 }
		 
	 }
 }
}
