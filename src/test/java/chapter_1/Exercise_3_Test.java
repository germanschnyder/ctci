package test.java.chapter_1;

import main.java.chapter_1.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Exercise_3_Test {

    private Exercise_3 ex = new Exercise_3();

    @Test
    public void testURLify() {
        char[] str = "Mr John Smith    ".toCharArray();
        String result = ex.urlify(str, 13);

        assertEquals("Mr%20John%20Smith", result);
    }
}