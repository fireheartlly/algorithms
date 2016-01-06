package com.sui.datastructures;

import com.sui.datastructures.nodes.SinglyNode;

import junit.framework.TestCase;

public class SinglyListTest extends TestCase {
	
	public void testAddNodeinHead()
	{	
		SinglyNode<Integer> singlyNode= new SinglyNode<Integer>(10);
	    //singlyNode.value = 10;
	    SinglyList<Integer> siglyList = new SinglyList<Integer>();
		siglyList.addinHead(singlyNode);
		assertEquals((int)siglyList.head.value, 10);
	}
	public void testAddinTail()
	{
		SinglyNode<Integer> singlyNodeTail = new SinglyNode<Integer>(10);
		//singlyNodeTail.value=10;
		SinglyList<Integer> singlyList = new SinglyList<Integer>();
		singlyList.addinTail(singlyNodeTail);
		assertEquals(10,(int)singlyList.tail.value);
		
	}
	public void testGetSize()
	{
		SinglyNode<Integer> singlyNode= new SinglyNode<Integer>(10);
	    //singlyNode.value = 10;
	    SinglyList<Integer> siglyList = new SinglyList<Integer>();
		siglyList.addinHead(singlyNode);
		SinglyNode<Integer> singlyNodeTail = new SinglyNode<Integer>(10);
		//singlyNodeTail.value=10;
		siglyList.addinTail(singlyNodeTail);
		assertEquals(siglyList.getLength(), 2);
		
	}
	public void testGetFirst() 
	{
		SinglyList<Integer> singlyList = new SinglyList<Integer>();
		SinglyNode<Integer> singlyNode= new SinglyNode<Integer>(12);
		//singlyNode.value=12;
		singlyList.addinHead(singlyNode);
		try
		{
			int first=singlyList.getFirst();
			assertEquals(12,first);
		}
		catch(Exception exception)
		{
			System.out.println(exception.getMessage());
		}
		
		
	}
	public void testGetLast()
	{
		SinglyNode<Integer> singlyNode= new SinglyNode<Integer>(12);
		//singlyNode.value=12;
		SinglyList<Integer> singlyList = new SinglyList<Integer>();
		singlyList.addinTail(singlyNode);
		try{
			int last = singlyList.getLast();
			assertEquals(12,last);
		}
		catch(Exception exception)
		{
			System.out.println(exception.getMessage());
		}
		
	}
	public void testRemoveLast()
	{
		SinglyList<Integer> singlyList = new SinglyList<Integer>();
		try
		{	SinglyNode<Integer> singlyNode= new SinglyNode<Integer>(12);
		   // singlyNode.value=12;
		    singlyList.addinHead(singlyNode);
		    SinglyNode<Integer> singlyNode1 = new SinglyNode<Integer>(13);
		    //singlyNode1.value=13;
		    singlyList.addinTail(singlyNode1);
			int lastNode=singlyList.removeLast();
			assertEquals(lastNode, 13);
		}
		catch(Exception exception)
		{
			System.out.println(exception.getMessage());
		}
		
		
	}
	public void testRemovefirst()
	{
		SinglyList<Integer> singlyList = new SinglyList<Integer>();
		try
		{	SinglyNode<Integer> singlyNode= new SinglyNode<Integer>(12);
		    //singlyNode.value=12;
		    singlyList.addinHead(singlyNode);
		    SinglyNode<Integer> singlyNode1=new SinglyNode<Integer>(13);
		    //singlyNode1.value=13;
		    assertEquals((int)singlyList.getFirst(), 12); 
		    
		    singlyList.addinTail(singlyNode1);
		    assertEquals((int)singlyList.getLast(), 13);
			int firstNode = singlyList.removeFirst();
			assertEquals(firstNode, 12);
		}
		catch(Exception exception)
		{
			System.out.println(exception.getMessage());
		}
		
		
	}
	

}
