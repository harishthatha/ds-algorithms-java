package com.dsalgo.logics;

public class NumberBaseConversion {

    public int getBinaryNumber(int num) {
        StringBuilder binaryString = new StringBuilder();
        while (num > 0) {
            binaryString = binaryString.append(num % 2);
            num /= 2;
        }
        return Integer.valueOf(binaryString.reverse().toString());
    }


}
