package com.Numbers_Problem;

import java.util.Scanner;

public class BintoDec {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter a binary Num :");
		int bin=sc.nextInt();
		int sum=0;
		int p=1;
		while(bin>0) {
			int rem=bin%10;
			sum+=rem*p;
			bin/=10;
			p=p*2;
		}
		System.out.println(sum);

	}

}
