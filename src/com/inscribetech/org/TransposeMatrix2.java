package com.inscribetech.org;

public class TransposeMatrix2 {
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposeMatrix = new int[cols][rows];

        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                transposeMatrix[col][row] = matrix[row][col];
            }
        }

        return transposeMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] transposedMatrix = transposeMatrix(matrix);

        // Print the transposed matrix
        for (int[] row : transposedMatrix) {
        	System.out.println(row);
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}