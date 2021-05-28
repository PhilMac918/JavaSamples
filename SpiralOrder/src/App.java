//package com.codility;

// you can also use imports, for example:
import java.lang.reflect.Array;
import java.util.*;

public class App {

    public static void main(String[] args) {
        // you can write to stdout for debugging purposes, e.g.

        System.out.println(getSpiralOrder(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }));

        System.out.println(getSpiralOrder(new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } }));

        System.out.println(
                getSpiralOrder(new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } }));

    }

    private static List<Integer> getSpiralOrder(int[][] matrix) {
        // WRITE YOUR CODE HERE

        List<Integer> result = new ArrayList<Integer>();

        // first row

        // last column

        // last row (reverse order)

        // first column (reverse order)

        // shrink the size of the matrix

        // https://azure.microsoft.com/en-us/services/orbital/

        int i = 0;

        while (i < matrix.length) {

            if (i == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    result.add(matrix[i][j]);
                }
            }
            if (i == 1) {
                for (int k = 1; k < matrix.length; k++) {
                    result.add(matrix[k][(matrix[k].length - 1)]);
                }

            }

            if (i == 2) {
                for (int k = matrix[i].length - 2; k >= 0; k--) {
                    result.add(matrix[matrix.length - 1][k]);
                }

                for (int k = matrix.length - 2; k >= 1; k--) {
                    result.add(matrix[k][0]);
                }
            }
            i++;
        }

        if (matrix[0].length == 3)
            result.add(matrix[1][1]);

        if (matrix[0].length == 4 && matrix.length == 4) {
            result.add(matrix[1][1]);
            result.add(matrix[1][2]);
            result.add(matrix[2][2]);
            result.add(matrix[2][1]);
        }

        if (matrix[0].length == 4 && matrix.length == 3) {
            result.add(matrix[1][1]);
            result.add(matrix[1][2]);
        }

        if (matrix[0].length > 4) {
            // create new array
            int size = matrix.length - 2;
            int[][] updatedArray = new int[size][size];
            for (int l = 0; l < matrix.length - 2; l++) {
                for (int m = 0; m < matrix[0].length - 2; m++) {
                    updatedArray[l][m] = matrix[l + 1][m + 1];
                }
            }

            System.out.println(updatedArray);
            // Call getSpiralOrder
            getSpiralOrder(updatedArray);
        }

        return result;
    }

}
