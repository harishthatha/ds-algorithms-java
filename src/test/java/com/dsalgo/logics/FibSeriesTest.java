package com.dsalgo.logics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibSeriesTest {
    private static final FibSeries FIB_SERIES = new FibSeries();

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void testFindFibNumber() {
        assertEquals(3, FIB_SERIES.findFibNumber(5));
    }

}
