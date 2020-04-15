package com.dsalgo.logics.search;

public class SearchAlgorithms {

    // Linear search
    public static int linearSearch(int[] nums, int searchInput) {

        int length = nums.length;

        for (int i = 0; i < length; i++) {

            if (nums[i] == searchInput) {
                return i;
            }
        }

        // Best case O(1)
        // Worst case O(n)
        // Advantage is no need of checking or converting array to be sorted
        // We will compare each and every element and when we find a match we return
        // from there

        return -1;
    }

    public static int binarySearch(int[] nums, int searchInput) {

        // This is only for sorted arrays , for unsorted arrays you should either sort
        // the array before binary search
        // Or you can go with Linear search

        int startIndex = 0;
        int endIndex = nums.length - 1;
        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (searchInput == nums[mid]) {
                return mid;
            } else if (searchInput < nums[mid]) {
                endIndex = mid - 1;

            } else if (searchInput > nums[mid]) {
                startIndex = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int indexFromBS = binarySearch(new int[]{1, 5, 9, 13, 23, 24, 98}, 4);
        int indexFromLS = linearSearch(new int[]{1, 5, 9, 13, 23, 24, 98}, 98);

        if (indexFromLS == -1 && indexFromBS == -1) {
            System.out.println("Element"
                    + ""
                    + ""
                    + " is not found");
        } else {
            System.out.println("Search element found at " + indexFromBS + " " + indexFromLS);
        }
    }

    /*
     * String[] names = {"Sam", "Pamela", "Dave", "Pascal", "Erik"};
     * IntStream.range(0, names.length) .filter(i -> names[i].length() <= i)
     * .mapToObj(i -> names[i]) .collect(Collectors.toList());
     */

}
