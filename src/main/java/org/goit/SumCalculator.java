package org.goit;

public class SumCalculator {

    public int sum(int n) {
        if (n == 0) {
            throw new IllegalArgumentException("IllegalArgumentException");
        }
        int sumOfNumbers = 1;
        if (n == 1) {
            return sumOfNumbers;
        }
        sumOfNumbers = n + sum(n - 1);
        return sumOfNumbers;
    }
}
