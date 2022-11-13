package com.bridgelabz.logicalprogram;

public class FibonacciSeries {

    public static void main(String[] args) {
        FibonacciSeries fs = new FibonacciSeries();
        fs.printFibonacciSeries();
    }

    public void printFibonacciSeries() {
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        int c;
        for (int i = 1; i <= 10; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}