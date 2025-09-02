package com.Numbers_Problem;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start of the range");
		int start=sc.nextInt();
		System.out.println("Enter the end of the range");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++) {
	       int num=i;
	       int sum=0;
	       for(int j=1;j<=num/2;j++) {
	    	   if(num%j==0) {
	    		   sum+=j;
	    	   }
	       }
	       if(sum==i) {
	    	   System.out.println("The perfect number between "+start+" and "+end +" is "+i);
	       }
}
	}

}
