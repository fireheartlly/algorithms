package com.sui.datastructures;

import com.sui.datastructures.nodes.SinglyNode;

import junit.framework.TestCase;

public class SinglyListTest extends TestCase {
	
	public void testAddNodeinHead()
	{	
		SinglyNode<Integer> singlyNode= new SinglyNode<Integer>(10);
	    //singlyNode.value = 10;
	    SinglyList<Integer> siglyList = new SinglyList<Integer>();
		siglyList.addInHead(singlyNode);
		assertEquals((int)siglyList.getHead().value, 10);
	}
	
	public void testAddNodeInHeadByValue(){
		SinglyList<String> sl = new SinglyList<String>();
		sl.addInHead("Node1");
		sl.addInHead("Node2");
		assertEquals(2,sl.getLength());
		assertEquals("Node2",(String)sl.peek());
	}
	
	public void testAddinTail()
	{
		SinglyNode<Integer> singlyNodeTail = new SinglyNode<Integer>(10);
		//singlyNodeTail.value=10;
		SinglyList<Integer> singlyList = new SinglyList<Integer>();
		singlyList.addInTail(singlyNodeTail);
		assertEquals(10,(int)singlyList.getTail().value);
		
	}
	public void testAddNodeInTailByValue(){
		SinglyList<String> sl = new SinglyList<String>();
		sl.addInTail("Node1");
		sl.addInTail("Node2");
		assertEquals(2,sl.getLength());
		assertEquals("Node2",(String)sl.tailpeek());
	}

	public void testGetSize()
	{
		SinglyNode<Integer> singlyNode= new SinglyNode<Integer>(10);
	    //singlyNode.value = 10;
	    SinglyList<Integer> siglyList = new SinglyList<Integer>();
		siglyList.addInHead(singlyNode);
		SinglyNode<Integer> singlyNodeTail = new SinglyNode<Integer>(10);
		//singlyNodeTail.value=10;
		siglyList.addInTail(singlyNodeTail);
		assertEquals(siglyList.getLength(), 2);
		
	}
	public void testGetFirst() 
	{
		SinglyList<Integer> singlyList = new SinglyList<Integer>();
		SinglyNode<Integer> singlyNode= new SinglyNode<Integer>(12);
		//singlyNode.value=12;
		singlyList.addInHead(singlyNode);
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
		singlyList.addInTail(singlyNode);
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
		    singlyList.addInHead(singlyNode);
		    SinglyNode<Integer> singlyNode1 = new SinglyNode<Integer>(13);
		    //singlyNode1.value=13;
		    singlyList.addInTail(singlyNode1);
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
		    singlyList.addInHead(singlyNode);
		    SinglyNode<Integer> singlyNode1=new SinglyNode<Integer>(13);
		    //singlyNode1.value=13;
		    assertEquals((int)singlyList.getFirst(), 12); 
		    
		    singlyList.addInTail(singlyNode1);
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
