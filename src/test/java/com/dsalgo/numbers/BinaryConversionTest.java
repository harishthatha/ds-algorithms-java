package com.dsalgo.numbers;

import com.dsalgo.logics.MatrixFuns;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryConversionTest {

    private MatrixFuns.BinaryConversion binaryConversion = new MatrixFuns.BinaryConversion();

    @Test
    void convertToBinaryNumber() {
        assertEquals("", binaryConversion.convertToBinaryNumber(125));
        assertEquals("", binaryConversion.convertToBinaryNumber(125));
    }
}