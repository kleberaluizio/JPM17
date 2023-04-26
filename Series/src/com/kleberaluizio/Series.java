package com.kleberaluizio;

import java.util.ArrayList;

public class Series {

    public static int nSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else if (n == 1) {
            return 1;
        } else {
            return 0;
        }

    }

    public static int fibonacci(int n) {

        ArrayList<Integer> fibo = new ArrayList<>();
        fibo.add(0);
        fibo.add(1);



        int value = 0;

        if (n == 0) {
            return fibo.get(0);
        } else if (n == 1) {
            return fibo.get(1);
        } else {
            for (int i = 2; i <= n; i++) {
                value = fibo.get(i-1) + fibo.get(i-2);
                fibo.add(value);
            }

        }

        return value;
    }
}
