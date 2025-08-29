package com.Numbers_Problem;

import java.util.Scanner;

public class StrongN {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Start of the Range");
	int st=sc.nextInt();
	System.out.println("Enter the End of the Range");
	int end=sc.nextInt();
	for(int i=st;i<=end;i++) {
		int sum=0;
		int num=i;
		while(num>0) {
			int d=num%10;
			sum+=fact(d);
			num/=10;
		}
		if(sum==i) {
			System.out.println(i);
		}
		sc.close();
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
