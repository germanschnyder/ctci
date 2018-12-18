package main.java.chapter_2;

public class Exercise_3 {

    public boolean deleteNode(LinkedListNode<Integer> node) {

        if (node == null || !node.hasNext()) return false;

        node.data = node.next.data;
        node.next = node.next.next;

        return true;
    }

}
