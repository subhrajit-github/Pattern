package com.Numbers_Problem;

import java.util.Scanner;

public class SpyNumRange {
    public static void main(String [] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the Start of the range");
    	int st=sc.nextInt();
    	System.out.println("Enter the end of the range");
    	int end=sc.nextInt();
    	for(int i=st;i<=end;i++) {
    		int sum=0;
    		int prod=1;
    		int num=i;
    		while(num>0) {
    			sum+=num%10;
    			prod*=num%10;
    			num/=10;
    		}
    		if(sum==prod)
    			System.out.println(i);
    	}
    }
}
