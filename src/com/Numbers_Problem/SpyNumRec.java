package com.Numbers_Problem;

public class SpyNumRec {
	public static void main(String [] args) {
		Range(1,1000,0);
	}
	public static void Range(int st,int end,int count) {
		if(st>end) return;
		if(isSpy(st)) {
			count++;
			if(count%2!=0) {
				System.out.println(st);
			}
			
		}
		Range(st+1,end,count);
	}
	public static boolean isSpy(int n) {
		return isSpy(n,1,0);
	}
public static boolean isSpy(int n,int prod,int sum) {
	if(n==0) return prod==sum;
	sum+=n%10;
	prod*=n%10;
	return isSpy(n/10,prod,sum);
}
}
