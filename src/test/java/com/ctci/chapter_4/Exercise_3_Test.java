package com.ctci.chapter_4;

import com.ctci.common.ExerciseFactory;
import com.ctci.ds.BinaryTreeNode;
import com.ctci.ds.Graph;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Exercise_3_Test {

    private Exercise_3 ex = ExerciseFactory.getExerciseByName(4, 3);

    BinaryTreeNode<Integer> root;

    @Before
    public void init() {

        root = new BinaryTreeNode<>(0);
        root.left = new BinaryTreeNode<>(1);
        root.right = new BinaryTreeNode<>(2);
    }

    @Test
    public void testOneLevel() {
        ArrayList<List<Integer>> lists = ex.buildLevelLists(root);

        Assert.assertEquals(2, lists.size());
    }

    @Test
    public void testTwoLevel() {
        root.left.left = new BinaryTreeNode<>(3);
        root.left.right = new BinaryTreeNode<>(4);
        root.right.right = new BinaryTreeNode<>(6);


        ArrayList<List<Integer>> lists = ex.buildLevelLists(root);

        Assert.assertEquals(3, lists.size());
        Assert.assertArrayEquals(lists.get(0).toArray(), new Integer[]{0});
        Assert.assertArrayEquals(lists.get(1).toArray(), new Integer[]{1, 2});
        Assert.assertArrayEquals(lists.get(2).toArray(), new Integer[]{3, 4, 6});
    }

}