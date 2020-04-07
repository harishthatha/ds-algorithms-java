package com.dsalgorithms.logics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    private Factorial factorial = new Factorial();

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void testFindFactorial () {
        assertEquals(1307674368000L,factorial.findFactorial(15));
        System.out.println("\n");
        assertEquals(1307674368000L,factorial.findFactorial2(15));
        System.out.println("\n");
        assertEquals(2432902008176640000L,factorial.findFactorial(20));
        System.out.println("\n");
        assertEquals(2432902008176640000L,factorial.findFactorial2(20));
    }
}
