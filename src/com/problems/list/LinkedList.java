package com.problems.list;

public class LinkedList {

	public LinkedList() {
		length = 0;
	}
	
	Node head;
	int length;
	public void addNodeStart(LinkedList list,int data)
	{
		Node temp=new Node(data);
		if(list.head==null)
		{
			System.out.println("head is null");
			head=temp;
			length++;
		}
		else{
		
		temp.next=list.head;
		list.head=temp;
		
		}
	}
	
	public void printList(Node head)
	{
		Node temp =head;
		System.out.println("List Data");
		while(temp!=null)
		{
			System.out.print(+temp.data+" ");
			temp=temp.next;
		}
		
	}
}
