package com.ctci.chapter_2;

import com.ctci.ds.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise_5_Test {

    private Exercise_5 ex = ExerciseFactory.getExerciseByName(5);

    @Test
    public void testSumLists() {
        int[] dataA = {2, 3, 2};
        LinkedListNode<Integer> listA = LinkedListNode.buildIntegerList(dataA);

        int[] dataB = {2, 3, 2};
        LinkedListNode<Integer> listB = LinkedListNode.buildIntegerList(dataB);

        LinkedListNode<Integer> sum = ex.sumLists(listA, listB);

        assertEquals("4->6->4->NULL", LinkedListNode.toStringRepresentation(sum));

    }

    @Test
    public void testSumListsWithCarry() {
        int[] dataA = {2, 3, 2};
        LinkedListNode<Integer> listA = LinkedListNode.buildIntegerList(dataA);

        int[] dataB = {2, 3, 8};
        LinkedListNode<Integer> listB = LinkedListNode.buildIntegerList(dataB);

        LinkedListNode<Integer> sum = ex.sumLists(listA, listB);

        assertEquals("4->6->0->1->NULL", LinkedListNode.toStringRepresentation(sum));

    }

    @Test
    public void testSumListsDifferentLength() {
        int[] dataA = {2, 3, 2};
        LinkedListNode<Integer> listA = LinkedListNode.buildIntegerList(dataA);

        int[] dataB = {2, 3, 8, 9, 9, 1};
        LinkedListNode<Integer> listB = LinkedListNode.buildIntegerList(dataB);

        LinkedListNode<Integer> sum = ex.sumLists(listA, listB);

        assertEquals("4->6->0->0->0->2->NULL", LinkedListNode.toStringRepresentation(sum));

    }

}