
package com.BST;

public class BinarySearchTree {

	Node root;
	
	public BinarySearchTree()
	{
		root=null;
	}
	
	public Node insert(Node node,Node root)
	{
		if(root==null)
		{
			root=node;
			return root;
		}
		else{
		
		if(node.data>root.data)
		{
			
			root.right=insert(node,root.right);
		
		}
		else if(node.data<root.data)
		{
			root.left=insert(node,root.left);
		}
		
		}
		return root;
	}
	
	public void inorder(Node root)
	{
		
		if(root==null)
		{
		return;
		}
		
		inorder(root.left);
		System.out.print(root.data+",");
		inorder(root.right);
		
		}
	
	public void preOrder(Node root)
	{
		
		if(root==null)
		{
		return;
		}
		
		System.out.print(root.data+",");
		preOrder(root.left);
		preOrder(root.right);
		
		}
	public void postOrder(Node root)
	{
		
		if(root==null)
		{
		return;
		}
		
		postOrder(root.left);
		
		postOrder(root.right);
		System.out.print(root.data+",");
		}
}
