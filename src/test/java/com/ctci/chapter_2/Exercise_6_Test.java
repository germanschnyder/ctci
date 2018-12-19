package com.ctci.chapter_2;

import com.ctci.common.ExerciseFactory;
import com.ctci.ds.LinkedListNode;
import org.junit.Test;

public class Exercise_6_Test {

    private Exercise_6 ex = ExerciseFactory.getExerciseByName(2, 6);

    @Test
    public void testListIsPalindromeOdd() {

        int[] data = {2, 3, 2};
        LinkedListNode<Integer> list = LinkedListNode.buildIntegerList(data);

        boolean res = ex.isListPalindrome(list);

        assert res;
    }


    @Test
    public void testListIsPalindromeEven() {

        int[] data = {2, 3, 3, 2};
        LinkedListNode<Integer> list = LinkedListNode.buildIntegerList(data);

        boolean res = ex.isListPalindrome(list);

        assert res;
    }

    @Test
    public void testListIsNotPalindrome() {

        int[] data = {2, 3, 2, 4};
        LinkedListNode<Integer> list = LinkedListNode.buildIntegerList(data);

        boolean res = ex.isListPalindrome(list);

        assert !res;
    }
}