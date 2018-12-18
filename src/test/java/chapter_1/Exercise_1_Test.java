package test.java.chapter_1;

import main.java.chapter_1.Exercise_1;
import org.junit.Test;
import static org.junit.Assert.*;

public class Exercise_1_Test {

    private Exercise_1 ex = new Exercise_1();

    @Test
    public void testUnique() {
        String str= "abhtyicol";
        boolean result = ex.allUniqueCharacters(str);

        assertTrue(result);
    }

    @Test
    public void testUniqueFalse() {
        String str= "aabcccccaaa";
        boolean result = ex.allUniqueCharacters(str);

        assertFalse(result);
    }

    @Test
    public void testUnique2() {
        String str= "abhtyicol";
        boolean result = ex.allUniqueCharacters2(str);

        assertTrue(result);
    }

    @Test
    public void testUnique2False() {
        String str= "aabcccccaaa";
        boolean result = ex.allUniqueCharacters2(str);

        assertFalse(result);
    }

}