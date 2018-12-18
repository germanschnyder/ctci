package test.java.chapter_1;

import main.java.chapter_1.Exercise_6;
import org.junit.Test;
import static org.junit.Assert.*;

public class Exercise_6_Test {

    private Exercise_6 ex = new Exercise_6();

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
