package com.ctci.ds;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;




public class Graph {

    List<GraphNode> nodes;

    public Graph() {
        nodes = new ArrayList<>();
    }

    public List<GraphNode> getNodes() {
        return nodes;
    }

    public void addNode(GraphNode node) {
        nodes.add(node);
    }
}