package com.Numbers_Problem;

import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the start of range:");
        int start = sc.nextInt();

        System.out.println("Enter the end of range:");
        int end = sc.nextInt();

        System.out.println("Strong numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {
            int num = i;
            int sumFact = 0;

            while (num > 0) {
                int d = num % 10;
                sumFact += factorial(d);
                num /= 10;
            }

            if (sumFact == i) {
                System.out.println(i);
            }
        }

        sc.close();
    }

    // method to calculate factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int j = 1; j <= n; j++) {
            fact *= j;
        }
        return fact;
    }
}
