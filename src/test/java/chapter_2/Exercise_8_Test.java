package test.java.chapter_2;

import main.java.chapter_2.ExerciseFactory;
import main.java.chapter_2.Exercise_8;
import main.java.ds.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise_8_Test {

    private ExerciseFactory factory = new ExerciseFactory();

    @Test
    public void testFindLoop() {

        Exercise_8 ex = (Exercise_8) factory.getExercise(8, "");

        int[] dataA = {1, 2, 3, 4, 5};
        LinkedListNode<Integer> list = LinkedListNode.buildIntegerList(dataA);
        LinkedListNode<Integer> loopStart = list.next.next; //start at 3

        LinkedListNode<Integer> runner = list;
        while (runner.hasNext()) runner = runner.next;

        runner.next = loopStart;

        assertEquals(loopStart, ex.findLoopStartingNode(list));

    }

    @Test
    public void testNoLoop() {

        Exercise_8 ex = (Exercise_8) factory.getExercise(8, "");

        int[] dataA = {1, 2, 3, 4, 5};
        LinkedListNode<Integer> list = LinkedListNode.buildIntegerList(dataA);

        assertEquals(null, ex.findLoopStartingNode(list));

    }

    @Test
    public void testFindLoopV2() {

        Exercise_8 ex = (Exercise_8) factory.getExercise(8, "FindLoopWithRunners");

        int[] dataA = {1, 2, 3, 4, 5};
        LinkedListNode<Integer> list = LinkedListNode.buildIntegerList(dataA);
        LinkedListNode<Integer> loopStart = list.next.next; //start at 3

        LinkedListNode<Integer> runner = list;
        while (runner.hasNext()) runner = runner.next;

        runner.next = loopStart;

        assertEquals(loopStart, ex.findLoopStartingNode(list));

    }

    @Test
    public void testNoLoopV2() {

        Exercise_8 ex = (Exercise_8) factory.getExercise(8, "FindLoopWithRunners");

        int[] dataA = {1, 2, 3, 4, 5};
        LinkedListNode<Integer> list = LinkedListNode.buildIntegerList(dataA);

        assertEquals(null, ex.findLoopStartingNode(list));

    }
}