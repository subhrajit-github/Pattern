package com.Numbers_Problem;

import java.util.Scanner;

public class PerfectNum {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Start of the Range");
	int start=sc.nextInt();
	System.out.println("Enter the end of the Range");
	int end=sc.nextInt();
	for(int i=start;i<=end;i++) {
		int sum=0;
		for(int j=1;j<=i/2;j++) 
		{
			if(i%j==0) {
				sum+=j;
			}
		}
		if(sum==i) {
			System.out.println("The perfect number between "+start+" and "+end+" is "+i);
		}
	}
}
}
