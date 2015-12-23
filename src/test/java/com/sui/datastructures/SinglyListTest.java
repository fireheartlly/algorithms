package com.sui.datastructures;

import com.sui.datastructures.nodes.SinglyNode;

import junit.framework.TestCase;

public class SinglyListTest extends TestCase {
	
	public void testAddNodeinHead()
	{	
		SinglyNode singlyNode = new SinglyNode();
	    singlyNode.value = 10;
	    SinglyList siglyList = new SinglyList();
		siglyList.addinHead(singlyNode);
		assertEquals(siglyList.head.value, 10);
	}
	public void testAddinTail()
	{
		SinglyNode singlyNodeTail = new SinglyNode();
		singlyNodeTail.value=10;
		SinglyList singlyList = new SinglyList();
		singlyList.addinTail(singlyNodeTail);
		assertEquals(10, singlyList.tail.value);
		
	}
	public void testGetSize()
	{
		SinglyNode singlyNode = new SinglyNode();
	    singlyNode.value = 10;
	    SinglyList siglyList = new SinglyList();
		siglyList.addinHead(singlyNode);
		SinglyNode singlyNodeTail = new SinglyNode();
		singlyNodeTail.value=10;
		siglyList.addinTail(singlyNodeTail);
		assertEquals(siglyList.getLength(), 2);
		
	}
	public void testGetFirst() 
	{
		SinglyList singlyList = new SinglyList();
		SinglyNode singlyNode = new SinglyNode();
		singlyNode.value=12;
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
		SinglyNode singlyNode = new SinglyNode();
		singlyNode.value=12;
		SinglyList singlyList = new SinglyList();
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
		SinglyList singlyList = new SinglyList();
		try
		{	SinglyNode singlyNode = new SinglyNode();
		    singlyNode.value=12;
		    singlyList.addinHead(singlyNode);
		    SinglyNode singlyNode1 = new SinglyNode();
		    singlyNode1.value=13;
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
		SinglyList singlyList = new SinglyList();
		try
		{	SinglyNode singlyNode = new SinglyNode();
		    singlyNode.value=12;
		    singlyList.addinHead(singlyNode);
		    SinglyNode singlyNode1=new SinglyNode();
		    singlyNode1.value=13;
		    assertEquals(singlyList.getFirst(), 12); 
		    
		    singlyList.addinTail(singlyNode1);
		    assertEquals(singlyList.getLast(), 13);
			int firstNode = singlyList.removeFirst();
			assertEquals(firstNode, 12);
		}
		catch(Exception exception)
		{
			System.out.println(exception.getMessage());
		}
		
		
	}
	

}
