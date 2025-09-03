package com.Numbers_Problem;

import java.util.Scanner;

public class PrimeNum {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the range: Start-End");
	int start=sc.nextInt();
	int end=sc.nextInt();
	for(int i=start;i<=end;i++) {
		boolean flag=true;
		for(int j=2;j<=i/2;j++) {
			if(i%j==0) flag=false;
			break;
		}
		int count=0;
		if(i>1 && flag) {
			count++;
			if(count%2==0) {
				System.out.println(i);
			}
		}
	}
}
}
