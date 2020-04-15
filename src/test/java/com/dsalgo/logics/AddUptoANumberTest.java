package com.dsalgo.logics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddUptoANumberTest {

    private static final AddUptoANumber ADD_UPTO_A_NUMBER = new AddUptoANumber();

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void testHasPairEqualToSum() {
        //assertArrayEquals(new int[] {7,9}, ADD_UPTO_A_NUMBER.hasPairEqualToSum(new int[] {1,3,4,4,6,7,9,10,58},16));
        //assertArrayEquals(new int[] {4,4}, ADD_UPTO_A_NUMBER.hasPairEqualToSum(new int[] {1,3,4,4,6,7,9,10,58},16));
    }

    @DisplayName("Efficient solution")
    @Test
    public void testHasPairWithSum() {
        //assertEquals(true, ADD_UPTO_A_NUMBER.hasPairWithSum2(new int[] {1,3,4,4,6,7,9,10,58},608));
        assertEquals(true, ADD_UPTO_A_NUMBER.hasPairWithSum2(new int[]{1, 3, 4, 4, 6, 7, 9, 10, 58}, 20));
    }
}
