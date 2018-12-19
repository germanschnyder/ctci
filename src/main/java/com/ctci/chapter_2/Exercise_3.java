package com.ctci.chapter_2;

import com.ctci.ds.LinkedListNode;

public class Exercise_3 extends Chapter2_Exercise{

    public boolean deleteNode(LinkedListNode<Integer> node) {

        if (node == null || !node.hasNext()) return false;

        node.data = node.next.data;
        node.next = node.next.next;

        return true;
    }

}
