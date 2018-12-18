package test.java.chapter_2;

import main.java.chapter_2.Exercise_1;
import main.java.chapter_2.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercise_1_Test {

    private Exercise_1 ex = new Exercise_1();

    @Test
    public void testNoDuplicates() {
        LinkedListNode<Integer> list = new LinkedListNode<>(0);
        ex.removeDuplicates(list);

        assertTrue(list.next == null);
    }

    @Test
    public void testOneDuplicate() {
        int[] data = {2, 3, 2, 4, 5};
        LinkedListNode<Integer> list = LinkedListNode.buildIntegerList(data);

        ex.removeDuplicates(list);

        assertEquals("2->3->4->5->NULL", LinkedListNode.toStringRepresentation(list));

    }

    @Test
    public void testTwoDuplicate() {
        int[] data = {2, 3, 2, 4, 2, 5};
        LinkedListNode<Integer> list = LinkedListNode.buildIntegerList(data);

        ex.removeDuplicates(list);

        assertEquals("2->3->4->5->NULL", LinkedListNode.toStringRepresentation(list));

    }

    @Test
    public void testNoDuplicatesNoBuffer() {
        LinkedListNode<Integer> list = new LinkedListNode<>(0);
        ex.removeDuplicatesNoBuffer(list);

        assertTrue(list.next == null);
    }

    @Test
    public void testOneDuplicateNoBuffer() {
        int[] data = {2, 3, 2, 4, 5};
        LinkedListNode<Integer> list = LinkedListNode.buildIntegerList(data);

        ex.removeDuplicatesNoBuffer(list);

        assertEquals("2->3->4->5->NULL", LinkedListNode.toStringRepresentation(list));

    }

    @Test
    public void testTwoDuplicateNoBuffer() {
        int[] data = {2, 3, 2, 4, 2, 5};
        LinkedListNode<Integer> list = LinkedListNode.buildIntegerList(data);

        ex.removeDuplicatesNoBuffer(list);

        assertEquals("2->3->4->5->NULL", LinkedListNode.toStringRepresentation(list));

    }

}