package com.problems.list;

public class LinkedListOperations {

	public static void main(String[] args)
	{
		LinkedList list=new LinkedList();
		list.addNodeStart(list, 5);
		list.addNodeStart(list, 15);
		list.addNodeStart(list, 25);
		list.printList(list.head);
	}
}
