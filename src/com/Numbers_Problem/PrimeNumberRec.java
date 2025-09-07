package com.Numbers_Problem;

public class PrimeNumberRec {

	public static void main(String[] args) {
		range(1,1000);

	}
	public static void range(int start,int end) {
		if(start>end) return;
		if(start>=2 && isPrime(start,start/2)) {
			System.out.println(start);
		}
		range(start+1,end);
	}
	public static boolean isPrime(int n) {
		return isPrime(n,n/2);
	}
	public static boolean isPrime(int n,int i) {
		if(i==1) return true;
		if(n%i==0|| n<=1) return false;
		return isPrime(n,i-1);
	}

}
