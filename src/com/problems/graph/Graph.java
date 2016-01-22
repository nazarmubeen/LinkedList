package com.problems.graph;

import java.awt.DisplayMode;
import java.util.Stack;



public class Graph {

	int maxsize=20;
	Vertex vertex[];
	int matrix[][];
	int vertexcount;
	Stack stackobj;

	public Graph()
	{
		vertex = new Vertex[maxsize];
		matrix=new int[maxsize][maxsize];
		vertexcount=0;
		for(int i=0;i<maxsize;i++)
		{
			for(int j=0;j<maxsize;j++)
			{
				matrix[i][j]=0;
			}
		}
		stackobj=new Stack();			
	}
	
	public void addVertex(char label)
	{
		vertex[vertexcount++]=new Vertex(label);
	}
	public void addEdge(int i,int j)
	{
		matrix[i][j]=1;
		matrix[j][i]=1;
	}
	
	public void displyVertex(int v)
	{
		System.out.println(vertex[v].label);
	}
	
	public int adjVertex(int v)
	{
		for(int i=0;i<maxsize;i++)
		{
			if(matrix[v][i]==1 && vertex[i].visited==false )
				return i;
		}
		return -1;
	}
	
	public void dfs()
	{
		
		vertex[0].visited=true;
		displyVertex(0);
		stackobj.push(0);
		
		while(!stackobj.isEmpty())
		{
			int v=adjVertex((Integer) stackobj.peek());
			if(v==-1)
			{
				stackobj.pop();
			}
				else{
					vertex[v].visited=true;
					displyVertex(v);
					stackobj.push(v);
					
				}
			}
		}
		
	}

