package com.problems.list;

public class LinkedListLoop {

	//Two pointers
	public Node loopCheck(Node head)
	{
		//fast pointer take two steps at a time
		Node fastptr=head;
		//slow pointer take one step at a time
		Node slowptr=head;
		
		if(head==null)
		{
			System.out.println("no loops empty list");
		}
		
		//Till any pointer becomes null
		while(slowptr!=null && fastptr!=null && fastptr.next!=null)
		{
			slowptr=slowptr.next;
			fastptr=fastptr.next.next;
			
			//if both pointers point to same node
			//possible only in loop list
			if(slowptr==fastptr)
			{
				System.out.println("loopfound");
				fastptr=head;
				while(fastptr.next!=slowptr)
				{
					fastptr=fastptr.next;
				}
					return fastptr;
			}
		}
		System.out.println("loop not found");
			return head;
	}
	
	public void makeCycle(Node head)
	{
		Node temp=head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next=head.next.next;
	}
	
	
}
