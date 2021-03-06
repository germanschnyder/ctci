package com.ctci.chapter_2;

import com.ctci.common.ExerciseFactory;
import com.ctci.ds.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise_2_Test {

    private Exercise_2 ex = ExerciseFactory.getExerciseByName(2, 2);

    @Test
    public void testKthToLast() {
        int[] data = {2, 3, 2, 4, 5, 14, 5, 27, 22, 5, 6, 7};
        LinkedListNode<Integer> list = LinkedListNode.buildIntegerList(data);

        for (int idx = 0; idx < data.length; idx++) {
            int kth = ex.kthToLast(list, idx);
            int expected = data[data.length - 1 - idx];
            assertEquals(String.format("Expecting %d, got %d", expected, kth), expected, kth);
        }
    }
}