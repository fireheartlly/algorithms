package com.sui.datastructures.nodes;

import junit.framework.TestCase;

public class NodeTest extends TestCase{

	public void testSinglyNode(){
		SinglyNode<Integer> n1 = new SinglyNode<Integer>(10);
		//n1.value = 10;
		SinglyNode<Integer> n2 = new SinglyNode<Integer>(12);
		//n2.value = 12;
		n1.next = n2;
		
		assertNotNull(n1.next);
		assertNull(n2.next);
		assertEquals(10,(int)n1.value);
		assertEquals(12,(int)n1.next.value);
		
	}

	public void testDoubleNode(){
		DoublyNode n1=new DoublyNode(30);
		DoublyNode n2=new DoublyNode(40);
		n1.next=n2;
		n2.prev =n1;
		DoublyNode n3=new DoublyNode(50);
		n2.next=n3;
		n3.prev=n2;
		
		
		assertNotNull(n1.next);
		assertNotNull(n2.next);
		assertNull(n1.prev );
		assertNull(n3.next);
		assertEquals(30,n1.value);
		assertEquals(40,n1.next.value);
		assertEquals(50,n1.next.next.value );
		assertEquals(40,n3.prev.value);
		assertEquals(30,n3.prev.prev.value);
		
	}

	public void testTreeNode()
	{
		TreeNode<Integer> treeNodeCenter= new TreeNode<Integer>(12);
		TreeNode<Integer> leftNode = new TreeNode<Integer>(13);
		TreeNode<Integer> rightNode = new TreeNode<Integer>(16);
		treeNodeCenter.setLeft(leftNode);
		treeNodeCenter.setRight(rightNode);
		
		assertEquals(13, (int)treeNodeCenter.getLeft().value);
		assertEquals(16, (int)treeNodeCenter.getRight().value);
	}
	


}
