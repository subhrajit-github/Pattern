package com.Numbers_Problem;

import java.util.Scanner;

public class NeonNumb {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a range");
		int start=sc.nextInt();
		int end =sc.nextInt();
		for(int i=start;i<=end;i++) {
			int square=i*i;
			int sum=0;
			while(square>0) {
				sum+=square%10;
				square/=10;
			}
			if(i==sum) {
				System.out.println(i);
			}
		}

	}

}
