package com.Numbers_Problem;

public class PerfectNumberRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		range(1,1000,0);
	}
	public static void range(int start,int end,int count) {
		if(start>end) return;
		if(isPerfect(start)) {
			System.out.println(start);
		}
		range(start+1,end,count);
	}
	public static boolean isPerfect(int n) {
		return isPerfect(n,n/2,0);
	}
	public static boolean isPerfect(int n,int i,int sum) {
		if(i==0) return n==sum;
		if(n%i==0) sum+=i;
		return isPerfect(n,i-1,sum);
	}

}
