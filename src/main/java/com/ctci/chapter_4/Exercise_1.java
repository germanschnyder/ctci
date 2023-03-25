package com.ctci.chapter_4;

import com.ctci.ds.Graph;
import com.ctci.ds.GraphNode;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Exercise_1 extends Chapter4_Exercise {
    boolean existsPath(Graph graph, GraphNode nodeA, GraphNode nodeB) {

        if (nodeA.equals(nodeB)) return true;

        Set<GraphNode> visited = new HashSet<>();

        visited.add(nodeA);
        Queue<GraphNode> toVisit = new ArrayDeque<>(nodeA.getAdjacents());

        while (!toVisit.isEmpty()) {
            GraphNode cur = toVisit.poll();
            visited.add(cur);
            if (cur == nodeB) return true;

            for (GraphNode neighbor : cur.getAdjacents()) {
                if (!visited.contains(neighbor)) toVisit.add(neighbor);
            }
        }

        return false;

    }
}
