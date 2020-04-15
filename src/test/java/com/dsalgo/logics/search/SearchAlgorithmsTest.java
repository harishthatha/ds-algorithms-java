/**
 *
 */
package com.dsalgo.logics.search;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * @author haris
 *
 */
class SearchAlgorithmsTest {

    /**
     * @throws java.lang.Exception
     */
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("before class");
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("Tear down after class");
    }

    /**
     * @throws java.lang.Exception
     */
    @BeforeEach
    void setUp() throws Exception {
        System.out.println("Set up");
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterEach
    void tearDown() throws Exception {
        System.out.println("Tear down");
    }

    @Test
    void test() {
        System.out.println("In test method of Search algorithm test");
        fail("Not yet implemented");

    }


}
