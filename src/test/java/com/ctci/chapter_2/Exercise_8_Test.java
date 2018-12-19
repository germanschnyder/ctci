package com.ctci.chapter_2;

import com.ctci.ds.LinkedListNode;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class Exercise_8_Test {

    private Exercise_8 ex = ExerciseFactory.getExerciseByName(8, 1);
    private Exercise_8 exv2 = ExerciseFactory.getExerciseByName(8, 2);

    @Test
    public void testFindLoop() {

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

        int[] dataA = {1, 2, 3, 4, 5};
        LinkedListNode<Integer> list = LinkedListNode.buildIntegerList(dataA);

        assertEquals(null, ex.findLoopStartingNode(list));

    }

    @Test
    public void testFindLoopV2() {

        int[] dataA = {1, 2, 3, 4, 5, 6};
        LinkedListNode<Integer> list = LinkedListNode.buildIntegerList(dataA);
        LinkedListNode<Integer> loopStart = list.next.next; //start at 3

        LinkedListNode<Integer> runner = list;
        while (runner.hasNext()) runner = runner.next;

        runner.next = loopStart;

        assertEquals(loopStart, exv2.findLoopStartingNode(list));
    }

    @Test
    public void testNoLoopV2() {

        int[] dataA = {1, 2, 3, 4, 5, 6};
        LinkedListNode<Integer> list = LinkedListNode.buildIntegerList(dataA);

        assertEquals(null, exv2.findLoopStartingNode(list));

    }
}