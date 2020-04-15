package com.dsalgo.logics;

public class MatrixFuns {

    public int[][] findMatrixAdditioin(int[][] mat1, int[][] mat2) {
        int mat1Length = mat1.length;
        int mat2Length = mat1[0].length;
        int[][] result = new int[mat1Length][mat2Length];

        for (int i = 0; i < mat1Length; i++) { // n+1
            for (int j = 0; j < mat2Length; j++) { //(n+1)*(n+1)
                System.out.print(" " + (mat1[i][j] + mat2[i][j]));
                result[i][j] = mat1[i][j] + mat2[i][j]; //(n+1)*(n+1)
            }
            System.out.println();
            //f(n) = 2n^2 + 4n+2
            //O(n^2)
        }

        return result;
    }

    public int[][] findMatrixMultiplication(int[][] mat1, int[][] mat2) {


        return null;
    }


    public static class BinaryConversion {

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
}
