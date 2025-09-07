package com.Numbers_Problem;

public class ReverseNumberRec {

	public static void main(String[] args) {
		
range(1,1000);
	}
	public static void range(int start,int end) {
		if(start>end) return;
		if(isRev(start)) 
			System.out.println(start);
		range(start+1,end);
	}
	public static boolean isRev(int n) {
		return n==isRev(n,0);
	}
	public static int isRev(int n,int rev) {
		if(n==0) return rev;
		rev=rev*10+n%10;
		return isRev(n/10,rev);
	}

}
