package com.dsalgorithms.logics;

import java.util.Arrays;

public class FibSeries {

    //Dynamic programming
    // O(n)
    public int findFibNumber(int num) {
        int[] fibSeries = new int[num];
        if (num <= 1) {
            return num;
        }

        fibSeries[0] = 0;
        fibSeries[1] = 1;
        for (int i = 2; i < num; i++) {
            fibSeries[i] = fibSeries[i - 2] + fibSeries[i - 1];
        }
        System.out.print(Arrays.toString(fibSeries));

        return fibSeries[num - 1];
    }

}
