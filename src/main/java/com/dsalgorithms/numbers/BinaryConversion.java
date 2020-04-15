package com.dsalgorithms.numbers;

public class BinaryConversion {

    public String convertToBinaryNumber(int num) {
        // convert decimal to binary
        StringBuilder binaryNum = new StringBuilder();
        while (num > 0) {
            binaryNum.append(num % 2);
            num /= 2;
        }
        System.out.println("Binary number " + binaryNum.reverse());
        return null;
    }


}
