package main.java.chapter_2;

import main.java.ds.LinkedListNode;

public class Exercise_2 extends Chapter2_Exercise {

    public int kthToLast(LinkedListNode<Integer> list, int k) {
        int count = 0;
        LinkedListNode runner = list;
        while (runner.hasNext() && count < k) {
            runner = runner.next;
            count++;
        }

        if (count != k) throw new IllegalArgumentException("K is too big");

        while (runner.hasNext()) {
            runner = runner.next;
            list = list.next;
        }

        return list.data;
    }
}