package com.Numbers_Problem;

public class ArmstrongNumRec {
	public static void main(String [] args) {
		range(1,1000);
	}
	public static void range(int start,int end) {
		if(start>end) return;
		if(isArmstrong(start)) System.out.println(start);
		range(start+1,end);
	}
	public static boolean isArmstrong(int n) {
		int l=String.valueOf(n).length();
		return isArmstrong(n,n,0,l);
	}
public static boolean isArmstrong(int n,int m,int sum,int l) {
	if(n==0) return m==sum;
	sum+=Math.pow(n%10,l);
	return isArmstrong(n/10,m,sum,l);
}
}
