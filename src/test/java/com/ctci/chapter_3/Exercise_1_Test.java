package com.ctci.chapter_3;

import com.ctci.common.ExerciseFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise_1_Test {

    private Exercise_1_1 ex = ExerciseFactory.getExerciseByName(3, 1, 1);

    @Test
    public void testPushAndPeek() {

        Exercise_1_1.MultiStack stack = ex.new MultiStack(5, 3);

        try {
            assertEquals(-1, stack.peek(1));

            stack.push(0, 1);
            stack.push(1, 2);
            stack.push(2, 3);

            assertEquals(1, stack.peek(0));
            assertEquals(2, stack.peek(1) );
            assertEquals(3, stack.peek(2));

            stack.push(0, 2);
            stack.push(1, 3);
            stack.push(2, 4);

            assertEquals(2, stack.peek(0));
            assertEquals(3, stack.peek(1) );
            assertEquals(4, stack.peek(2));

        } catch (Exception ex) {
            Assert.fail(ex.getMessage());
        }

    }

    @Test
    public void testPushAndPop() {

        Exercise_1_1.MultiStack stack = ex.new MultiStack(5, 3);

        try {
            assertEquals(-1, stack.peek(1));

            stack.push(0, 1);
            stack.push(1, 2);
            stack.push(2, 3);

            assertEquals(1, stack.pop(0));
            assertEquals(2, stack.pop(1) );
            assertEquals(3, stack.pop(2));

            stack.push(0, 2);
            stack.push(1, 4);
            stack.push(1, 5);

            assertEquals(2, stack.pop(0));
            assertEquals(5, stack.pop(1) );
            assertEquals(4, stack.pop(1));
            assertEquals(-1, stack.pop(2));

        } catch (Exception ex) {
            Assert.fail(ex.getMessage());
        }
    }



}