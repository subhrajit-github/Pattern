package com.Numbers_Problem;
import java.util.Scanner;
public class BintoDecRec {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a binary number");
		int bin=sc.nextInt();
		System.out.println("The decimal number is :"+convert(bin,1));
	}
	
	public static int convert(int bin,int p) {
		if(bin==0) return 0;
		int rem=bin%10;
		return rem*p + convert(bin/10,p*2);
	}

}
