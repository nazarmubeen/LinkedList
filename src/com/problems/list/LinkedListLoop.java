package com.problems.list;

public class LinkedListLoop {

	public void loopCheck(Node head)
	{
		Node fastptr=head;
		Node slowptr=head;
		
		if(head==null)
		{
			System.out.println("no loops empty list");
		}
		
		while(slowptr!=null && fastptr!=null && fastptr.next!=null)
		{
			slowptr=slowptr.next;
			fastptr=fastptr.next.next;
			if(slowptr==fastptr)
			{
				System.out.println("loopfound");
				return;
			}
		}
		System.out.println("loop not found");
			return;
	}
}
