package com.ctci.chapter_4;

import com.ctci.common.ExerciseFactory;
import com.ctci.ds.BinaryTreeNode;
import com.ctci.ds.Graph;
import com.ctci.ds.GraphNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class TreePrint_Test {



    @Test
    public void printTree(){

        BinaryTreeNode<Integer> tree = new BinaryTreeNode<>(1);
        tree.left = new BinaryTreeNode<>(0);
        tree.right = new BinaryTreeNode<>(2);

        tree.left.left = new BinaryTreeNode<>(3);
        tree.left.right = new BinaryTreeNode<>(4);

        tree.right.left = new BinaryTreeNode<>(5);
        tree.right.right = new BinaryTreeNode<>(6);


        BinaryTreeNode.printLevelOrder(tree, BinaryTreeNode.depthOfTree(tree, 1));
    }

}