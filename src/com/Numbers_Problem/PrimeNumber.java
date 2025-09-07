package com.Numbers_Problem;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start;i<=end;i++) {
			boolean flag=true;
			int num=i;
			int count=0;
			for(int j=2;j<=num/2;j++) {
				if(num%j==0)
					flag=false;
				break;
			}
			
			if(num>1 && flag) {
				count++;
				if(count%2==0) {
					System.out.println(i);
				}
			}
		}

	}

}
