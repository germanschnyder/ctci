package com.ctci.chapter_1;

import com.ctci.common.ExerciseFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise_2_Test {

    private Exercise_2 ex = ExerciseFactory.getExerciseByName(1, 2);

    @Test
    public void testPermutation() {
        String a = "teruteru";
        String b = "ruterute";
        boolean result = ex.isPermutation(a, b);

        assertTrue(result);
    }

    @Test
    public void testNotPermutation() {
        String a = "abhtyicol";
        String b = "adsf";
        boolean result = ex.isPermutation(a, b);

        assertFalse(result);
    }

}