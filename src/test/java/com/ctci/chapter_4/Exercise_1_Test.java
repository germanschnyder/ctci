package com.ctci.chapter_4;

import com.ctci.chapter_4.Exercise_1;
import com.ctci.common.ExerciseFactory;
import com.ctci.ds.Graph;
import com.ctci.ds.GraphNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise_1_Test {

    private Exercise_1 ex = ExerciseFactory.getExerciseByName(4, 1);

    Graph graph;

    @Before
    public void init(){
        graph = new Graph();
        GraphNode nodeA = new GraphNode(1);
        GraphNode nodeB = new GraphNode(2);
        GraphNode nodeC = new GraphNode(3);

        nodeA.addAdjacent(nodeB);

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
    }

    @Test
    public void testSameNode(){
        GraphNode nodeA = graph.getNodes().get(0);
        boolean result = ex.existsPath(graph,nodeA, nodeA);
        Assert.assertTrue(result);

    }


    @Test
    public void testPath(){
        GraphNode nodeA = graph.getNodes().get(0);
        GraphNode nodeB = graph.getNodes().get(0);
        boolean result = ex.existsPath(graph, nodeA, nodeB);
        Assert.assertTrue(result);
    }

    @Test
    public void testNoPath(){
        GraphNode nodeA = graph.getNodes().get(0);
        GraphNode nodeC = graph.getNodes().get(2);
        boolean result = ex.existsPath(graph, nodeA, nodeC);
        Assert.assertFalse(result);

    }


}