package test.java.chapter_1;

import main.java.chapter_1.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise_2_Test {

    private Exercise_2 ex = new Exercise_2();

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