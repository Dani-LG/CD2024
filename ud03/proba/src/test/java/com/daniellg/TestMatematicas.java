package com.daniellg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestMatematicas {
    @Test
    public void fib(){
        matematicas mat = new matematicas();
        assertEquals(mat.fibonacciIterative(0), 0);
        assertEquals(mat.fibonacciIterative(1), 1);
        assertEquals(mat.fibonacciIterative(2), 1);
        assertEquals(mat.fibonacciIterative(3), 2);
        assertEquals(mat.fibonacciIterative(7), 13);
        assertEquals(mat.fibonacciIterative(8), 21);
    }
}
