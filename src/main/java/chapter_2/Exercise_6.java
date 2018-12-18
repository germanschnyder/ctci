package main.java.chapter_2;

import main.java.ds.LinkedListNode;

public class Exercise_6 extends Chapter2_Exercise{

    public boolean isListPalindrome(LinkedListNode<Integer> list) {

        if (list == null || !list.hasNext()) return true;
        else return areEqual(list, reverse(list));
    }

    private boolean areEqual(LinkedListNode<Integer> list, LinkedListNode<Integer> other) {

        while (list != null && other != null) {
            if (list.data != other.data)
                return false;
            list = list.next;
            other = other.next;
        }

        return list == null && other == null;
    }

    private LinkedListNode<Integer> reverse(LinkedListNode<Integer> list) {
        LinkedListNode<Integer> head = new LinkedListNode<>(list.data);
        while (list.hasNext()){
            list = list.next;
            LinkedListNode<Integer> prev = new LinkedListNode<>(list.data);
            prev.next = head;
            head = prev;
        }

        return head;
    }
}