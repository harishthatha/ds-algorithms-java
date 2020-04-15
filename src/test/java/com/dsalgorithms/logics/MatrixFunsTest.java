package com.dsalgorithms.logics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MatrixFunsTest {

    private MatrixFuns matrixFuns = new MatrixFuns();

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    @DisplayName("Matrix addition")
    void testFindMatrixAdditioin() {
        assertArrayEquals(new int[][]{{5, 4, 6}, {5, 6, 7}, {9, 6, 3}}, matrixFuns.findMatrixAdditioin(new int[][]{{1, 2, 4}, {1, 3, 5}, {5, 3, 2}},
                new int[][]{{4, 2, 2}, {4, 3, 2}, {4, 3, 1}}));
        assertArrayEquals(new int[][]{{5, 4, 6, 9}, {5, 6, 7, 11}, {9, 6, 3, 12}}, matrixFuns.findMatrixAdditioin(new int[][]{{1, 2, 4, 5}, {1, 3, 5, 4}, {5, 3, 2, 4}},
                new int[][]{{4, 2, 2, 4}, {4, 3, 2, 7}, {4, 3, 1, 8}}));
    }

}
