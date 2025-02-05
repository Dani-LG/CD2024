package com.daniellg;

public class matematicas {
    public int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int preFib = 1;

        for(int i = 2; i < n; i++) {
            int temp = fib;
            fib += preFib;
            preFib = temp;
        }
        return fib;
    }
}
