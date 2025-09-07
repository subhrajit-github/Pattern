package com.Numbers_Problem;

public class SpyNumberRec {

	public static void main(String[] args) {
		range(1,1000,0);
	}
	public static void range(int st,int end,int count) {
		if(st>end) return;
		if(isSpy(st)) {
			count++;
			if(count%2!=0) {
				System.out.println(st);
			}
		}
		range(st+1,end,count);
	}
	public static boolean isSpy(int n) {
		return isSpy(n,0,1);
	}
	public static boolean isSpy(int n,int sum,int prod) {
		if(n==0) return sum==prod;
		return isSpy(n/10,sum+=n%10,prod*=n%10);
	}

}
