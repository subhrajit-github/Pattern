package com.Numbers_Problem;

public class PrimeNumRec {
	public static void main(String [] args) {
		range(1,10,0);
	}
	public static void range(int start,int end,int count) {
		if(start>end) return;
		if(isPrime(start,start/2)) {
			count++;
			if(count==2)
				System.out.println(start);
		}
		range(start+1,end,count);
	}
	public static boolean isPrime(int n) {
		return isPrime(n,n/2);
	}
public static boolean isPrime(int n,int i) {
	if(i==1) return true;
	if(n<=1||n%i==0) return false;
	return isPrime(n,i-1);
}
}
