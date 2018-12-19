package com.ctci.chapter_2;

import com.ctci.ds.LinkedListNode;

import java.util.HashSet;

public class Exercise_8_1 extends Chapter2_Exercise {

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
