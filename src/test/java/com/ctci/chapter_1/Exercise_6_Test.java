package com.ctci.chapter_1;

import com.ctci.common.ExerciseFactory;
import org.junit.Test;
import static org.junit.Assert.*;

public class Exercise_6_Test {

    private Exercise_6 ex = ExerciseFactory.getExerciseByName(1, 6);

    @Test
    public void testCompress() {
        String str= "aabcccccaaa";
        String result = ex.compress(str);

        assertEquals("a2b1c5a3", result);
    }

    @Test
    public void testCompressShorter() {
        String str= "abcaa";
        String result = ex.compress(str);

        assertEquals("abcaa", result);
    }

}
