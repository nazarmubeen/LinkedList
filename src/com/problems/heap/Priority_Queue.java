
package com.problems.heap;

public class Priority_Queue {

	public int[] priority_Queue(int arr[],int N)
	{
		int[] newarray=new int[N];
		
		for(int i=0;i<N;i++)
		{
			System.out.println(i+"priority_Queue"+arr[i]);
			insert(newarray,N,arr[i]);
		}
		return newarray;
	}
	
	//inserting new element in array
	public void insert(int Arr[],int N,int a)
	{
		for(int i=0;i<N;i++)
		{
			System.out.println("insert");
			// search for the correct position in array
			if(a>Arr[i])
			{
				System.out.println("call insertAtThis");
				Arr=insertAtThis(Arr,N,a,i);
				break;
			}
		}
	}
	
	//insert and swap
	public int[] insertAtThis(int arr[],int N,int a,int index)
	{
		System.out.println("insertAtThis");
		System.out.println("index"+index);
		int j=index;
		N=N-1;
		while(N!=index)
		{
			arr[N]=arr[N-1];
			N--;
			
		}
		
		arr[index]=a;
		print(arr);
		return arr;
		
	}
	
	//print function
	public void print(int Elemmm[])
	{
		for(int i=0;i<Elemmm.length;i++)
		{
			
			System.out.print(Elemmm[i]+",");
			
		}
		System.out.println("");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Priority_Queue func=new Priority_Queue();
		int Elemmm[]={4,8,1,7,3,5};
		System.out.println("");
		System.out.println("priority queue");
		Elemmm=func.priority_Queue(Elemmm, Elemmm.length);
		System.out.println("");
		func.print(Elemmm);
	}

}
