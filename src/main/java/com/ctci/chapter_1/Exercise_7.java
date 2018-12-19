package com.ctci.chapter_1;

public class Exercise_7 extends Chapter1_Exercise {

    public int[][] rotateMatrix(int[][] matrix) {

        int n = matrix.length;
        int[][] newMatrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                newMatrix[col][n - 1 - row] = matrix[row][col];
            }
        }

        return newMatrix;
    }


    public void rotateMatrixInPlace(int[][] matrix) {

        int n = matrix.length;

        for (int layer = 0; layer < n / 2; layer++) {
            int last = n - 1 - layer;

            //ith element from row goes to ith element from column
            //and viceversa, while rotating.
            for (int i = layer; i < last; i++) {
                int offset = i - layer; // current position in layer
                int top = matrix[layer][i];

                matrix[layer][i] = matrix[last - offset][layer];
                matrix[last - offset][layer] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }

    }
}