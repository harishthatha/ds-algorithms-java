package com.dsalgo.logics;

import java.util.ArrayList;
import java.util.List;

public class AddUptoANumber {

    /**
     * Assume that input contains positives and negatives Return first pair of
     * numbers
     *
     * @return stack values
     */
    public int[] hasPairEqualToSum(int[] numbers, int sum) {
        int length = numbers.length;

        // Binary search has to be done from both the ends
        // Find mid element
        // The given Array is sorted in Ascending order
        // There can be duplicates
        if (length > 0) {

            int startIndex = 0;
            int endIndex = length - 1;
            int mid = findMidIndex(startIndex, endIndex, length);
            // length % 2 == 0 ? ((startIndex + endIndex) / 2) + 1 : (startIndex + endIndex)
            // / 2;
            // [1,23,321,12,12] [12,45,155,14,54,22]

            // Normal linear search
            /*
             * for (int i = 0; i <= mid; i++) { for(int j = i+1;j<=mid;j++) {
             * if(numbers[i]+numbers[j] == sum) {
             * System.out.println(numbers[i]+" "+numbers[j]); return new int[]
             * {numbers[i],numbers[j]}; } } }
             */

            // Binary search because the array is sorted in a ascending order

            while (numbers[mid] > sum) {
                endIndex = mid;
                mid = findMidIndex(startIndex, endIndex, length);
            }
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < endIndex; j++) {
                    if (numbers[i] + numbers[j] == sum) {
                        System.out.println(numbers[i] + " " + numbers[j]);
                        return new int[]{numbers[i], numbers[j]};
                    }
                }
            }

        }

        return null;
    }

    private int findMidIndex(int startIndex, int endIndex, int length) {
        return length % 2 == 0 ? ((startIndex + endIndex) / 2) + 1 : (startIndex + endIndex) / 2;
    }

    public int[] hasPairWithSum(int[] numbers, int sum) {
        // Initial
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int s = numbers[low] + numbers[high];
            if (s == sum) {
                System.out.println(numbers[low] + " " + numbers[high]);
                return new int[]{numbers[low], numbers[high]};
            }
        }
        return null;
    }

    public boolean hasPairWithSum2(int[] numbers, int sum) {

        List<Integer> list = new ArrayList();
        // Linear O(n)  {1,3,4,4,6,7,9,10,58}
        for (int num : numbers) {
            if (list.contains(num)) {
                System.out.println(num);
                return true;
            }
            list.add(sum - num);
        }

        return false;
    }

}
