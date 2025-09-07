package com.Numbers_Problem;

import java.util.Scanner;

public class StronNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Start of the Range");
		int start=sc.nextInt();
		System.out.println("Enter the End of the Range");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++) {
			int sum=0;
			int num=i;
			while(num>0) {
				int d=num%10;
				sum+=fact(d);
				num/=10;
			}
			if(i==sum)
			System.out.println("The Strong number between "+start+" and "+end+" is : "+i);
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
