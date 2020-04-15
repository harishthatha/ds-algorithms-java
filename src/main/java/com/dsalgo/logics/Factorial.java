package com.dsalgo.logics;

public class Factorial {

    public long findFactorial(long num) {

        long fact = 1;
        // O(n log n) runtime
        //O(n log n) space complexity
        System.out.println("In multit line");
        long mid = ((num & 1) == 0) ? num / 2 : (num / 2) + 1;
        long nextNum = mid + 1;
        for (long i = mid; i > 0; i--) { // calculates from mid to right and left at a time n/2 loops
            System.out.println(i + "  " + nextNum + " " + fact);
            if (nextNum <= num) fact *= i * (nextNum);
            else fact *= i;
            nextNum++;
        }
        return fact;
    }

    public long findFactorial2(long num) {

        long fact = num;
        // O(n) runtime
        //O(1) space complexity
        System.out.println("In single line solution");
        //Calculates from right to left n loops
        for (long i = num - 1; i > 0; i--) {
            System.out.println(i + " " + fact);
            fact *= i;
        }
        return fact;
    }
}
