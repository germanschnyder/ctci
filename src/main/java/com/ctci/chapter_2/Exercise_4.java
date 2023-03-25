package com.ctci.chapter_2;

import com.ctci.ds.LinkedListNode;

public class Exercise_4 extends Chapter2_Exercise {

    public LinkedListNode<Integer> partition(LinkedListNode<Integer> node, int x) {
        LinkedListNode<Integer> lowerStart = null;
        LinkedListNode<Integer> lowerEnd = null;
        LinkedListNode<Integer> greaterStart = null;
        LinkedListNode<Integer> greaterEnd = null;

        while (node != null) {
            LinkedListNode<Integer> next = node.next;
            node.next = null;
            if (node.data < x) { // elem is lower than x
                if (lowerStart == null) {
                    lowerStart = node;
                    lowerEnd = lowerStart;
                } else {
                    lowerEnd.next = node;
                    lowerEnd = node;
                }
            } else { // elem is greater than or equal to x
                if (greaterStart == null) {
                    greaterStart = node;
                    greaterEnd = greaterStart;
                } else {
                    greaterEnd.next = node;
                    greaterEnd = node;
                }

            }

            node = next;
        }

        if (lowerStart == null) return greaterStart;


        lowerEnd.next = greaterStart;
        return lowerStart;

    }
}