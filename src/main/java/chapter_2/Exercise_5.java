package main.java.chapter_2;

public class Exercise_5 {

    public LinkedListNode<Integer> sumLists(LinkedListNode<Integer> listA, LinkedListNode<Integer> listB){
        return sumWithCarry(listA, listB, 0);
    }

    LinkedListNode<Integer> sumWithCarry(LinkedListNode<Integer> listA, LinkedListNode<Integer> listB, int carry) {

        if (listA == null && listB == null && carry == 0) return null;

        int result = carry;

        LinkedListNode<Integer> listANext = null;
        LinkedListNode<Integer> listBNext = null;

        if (listA != null) {
            result += listA.data;
            listANext = listA.next;
        }
        if (listB != null){
            result += listB.data;
            listBNext = listB.next;
        }

        LinkedListNode<Integer> node = new LinkedListNode<>(result % 10);

        if (listA != null || listB != null) node.next = sumWithCarry(listANext, listBNext, result / 10);

        return node;
    }

}