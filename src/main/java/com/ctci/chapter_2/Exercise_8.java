package com.ctci.chapter_2;

import com.ctci.ds.LinkedListNode;

import java.util.HashSet;

public abstract class Exercise_8 extends Chapter2_Exercise{

    public abstract LinkedListNode<Integer> findLoopStartingNode(LinkedListNode<Integer> list);
}


class Exercise_8_1 extends Exercise_8 {
    @Override
    public LinkedListNode<Integer> findLoopStartingNode(LinkedListNode<Integer> list) {
       HashSet set = new HashSet();

       LinkedListNode runner = list;
       while (runner!=null && !set.contains(runner)) {
           set.add(runner);
           runner = runner.next;
       }

       return runner;
    }
}

class Exercise_8_2 extends Exercise_8 {
    @Override
    public LinkedListNode<Integer> findLoopStartingNode(LinkedListNode<Integer> list) {

        LinkedListNode slow = list;
        LinkedListNode fast = list;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) // they have met
                break;
        }

        if (fast == null || fast.next == null)
            return null;

        slow = list;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}