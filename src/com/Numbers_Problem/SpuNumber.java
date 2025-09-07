package com.Numbers_Problem;

import java.util.Scanner;

public class SpuNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a range");
		int start=sc.nextInt();
		int end=sc.nextInt();
		
		for(int i=start;i<=end;i++) {
			int sum=0;
			int prod=1;
			int num=i;
			while(num>0) {
				sum+=num%10;
				prod*=num%10;
				num/=10;
			}
			if(sum==prod)
				System.out.println("Spy number between "+start+" and "+end+" are :"+i);
		}
	}

}
