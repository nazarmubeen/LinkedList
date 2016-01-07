package com.problems.list;

public class LinkedListOperations {

	public static void main(String[] args)
	{
		LinkedList list=new LinkedList();
		list.addNodeStart(list, 5);
		list.addNodeStart(list, 15);
		list.addNodeStart(list, 25);
		list.printList(list.head);
		list.addNodeEnd(list.head, 1);
		list.addNodeEnd(list.head, 15);
		list.printList(list.head);
		list.addNodeAtPosition(list.head, 2, 10);
		list.printList(list.head);
		//list.head=list.deleteKeyNode(list.head, 15);
		//list.printList(list.head);
		//list.head=list.deleteKeyAtPosition(list.head, 3);
		//list.printList(list.head);
		System.out.println("length"+list.length);
		Node n=list.nodeFromEnd(list.head, 2);
		System.out.println("2nd Node from End "+n.data);
		
		LinkedListLoop loop=new LinkedListLoop();
		loop.loopCheck(list.head);
	}
}
