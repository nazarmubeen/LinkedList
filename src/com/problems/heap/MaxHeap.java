package com.problems.heap;

public class MaxHeap {

	int heapmaxsize;
	int heapsize;
	int heap[];
	
	public boolean isLeaf(int pos) // true if pos is leaf
	 { 
		return (pos >= heapsize/2) && (pos < heapsize); 
		
	 } 
	
	
	public int parent(int pos) { // Return pos for parent
		 return (pos-1)/2;
		 }

		 // Return position for left child of pos
		 public int leftchild(int pos) {
		 return 2*pos + 1;
		 }
		 // Return position for right child of pos
		 public int rightchild(int pos) {
		 return 2*pos + 2;
		 } 

	public int getHeapmaxsize() {
		return heapmaxsize;
	}

	public void setHeapmaxsize(int heapmaxsize) {
		this.heapmaxsize = heapmaxsize;
	}

	public int getHeapsize() {
		return heapsize;
	}

	public void setHeapsize(int heapsize) {
		this.heapsize = heapsize;
	}

	public int[] getHeap() {
		return heap;
	}

	public void setHeap(int[] heap) {
		this.heap = heap;
	}

	public MaxHeap(int h[])
	{
		heap=h;
		heapsize=heapmaxsize=h.length;
		buildHeap();
	}
	
	public void buildHeap()
	{
		
	}
	
	
}
