package com.dsalgo.logics.sorts;

import java.util.stream.IntStream;

public class SearchAlgorithms {

    //Linear search
    public static int linearSearch(int[] nums, int searchInput) {

        int length = nums.length;

        for (int i = 0; i < length; i++) {

            if (nums[i] == searchInput) {
                return i;
            }
        }

        //Best case O(1)
        //Worst case O(n)
        //Advantage is no need of checking or converting array to be sorted
        //We will compare each and every element and when we find a match we return from there


        return -1;
    }

    public static int binarySearch(int[] nums, int searchInput) {

        int length = nums.length;
        int startIndex = 0;
        int endIndex = nums.length - 1;
        int mid = (startIndex + endIndex) / 2;

        IntStream.of(nums).forEachOrdered(System.out::println);

        return -1;
    }


}
