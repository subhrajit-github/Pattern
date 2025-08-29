package com.Numbers_Problem;

import java.util.Scanner;

public class StrongNumRec {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Start of the Range");
		int n=sc.nextInt();
		System.out.println("Enter the end of the Range");
		int m=sc.nextInt();
		Range(n,m);
	}
	public static void Range(int st,int end) {
		if(st>end) return;
		if(isStrong(st))
			System.out.println(st);
		Range(st+1,end);
	}
	public static boolean isStrong(int n) {
		return isStrong(n,n,0);
	}
	public static boolean isStrong(int n,int m,int sum) {
		if(n==0) return m==sum;
		sum+=fact(n%10);
		return isStrong(n/10,m,sum);
	}
public static int fact(int n) {
	if(n==0) return 1;
	return n*fact(n-1);
}
}
