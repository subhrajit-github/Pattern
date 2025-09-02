package com.Numbers_Problem;

public class RevNumRec {

    public static void main(String[] args) {
        range(1, 100);
    }

    public static void range(int start, int end) {
        if (start > end) return;
        int rev = reverse(start, 0);
        System.out.println("Original: " + start + " -> Reversed: " + rev);
        range(start + 1, end);
    }

    public static int reverse(int n, int rev) {
        if (n == 0) return rev;
        return reverse(n / 10, rev * 10 + n % 10);
    }
}
