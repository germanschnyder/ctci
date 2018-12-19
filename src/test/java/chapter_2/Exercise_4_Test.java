package test.java.chapter_2;

import main.java.chapter_2.ExerciseFactory;
import main.java.chapter_2.Exercise_4;
import main.java.ds.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise_4_Test {

    private Exercise_4 ex = ExerciseFactory.getExerciseByName(4);

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