package com.ctci.ds;

public class LinkedListNode<T> {
    public T data;
    public LinkedListNode<T> next;

    public LinkedListNode(T val) {
        data = val;
        next = null;
    }

    public boolean hasNext() {
        return next != null;
    }

    public static LinkedListNode<Integer> buildIntegerList(int[] a) {
        if (a == null || a.length == 0) return null;
        LinkedListNode n = new LinkedListNode(a[0]);
        LinkedListNode head = n;
        for (int i = 1; i < a.length; ++i) {
            n.next = new LinkedListNode(a[i]);
            n = n.next;
        }
        return head;
    }

    public static String toStringRepresentation(LinkedListNode n) {
        int i = 0;
        StringBuilder str = new StringBuilder();
        while (n != null) {
            str.append(n.data).append("->");
            n = n.next;
        }
        str.append("NULL");

        return str.toString();
    }
}
