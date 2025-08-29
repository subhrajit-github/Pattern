package com.Numbers_Problem;

import java.util.Scanner;

public class Strong {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start of the range");
		int start=sc.nextInt();
		System.out.println("Enter the end of the range");
		int end=sc.nextInt();
		System.out.println("Strong number between "+start+" and "+end+" are:");
		for(int i=start;i<=end;i++) {
			int num=i;
			int sum=0;
			while(num>0) {
				int d=num%10;
				sum+=fact(d);
				 num/=10;
			}
			if(i==sum)
				System.out.println(i);
		}
	}
public static int fact(int n) {
	int fact=1;
	for(int j=1;j<=n;j++) {
		fact*=j;
		
	}
	return fact;
}
}
