package com.problems.graph;

public class GraphDriver {

	public static void main(String[] args)
	{
		BFSGraph g=new BFSGraph();
		g.addVertex('A');
		g.addVertex('B');
		g.addVertex('C');
		g.addVertex('D');
		g.addVertex('E');
		g.addVertex('F');
		g.addVertex('G');
		g.addVertex('H');
	
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(1, 7);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(7, 4);
		g.addEdge(4, 5);
		g.addEdge(4, 6);
		g.bfs();
	}
	
}
