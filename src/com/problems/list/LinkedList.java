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
	
	public void addNodeEnd(Node head,int data)
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
	Node node=new Node(data);
	Node temp=head;
	while(temp.next!=null)
	{
		temp=temp.next;
	}
	temp.next=node;
	}
	
	public void addNodeAtPosition(Node head,int position,int data)
	{
		Node temp=head;
		//create a node
		Node node=new Node(data);
		int c=1;
		//while counter is not equal to the position
		while(c!=position)
		{
			temp=temp.next;
			c++;
		}
		//point node to the next of current node
		node.next=temp.next;
		//point next of current to the node to insert
		temp.next=node;
	}
	//deleting a given key
	public Node deleteKeyNode(Node head,int key)
	{
		//traverse pointer
		Node temp=head;
		//previous pointer
		Node prevtemp=temp;
		
		while(temp!=null)
		{
			//when key is at head position
			if(key==head.data)
			{
				head=head.next;
				System.out.println("head is deleted");
				return head;
			}
			
			//when key is at any position other than head
			if(temp.data==key)
			{
				prevtemp.next=temp.next;
				temp.next=null;
				temp=prevtemp;	
			}
			prevtemp=temp;
			temp=temp.next;
		}
		return head;
	}
	
	//delete node by position in linked list
	public Node deleteKeyAtPosition(Node head,int position)
	{
		
		Node temp=head;
		Node prevtemp=temp;
		int c=1;
		//if position is head
		if(position==1)
		{
			head=head.next;
			return head;
		}
		//position +1 because we have to go till that point
		while(c!=position+1)
		{
			if(c==position && position!=1)
			{
				prevtemp.next=temp.next;
				temp.next=null;
				temp=prevtemp;
			}
			prevtemp=temp;
			temp=temp.next;
			c++;
		}
		return head;	
	}
	
	//nth Node from end
	public Node nodeFromEnd(Node head,int position){
		Node temp=head;
		int length=1;
		while(temp.next!=null)
		{
			length++;
			temp=temp.next;
		}
		System.out.println("length"+length);
		temp=head;
		int c=1;
		while(c!=(length-position+1))
		{
			temp=temp.next;
			c++;
		}
		return temp;
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
		System.out.println("");
	}
	
	
}
