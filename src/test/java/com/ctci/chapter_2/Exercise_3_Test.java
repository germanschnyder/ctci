package com.ctci.chapter_2;

import com.ctci.common.ExerciseFactory;
import com.ctci.ds.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise_3_Test {

    private Exercise_3 ex = ExerciseFactory.getExerciseByName(2, 3);

    @Test
    public void testDeleteMiddle() {
        int[] data = {2, 3, 2, 4, 5, 14, 5, 27, 22, 5, 6, 7};
        LinkedListNode<Integer> list = LinkedListNode.buildIntegerList(data);

        LinkedListNode node = list.next.next; // delete 2
        boolean result = ex.deleteNode(node);
        assertEquals(true, result);
        assertEquals("2->3->4->5->14->5->27->22->5->6->7->NULL", LinkedListNode.toStringRepresentation(list));

        node = list.next.next;
        result = ex.deleteNode(node); // delete 4
        assertEquals(true, result);
        assertEquals("2->3->5->14->5->27->22->5->6->7->NULL", LinkedListNode.toStringRepresentation(list));

        while (node.hasNext()) node = node.next;
        result = ex.deleteNode(node); // delete first should fail
        assertEquals(false, result);

    }
}