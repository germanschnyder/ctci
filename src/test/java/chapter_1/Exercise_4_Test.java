package test.java.chapter_1;

import main.java.chapter_1.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise_4_Test {

    private Exercise_4 ex = new Exercise_4();

    @Test
    public void testPermutation() {
        boolean res = ex.isPermutationOfAPalindrom("tupactupac");
        assertEquals(true, res);
    }

    @Test
    public void testNotPermutation() {

        boolean res = ex.isPermutationOfAPalindrom("definitelyisnot");
        assertEquals(false, res);
    }
}