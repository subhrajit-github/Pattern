package com.Numbers_Problem;

public class PallindromeNumRec {

	public static void main(String[] args) {
		
range(1,1000);
	}
	public static void range(int st,int end) {
		if(st>end) return;
		if(isPall(st))
			System.out.println(st);
		range(st+1,end);
	}
	public static boolean isPall(int n) {
		return isPall(n,n,0);
	}
	public static boolean isPall(int n,int m,int sum) {
		if(n==0) return m==sum;
		sum=sum*10+n%10;
		return isPall(n/10,m,sum);
	}

}
