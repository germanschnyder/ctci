package main.java.chapter_2;

import main.java.ds.LinkedListNode;

import java.util.HashSet;

public abstract class Exercise_7 extends Chapter2_Exercise {

    public abstract LinkedListNode<Integer> listIntersection(LinkedListNode<Integer> listA, LinkedListNode<Integer> listB);
}


class Exercise_7_1 extends Exercise_7 {

    @Override
    public LinkedListNode<Integer> listIntersection(LinkedListNode<Integer> listA, LinkedListNode<Integer> listB) {
        HashSet set = new HashSet();
        while (listA.hasNext()) {
            set.add(listA);
            listA = listA.next;
        }
        while (listB.hasNext()) {
            if (set.contains(listB))
                return listB;
            else
                listB = listB.next;
        }

        return null;
    }
}

class TailResult {
    LinkedListNode node;
    int length;

    TailResult(LinkedListNode n, int l) {
        node = n;
        length = l;
    }
}

class Exercise_7_2 extends Exercise_7 {

    @Override
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