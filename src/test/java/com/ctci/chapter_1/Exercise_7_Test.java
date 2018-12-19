package com.ctci.chapter_1;

import com.ctci.common.ExerciseFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise_7_Test {

    private Exercise_7 ex = ExerciseFactory.getExerciseByName(1, 7);

    @Test
    public void testRotate2() {
        int[][] matrix = {{1, 2}, {3, 4}};

        int[][] res = ex.rotateMatrix(matrix);

        assertEquals(matrix[0][0], res[0][1]);
        assertEquals(matrix[0][1], res[1][1]);
        assertEquals(matrix[1][0], res[0][0]);
        assertEquals(matrix[1][1], res[1][0]);
    }

    @Test
    public void testRotate3() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] res = ex.rotateMatrix(matrix);
        assertEquals(matrix[0][0], res[0][2]);
        assertEquals(matrix[0][1], res[1][2]);
        assertEquals(matrix[0][2], res[2][2]);
        assertEquals(matrix[1][0], res[0][1]);
        assertEquals(matrix[1][1], res[1][1]);
        assertEquals(matrix[1][2], res[2][1]);
        assertEquals(matrix[2][0], res[0][0]);
        assertEquals(matrix[2][1], res[1][0]);
        assertEquals(matrix[2][2], res[2][0]);
    }

    @Test
    public void testRotate2InPlace() {
        int[][] matrix = {{1, 2}, {3, 4}};
        int[][] res = {{1, 2}, {3, 4}};

        ex.rotateMatrixInPlace(res);

        assertEquals(matrix[0][0], res[0][1]);
        assertEquals(matrix[0][1], res[1][1]);
        assertEquals(matrix[1][0], res[0][0]);
        assertEquals(matrix[1][1], res[1][0]);
    }

    @Test
    public void testRotate3InPlace() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] res = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        ex.rotateMatrixInPlace(res);
        assertEquals(matrix[0][0], res[0][2]);
        assertEquals(matrix[0][1], res[1][2]);
        assertEquals(matrix[0][2], res[2][2]);
        assertEquals(matrix[1][0], res[0][1]);
        assertEquals(matrix[1][1], res[1][1]);
        assertEquals(matrix[1][2], res[2][1]);
        assertEquals(matrix[2][0], res[0][0]);
        assertEquals(matrix[2][1], res[1][0]);
        assertEquals(matrix[2][2], res[2][0]);
    }

}
