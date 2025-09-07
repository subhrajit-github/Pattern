package com.Numbers_Problem;

public class NeonNumberRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			range(1,1000);
	}
	public static void range(int start,int end) {
		if(start>end) return ;
		if(isNeon(end))
			System.out.println(end);
		range(start,end-1);
	}
	
	public static boolean isNeon(int n) {
		return isNeon(n,n*n,0);
	}
	public static boolean isNeon(int n,int square,int sum) {
		if(square==0) return n==sum;
		sum+=square%10;
		return isNeon(n,square/10,sum);
				
	}

}
