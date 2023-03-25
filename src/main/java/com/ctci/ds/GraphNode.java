package com.ctci.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GraphNode {
    int val;
    ArrayList<GraphNode> adjacents;

    public GraphNode(int name) {
        adjacents = new ArrayList<>();
        val = name;
    }

    public List<GraphNode> getAdjacents(){ return adjacents;}
    public void addAdjacent(GraphNode node){ adjacents.add(node);}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GraphNode graphNode = (GraphNode) o;
        return val == graphNode.val;
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }
}
