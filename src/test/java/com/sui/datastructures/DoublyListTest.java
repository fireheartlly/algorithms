package com.sui.datastructures;

import com.sui.datastructures.nodes.DoublyNode;

import junit.framework.TestCase;

public class DoublyListTest extends TestCase{
	
	public void  testDoublyCreated(){
		DoublyLinkList dll=new DoublyLinkList();
		assertEquals(0,dll.getLength());
	}
	
	public void testPeek(){
		DoublyLinkList dll=new DoublyLinkList();
		try{
			assertEquals(50,dll.peek());	
		}
		catch(NullPointerException e){}

		DoublyNode n1=new DoublyNode(50);
		dll.addToHead(n1);
		
		DoublyNode n2=new DoublyNode(51);
		dll.addToHead(n2);
		assertEquals(51,dll.peek());
	}
	public void testAddtoHead(){
		DoublyLinkList dll=new DoublyLinkList();
		DoublyNode n1=new DoublyNode(15);
		dll.addToHead(n1);
		assertEquals(1,dll.getLength());
		DoublyNode n2=new DoublyNode(60);
		dll.addToHead(n2);
		assertEquals(2,dll.getLength());
		assertEquals(60,dll.peek());
		assertEquals(15,dll.rear());
	}
	public void testAddtoTail(){
		DoublyLinkList dll=new DoublyLinkList();
		DoublyNode n3=new DoublyNode(35);
		dll.addToTail(n3);
		assertEquals(1,dll.getLength());
		DoublyNode n2=new DoublyNode(80);
		dll.addToTail(n2);
		assertEquals(2,dll.getLength());
		assertEquals(35,dll.peek());
		assertEquals(80,dll.rear());
	}
	
	public void testInsert(){
		DoublyLinkList dll=new DoublyLinkList();
		DoublyNode n1=new DoublyNode(25);
		dll.addToHead(n1);
		DoublyNode n2=new DoublyNode(35);
		dll.addToTail(n2);
		DoublyNode n3=new DoublyNode(45);
		dll.addToTail(n3);
		
		DoublyNode newnode=new DoublyNode(55);
		

		try {
			dll.insert(newnode,2);
			dll.insert(newnode,4);
		} catch (Exception e) {
			//e.printStackTrace();
		}
		
		assertEquals(4, dll.getLength());
		assertEquals(55,n2.next.value);
	}
}
