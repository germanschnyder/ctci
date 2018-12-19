package test.java.chapter_2;

import main.java.chapter_2.ExerciseFactory;
import main.java.chapter_2.Exercise_7;
import main.java.ds.LinkedListNode;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise_7_Test {

    private Exercise_7 ex = ExerciseFactory.getExerciseByName(7, 1);
    private Exercise_7 exv2 = ExerciseFactory.getExerciseByName(7, 2);

    @Test
    public void testIntersectWithSet() {

        int[] dataA = {1, 2, 3, 4, 5};
        LinkedListNode<Integer> listA = LinkedListNode.buildIntegerList(dataA);
        LinkedListNode<Integer> finder = listA.next.next; // stop on 3

        int[] dataB = {1, 2, 3};
        LinkedListNode<Integer> listB = LinkedListNode.buildIntegerList(dataB);

        LinkedListNode<Integer> joiner = listB;
        while (joiner.hasNext()) joiner = joiner.next;

        joiner.next = finder;

        LinkedListNode<Integer> result = ex.listIntersection(listA, listB);

        assertEquals("3->4->5->NULL", LinkedListNode.toStringRepresentation(result));

    }

    @Test
    public void testDoesntIntersectWithSet() {

        int[] dataA = {1, 2, 3, 4, 5};
        LinkedListNode<Integer> listA = LinkedListNode.buildIntegerList(dataA);

        int[] dataB = {1, 2, 3};
        LinkedListNode<Integer> listB = LinkedListNode.buildIntegerList(dataB);

        LinkedListNode<Integer> result = ex.listIntersection(listA, listB);

        assertEquals("NULL", LinkedListNode.toStringRepresentation(result));

    }


    @Test
    public void testIntersectFromTail() {

        int[] dataA = {1, 2, 3, 4, 5, 6};
        LinkedListNode<Integer> listA = LinkedListNode.buildIntegerList(dataA);
        LinkedListNode<Integer> finder = listA.next.next; // stop on 3

        int[] dataB = {1, 2, 3};
        LinkedListNode<Integer> listB = LinkedListNode.buildIntegerList(dataB);

        LinkedListNode<Integer> joiner = listB;
        while (joiner.hasNext()) joiner = joiner.next;

        joiner.next = finder;

        LinkedListNode<Integer> result = exv2.listIntersection(listA, listB);

        assertEquals("3->4->5->6->NULL", LinkedListNode.toStringRepresentation(result));

    }

    @Test
    public void testDoesntIntersectFromTail() {

        int[] dataA = {1, 2, 3, 4, 5, 6};
        LinkedListNode<Integer> listA = LinkedListNode.buildIntegerList(dataA);

        int[] dataB = {1, 2, 3};
        LinkedListNode<Integer> listB = LinkedListNode.buildIntegerList(dataB);

        LinkedListNode<Integer> result = exv2.listIntersection(listA, listB);

        assertEquals("NULL", LinkedListNode.toStringRepresentation(result));

    }
}