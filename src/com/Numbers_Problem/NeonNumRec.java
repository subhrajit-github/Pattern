package com.Numbers_Problem;

public class NeonNumRec {
	public static void main(String [] args) {
		Range(1,1000,0);
	}
	public static void Range(int st,int end,int ct) {
		if(st>end) return;
		if(isNeon(end)) {
			System.out.println(end);
		}
		Range(st,end-1,ct);
	}
	public static boolean isNeon(int n) {
		return isNeon(n,n*n,0);
	}
	
 public static boolean isNeon(int n,int square,int sum) {
	 if(square==0) return sum==n;
	 sum+=square%10;
	 return isNeon(n,square/10,sum);
 }
}
