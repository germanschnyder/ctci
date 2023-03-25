package com.ctci.chapter_4;

import com.ctci.ds.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercise_3 extends Chapter4_Exercise {

    public ArrayList<List<Integer>> buildLevelLists(BinaryTreeNode<Integer> root) {

        ArrayList<List<Integer>> lists = new ArrayList<>();

        buildLevelLists(root, lists, 0);

        return lists;
    }

    private void buildLevelLists(BinaryTreeNode<Integer> node, ArrayList<List<Integer>> lists, int level) {
        if (node == null) return;

        if (lists.size() == level) lists.add(new LinkedList<>());

        List<Integer> levelList = lists.get(level);
        levelList.add(node.data);

        buildLevelLists(node.left, lists, level + 1);
        buildLevelLists(node.right, lists, level + 1);

    }
}

