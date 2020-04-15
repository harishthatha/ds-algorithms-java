package com.dsalgorithms.threads;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Thread1Test {

    private static final Thread1 THREAD1 = new Thread1();
    private static final Thread1 THREAD2 = new Thread1();

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void testRun() {
        Thread1 thread1 = new Thread1();
        Thread1 thread2 = new Thread1();
        thread1.start();
        thread2.start();
        //assertEquals(1,1);
    }

}
