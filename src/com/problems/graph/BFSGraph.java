package com.problems.graph;

import java.awt.DisplayMode;
import java.util.Iterator;
import java.util.LinkedList;




public class BFSGraph {

	int maxsize;
	Vertex vertexlist[];
	int matrixlist[][];
	int vertexcount;
	@SuppressWarnings({ "rawtypes", "unused" })
	LinkedList queue;
	
	public BFSGraph()
	{
		maxsize=20;
		matrixlist=new int[maxsize][maxsize];
		vertexlist=new Vertex[maxsize];
		for(int i=0;i<maxsize;i++)
		{
			for(int j=0;j<maxsize;j++)
			{
				matrixlist[i][j]=0;
			}
		}
		queue= new LinkedList();
		
	}
	
	public void addVertex(char label)
	{
		vertexlist[vertexcount++]=new Vertex(label);
	}
	public void addEdge(int i,int j)
	{
		matrixlist[i][j]=1;
		matrixlist[j][i]=1;
	}
	
	public void displayVertex(int v)
	{
		System.out.println(vertexlist[v].label);
	}
	
	public int adjVertex(int v)
	{
		for(int i=0;i<maxsize;i++)
		{
			if(matrixlist[v][i]==1 && vertexlist[i].visited==false )
				return i;
		}
		return -1;
	}
	
	public void bfs()
	{
		System.out.println("in bfs");
		vertexlist[0].visited=true;
		displayVertex(0);
		queue.add(0);
		int v2;
		while(!queue.isEmpty())
		{
			int v1=(Integer) queue.remove();
			System.out.println("removed"+v1);
			while( (v2=adjVertex(v1))!=-1)
			{
			vertexlist[v2].visited=true;
			displayVertex(v2);
			queue.add(v2);
			}
		}
		for(int j=0;j<vertexcount;j++)
		{
			vertexlist[j].visited=false;
		}
	}
}
