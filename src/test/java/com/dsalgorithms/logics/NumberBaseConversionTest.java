package com.dsalgorithms.logics;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberBaseConversionTest {

    private NumberBaseConversion numberBaseConversion = new NumberBaseConversion();

    @Test
    public void testGetBinaryNumber(){
        assertEquals(101,numberBaseConversion.getBinaryNumber(5));
        int bin = numberBaseConversion.getBinaryNumber(8);
        System.out.println("binn "+bin);
        assertEquals(1000,bin);

    }

}
