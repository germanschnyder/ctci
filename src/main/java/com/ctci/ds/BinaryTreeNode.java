package com.ctci.ds;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeNode<T> {
    public T data;
    public BinaryTreeNode<T> left, right;

    public BinaryTreeNode(T value) {
        data = value;
    }

    public static int depthOfTree(BinaryTreeNode root, int d) {
        if (root == null) {
            return d;
        }
        int left = d;
        int right = d;
        if (root.left != null) {
            left = depthOfTree(root.left, d + 1);
        }
        if (root.right != null) {
            right = depthOfTree(root.right, d + 1);
        }
        return Math.max(left, right);
    }

    public static void printLevelOrder(BinaryTreeNode root, int depth) {
        if (root == null)
            return;

        Queue<BinaryTreeNode> q = new LinkedList<>();

        q.add(root);
        while (true) {
            int nodeCount = q.size();
            if (nodeCount == 0)
                break;
            for (int i = 0; i < depth; i++) {
                System.out.print("..-");
            }
            while (nodeCount > 0) {
                BinaryTreeNode node = q.peek();
                if (node == null)
                    System.out.print("NIL");
                else
                    System.out.print("(" + node.data + ")");

                q.remove();

                if (node != null) {
                    //if (node.left != null)
                    q.add(node.left);
                    //if (node.right != null)
                    q.add(node.right);
                }

                if (nodeCount > 1) {

                    System.out.print("___");
                }
                nodeCount--;
            }
            depth--;
            System.out.println();
        }
    }
}
