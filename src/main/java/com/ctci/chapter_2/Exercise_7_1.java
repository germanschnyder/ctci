package com.ctci.chapter_2;

import com.ctci.ds.LinkedListNode;

import java.util.HashSet;

public class Exercise_7_1 extends Chapter2_Exercise{

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