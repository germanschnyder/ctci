package com.ctci.chapter_4;

import com.ctci.common.ExerciseFactory;
import com.ctci.ds.BinaryTreeNode;
import com.ctci.ds.Graph;
import com.ctci.ds.GraphNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Exercise_2_Test {

    private Exercise_2 ex = ExerciseFactory.getExerciseByName(4, 2);

    Graph graph;

    @Before
    public void init() {

    }

    @Test
    public void testBuildSingle() {
        int[] sortedArray = new int[]{0};
        BinaryTreeNode<Integer> result = ex.buildBSTFromArray(sortedArray);
        BinaryTreeNode.printLevelOrder(result, BinaryTreeNode.depthOfTree(result, 1));
    }

    @Test
    public void testBuildSimple() {
        int[] sortedArray = new int[]{0, 1, 2};
        BinaryTreeNode<Integer> result = ex.buildBSTFromArray(sortedArray);
        BinaryTreeNode.printLevelOrder(result, BinaryTreeNode.depthOfTree(result, 1));
    }

    @Test
    public void testBuild() {
        int[] sortedArray = new int[]{0, 1, 2, 3, 4};
        BinaryTreeNode<Integer> result = ex.buildBSTFromArray(sortedArray);
        BinaryTreeNode.printLevelOrder(result, BinaryTreeNode.depthOfTree(result, 1));
    }
}