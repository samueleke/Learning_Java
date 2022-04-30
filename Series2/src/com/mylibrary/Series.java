package com.mylibrary;

public class Series {

    public static long nSum(int n) {
        return ((long) n * (n + 1) / 2);
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i < n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int fibonacci(int n) {
        int n1 = 0, n2 = 1, n3 = 0;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            for (int i = 2; i < n; i++) {
                n3 = n2 + n1;
                n1 = n2;
                n2 = n3;
            }
            return n3;
        }

    }


}
