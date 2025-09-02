package com.Numbers_Problem;

import java.util.Scanner;

public class RevNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start of the Range");
		int start=sc.nextInt();
		System.out.println("Enter the end of the Range");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++) {
			int rev=0;
			int num=i;
			while(num>0) {
				int rem=num%10;
				rev=rev*10+rem;
				num/=10;
			}
			System.out.println(rev);
		}
	}

}
