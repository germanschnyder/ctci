package test.java.chapter_1;

import main.java.chapter_1.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise_5_Test {

    private Exercise_5 ex = new Exercise_5();

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