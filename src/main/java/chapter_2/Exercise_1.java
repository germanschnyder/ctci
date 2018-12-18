package main.java.chapter_2;

import java.util.HashSet;
import java.util.Set;

public class Exercise_1 {

    public void removeDuplicates(LinkedListNode<Integer> list) {
        HashSet<Integer> buffer = new HashSet<>();
        LinkedListNode<Integer> prev = null;
        while (list != null) {
            if (buffer.contains(list.data)) {
                prev.next = list.next;
            } else {
                buffer.add(list.data);
                prev = list;
            }
            list = list.next;
        }
    }

    public void removeDuplicatesNoBuffer(LinkedListNode<Integer> list) {
        LinkedListNode<Integer> cur = list;
        while (cur != null) {
            LinkedListNode<Integer> runner = cur;
            while (runner.hasNext()) {
                if (runner.next.data == cur.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            cur = cur.next;
        }
    }
}
