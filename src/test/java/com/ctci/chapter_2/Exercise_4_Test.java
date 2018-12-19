package com.ctci.chapter_2;

import com.ctci.common.ExerciseFactory;
import com.ctci.ds.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise_4_Test {

    private Exercise_4 ex = ExerciseFactory.getExerciseByName(2, 4);

    @Test
    public void testPartition() {
        int[] data = {2, 3, 2, 4, 5, 14, 5, 27, 22, 5, 6, 7};
        LinkedListNode<Integer> list = LinkedListNode.buildIntegerList(data);

        LinkedListNode<Integer> result = ex.partition(list, 5);
        assertEquals("2->3->2->4->5->14->5->27->22->5->6->7->NULL", LinkedListNode.toStringRepresentation(result));

        result = ex.partition(list, 3);
        assertEquals("2->2->3->4->5->14->5->27->22->5->6->7->NULL", LinkedListNode.toStringRepresentation(result));
    }
}