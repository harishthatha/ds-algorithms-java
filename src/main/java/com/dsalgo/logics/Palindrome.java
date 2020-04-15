package com.dsalgo.logics;

import java.util.Set;
import java.util.TreeSet;

public class Palindrome {

    public Set<String> findLongestPalindrom(String input) {
        final int length = input.length();
        String longestPalindrome = "";
        Set<String> longestPalindromes = new TreeSet<>();
        // Best case is O(1)
        // Worst case is O(n-2)
        // Palindrome has to be more than 2 characters
        for (int i = 0; i < length - 1; i++) {
            String subInput = input.substring(i);
            int subInputLength = subInput.length();
            for (int j = subInputLength - 1; j >= 1; j--) {
                String subSubInput = subInput.substring(0, j + 1);
                int subSubIpLength = subSubInput.length();

                if (checkPalindromeOrNot(subSubInput) && longestPalindrome.length() <= subSubIpLength) {
                    longestPalindromes.add(subSubInput);
                    longestPalindrome = subSubInput;
                    break;
                }
            }
        }
        System.out.println("Longest palindrome is " + longestPalindromes);
        return longestPalindromes;
    }

    public boolean checkPalindromeOrNot(String input) {
        boolean isPalindrome = true;
        if (input != null && !input.equals("")) {
            char[] inputArr = input.toCharArray();
            int length = inputArr.length;

            int startIndex = 0;
            int endIndex = length - 1;
            final int mid = length % 2 == 0 ? (length / 2) + 1 : length / 2;

            // Best case O(1)
            // Worst case O((n/2)+1)
            for (int i = 0; i <= mid; i++) {
                if (inputArr[startIndex] == inputArr[endIndex]) {
                    startIndex++;
                    endIndex--;
                } else {
                    isPalindrome = false;
                    break;
                }
            }

        } else {
            System.out.println("Input can not be empty");
            isPalindrome = false;
        }

        return isPalindrome;
    }

    // O(n) logic for palindrome check
    public boolean checkPalindromeNormalWay(String input) {
        boolean isPalindrome = true;
        if (input != null && !input.equals("")) {
            char[] inputArr = input.toCharArray();
            int length = inputArr.length;

            // O(n) solution , means in this the loop statements executes n times
            // The best case of this O(n) only

            StringBuilder reverseString = new StringBuilder();
            // Using normal for loop

            for (int i = length - 1; i >= 0; i--) {
                reverseString.append(inputArr[i]);
            }

            // Using int stream

            /*
             * IntStream.range(0, length).map(i -> 0 - i + length - 1).mapToObj(i ->
             * inputArr[i]) .forEach(val -> reverseString.append(val));
             */

            if (!input.equals(reverseString.toString())) {
                System.out.println("Given input " + input + " is a Palindrome");
                isPalindrome = false;
            }

        } else {
            System.out.println("Input can not be empty");
            isPalindrome = false;
        }

        return isPalindrome;
    }

    public boolean isPalindrome(final int inputNum) {
        // Finding palindrome integer must be greater than 9
        int input = inputNum;
        if (input > 9) {
            int reverseNum = 0;
            while (input > 0) {
                reverseNum = reverseNum * 10 + input % 10;
                input = input / 10;
            }

            System.out.println("Reverse number is " + reverseNum);
            return inputNum == reverseNum || inputNum == reverseNum + input;
        }

        return false;
    }

}
