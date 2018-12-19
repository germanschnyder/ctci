package com.ctci.chapter_2;

import com.ctci.ds.LinkedListNode;

public class Exercise_7_2 extends Chapter2_Exercise{

    class TailResult {
        LinkedListNode node;
        int length;

        TailResult(LinkedListNode n, int l) {
            node = n;
            length = l;
        }
    }

    public LinkedListNode<Integer> listIntersection(LinkedListNode<Integer> listA, LinkedListNode<Integer> listB) {

        if (listA == null || listB == null) return null;

        TailResult rA = getTailAndLength(listA);
        TailResult rB = getTailAndLength(listB);

        if (rA.node != rB.node) return null; //if tails are not the same there is no intersection
        int diff = Math.abs(rA.length - rB.length);

        if (rA.length > rB.length) {
            for (int i = 0; i < diff; i++) {
                listA = listA.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                listB = listB.next;
            }
        }

        while (listA != listB) {
            listA = listA.next;
            listB = listB.next;
        }

        return listA;
    }

    private TailResult getTailAndLength(LinkedListNode<Integer> list) {
        int length = 0;
        while (list.hasNext()) {
            list = list.next;
            length++;
        }

        return new TailResult(list, length);
    }
}
