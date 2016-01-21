package com.problems.heap;



public class HeapFunctions {
		
	//Function to generate maxheapify where root is max than childs
	public void maxHeapify(int Arr[],int i,int N)
	{
				int largest;
				int left = 2*i+1;     //left child
			    int right = 2*i +2;  //right child
			    
			    System.out.println("left"+" "+left);
			    System.out.println("right"+" "+right);
			    System.out.println("Max size"+" "+N);
			    if(left< N && Arr[left] > Arr[i] )
			    {
			    largest = left;
			    System.out.println("largest left"+largest);
			    }
			    else
			    {
			         largest = i;
			         System.out.println("largest i"+largest);
			    }
			    if(right < N && Arr[right] > Arr[largest] )
			    {
			    largest = right;
			    System.out.println("largest right"+largest);
			    }
			    if(largest != i )
			    {
			    	System.out.println("No largest"+largest);
			        Arr=swap (Arr, i , largest);
			        maxHeapify (Arr,largest,N);
			    } 
	}
	
	//function to generate minheapify where root is minimum than childs
	public void minHeapify(int Arr[],int i,int N)
	{
				int smallest;
				int left = 2*i+1;     //left child
			    int right = 2*i +2;  //right child
			    
			    if(left< N && Arr[left]<  Arr[i] )
			    {
			    smallest = left;
			    System.out.println("smallest left"+smallest);
			    }
			    else
			    {
			    	smallest = i;
			         System.out.println("smallest i"+smallest);
			    }
			    if(right < N && Arr[right] < Arr[smallest] )
			    {
			    	smallest = right;
			    System.out.println("smallest right"+smallest);
			    }
			    if(smallest != i )
			    {
			    	System.out.println("No largest"+smallest);
			        Arr=swap (Arr, i , smallest);
			        minHeapify (Arr,smallest,N);
			    } 
	}
	
	//function to swap elements in an Array
	public int[] swap(int Arr[],int x,int y)
	{
		System.out.println("in swap");
		System.out.println("x"+x+"y"+y);
		int temp=Arr[x];
		Arr[x]=Arr[y];
		Arr[y]=temp;
		return Arr;
	}
	
	//function to build maximum heap
	void build_maxheap (int Arr[ ],int N)
	{
	    for(int i =N/2; i >= 0 ; i-- )
	    {
	        maxHeapify (Arr, i,N) ;
	    }
	}
	
	//function to build minimum heap
	void build_minheap (int Arr[ ],int N)
	{
	    for(int i =N/2; i >= 0 ; i-- )
	    {
	        minHeapify (Arr, i,N) ;
	    }
	}
	
	
	//heap sorting 
	void heap_sort(int Arr[ ],int N)
	{
	    int heap_size = N;
	   
	    for(int i = N-1; i>=1 ; i-- )
	    {
	    	build_maxheap(Arr,heap_size);
	    	System.out.println("this"+i);
	    	System.out.println("i="+i+"");
	        Arr=swap(Arr,0, i);
	        heap_size = heap_size-1;
	        System.out.println("calling max heapify"+heap_size);
	       
	    }
	}
	
	
	
}
