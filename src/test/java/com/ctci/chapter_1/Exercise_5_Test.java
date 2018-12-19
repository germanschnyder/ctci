package com.ctci.chapter_1;

import com.ctci.common.ExerciseFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise_5_Test {

    private Exercise_5 ex = ExerciseFactory.getExerciseByName(1, 5);

    @Test
    public void testInsert() {
        boolean res = ex.areStringsOneEditDistanced("just", "ust");
        assertTrue(res);
    }

    @Test
    public void testReplace() {
        boolean res = ex.areStringsOneEditDistanced("just", "must");
        assertTrue(res);
    }

    @Test
    public void testRemove() {
        boolean res = ex.areStringsOneEditDistanced("ust", "must");
        assertTrue(res);
    }

    @Test
    public void testNone() {
        boolean res = ex.areStringsOneEditDistanced("just", "doit");
        assertFalse(res);
    }

    @Test
    public void testTwoInserts() {
        boolean res = ex.areStringsOneEditDistanced("just", "ju12st");
        assertFalse(res);
    }

    @Test
    public void testTwoReplace() {
        boolean res = ex.areStringsOneEditDistanced("just", "jurk");
        assertFalse(res);
    }
}