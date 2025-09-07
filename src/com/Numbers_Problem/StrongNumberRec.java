package com.Numbers_Problem;

public class StrongNumberRec {

	public static void main(String[] args) {
		range(1,1000,0);
	}
	public static void range(int st,int end,int count) {
		if(st>end) return;
		if(isStrong(end)) {
			count++;
			System.out.println(end);
		}
		range(st,end-1,count);
	}
	public static boolean isStrong(int n) {
		return isStrong(n,n,0);
	}
	public static boolean isStrong(int n,int m,int sum) {
		if(n==0) return m==sum;
		int d=n%10;
		sum+=fact(d);
		return isStrong(n/10,m,sum);
	}
	public static int fact(int n) {
		if(n==0) return 1;
		return n*fact(n-1);
	}

}
