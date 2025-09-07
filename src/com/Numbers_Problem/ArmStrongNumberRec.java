package com.Numbers_Problem;

public class ArmStrongNumberRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         range(1,1000,0);
	}
	public static void range(int start,int end,int count) {
		if(start>end) return ;
		if(isArmstrong(start)) {
			count++;
			System.out.println(start);
		}
		range(start+1,end,count);
	}
	public static boolean isArmstrong(int n) {
		int l=String.valueOf(n).length();
		return isArmstrong(n,n,0,l);
	}
	public static boolean isArmstrong(int n,int m,int sum,int l) {
		if(n==0) return m==sum;
		sum+=Math.pow(n%10, l);
		return isArmstrong(n/10,m,sum,l);
	}

}
