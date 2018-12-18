package main.java.chapter_2;

public class Exercise_4 {

    public LinkedListNode<Integer> partition(LinkedListNode<Integer> node, int x) {
        LinkedListNode<Integer> lowerStart = null;
        LinkedListNode<Integer> lowerEnd = null;
        LinkedListNode<Integer> greaterStart = null;
        LinkedListNode<Integer> greaterEnd = null;

        while (node.hasNext()) {
            LinkedListNode<Integer> next = node.next;
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

            node = node.next;
        }

        if (lowerEnd != null) {
            lowerEnd.next = greaterStart;
            return lowerStart;
        } else {
            return greaterStart;
        }
    }
}