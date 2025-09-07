package com.Numbers_Problem;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range");
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start;i<=end;i++) {
			int num=i;
			int sum=0;
			while(num>0) {
				int rem=num%10;
				sum=sum*10+rem;
				num/=10;
			}
			int count=0;
			if(sum==i) {
				count++;
				if(count%2==0) {
					System.out.println(i);
				}
			}
		}

	}

}
