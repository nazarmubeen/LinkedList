
package com.BST;

public class BSTOperation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BinarySearchTree btree=new BinarySearchTree();
		btree.inorder(btree.root);
		Node node1=new Node(8);
		Node node2=new Node(3);
		Node node3=new Node(1);
		Node node4=new Node(6);
		Node node5=new Node(4);
		Node node6=new Node(7);
		Node node7=new Node(10);
		Node node8=new Node(14);
		Node node9=new Node(13);
		
		btree.root=btree.insert(node1, btree.root);
		btree.inorder(btree.root);
		System.out.println("");
		btree.root=btree.insert(node2, btree.root);
		btree.inorder(btree.root);
		System.out.println("");
		btree.root=btree.insert(node3, btree.root);
		btree.inorder(btree.root);
		System.out.println("");
		btree.root=btree.insert(node4, btree.root);
		btree.inorder(btree.root);
		System.out.println("");
		btree.root=btree.insert(node5, btree.root);
		btree.inorder(btree.root);
		System.out.println("");
		btree.root=btree.insert(node6, btree.root);
		btree.inorder(btree.root);
		System.out.println("");
		btree.root=btree.insert(node7, btree.root);
		btree.inorder(btree.root);
		System.out.println("");
		btree.root=btree.insert(node8, btree.root);
		btree.inorder(btree.root);
		System.out.println("");
		btree.root=btree.insert(node9, btree.root);
		System.out.println("Inorder");
		btree.inorder(btree.root);
		System.out.println("");
		System.out.println("post order");
		btree.postOrder(btree.root);
		System.out.println("");
		System.out.println("pre order");
		btree.preOrder(btree.root);
	}

}
