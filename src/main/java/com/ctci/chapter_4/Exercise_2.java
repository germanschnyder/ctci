package com.ctci.chapter_4;

import com.ctci.ds.BinaryTreeNode;
import com.ctci.ds.Graph;
import com.ctci.ds.GraphNode;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Exercise_2 extends Chapter4_Exercise {

    public BinaryTreeNode<Integer> buildBSTFromArray(int[] sortedArray) {

        return buildBSTFromArray(sortedArray, 0, sortedArray.length - 1);
    }

    BinaryTreeNode<Integer> buildBSTFromArray(int[] sortedArray, int start, int end) {

        if (end < start) return null;

        int midx = (start + end) / 2;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(sortedArray[midx]);
        root.left = buildBSTFromArray(sortedArray, start, midx - 1);
        root.right = buildBSTFromArray(sortedArray, midx + 1, end);

        return root;

    }
}

