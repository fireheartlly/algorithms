package com.sui.datastructures;

import com.sui.datastructures.nodes.DoublyNode;

import junit.framework.TestCase;

public class DoublyListTest extends TestCase{
	
	public void  testDoublyCreated(){
		DoublyLinkList<Integer> dll=new DoublyLinkList<Integer>();
		assertEquals(0,(int)dll.getLength());
	}
	
	public void testPeek(){
		DoublyLinkList<Integer> dll=new DoublyLinkList<Integer>();
		try{
			assertEquals(50,(int)dll.peek());	
		}
		catch(NullPointerException e){}
		DoublyNode<Integer> n1=new DoublyNode<Integer>(50);
		dll.addToHead(n1);
		DoublyNode<Integer> n2=new DoublyNode<Integer>(51);
		dll.addToHead(n2);
		assertEquals(51,(int)dll.peek());
	}
	
	
	public void testAddtoHead(){
		DoublyLinkList<Integer> dll=new DoublyLinkList<Integer>();
		DoublyNode<Integer> n1=new DoublyNode<Integer>(15);
		dll.addToHead(n1);
		DoublyNode<Integer> n2=new DoublyNode<Integer>(60);
		dll.addToHead(n2);
		assertEquals(2,(int)dll.getLength());
		assertEquals(60,(int)dll.peek());
		assertEquals(15,(int)dll.rear());
	}
	
	public void testAddtoTail(){
		DoublyLinkList<Integer> dll=new DoublyLinkList<Integer>();
		DoublyNode<Integer> n3=new DoublyNode<Integer>(35);
		dll.addToTail(n3);
		assertEquals(1,(int)dll.getLength());
		DoublyNode<Integer> n2=new DoublyNode<Integer>(80);
		dll.addToTail(n2);
		assertEquals(2,(int)dll.getLength());
		assertEquals(35,(int)dll.peek());
		assertEquals(80,(int)dll.rear());
	}
	
	public void testInsert(){
		DoublyLinkList<Integer> dll=new DoublyLinkList<Integer>();
		DoublyNode<Integer> n1=new DoublyNode<Integer>(25);
		dll.addToHead(n1);
		DoublyNode<Integer> n2=new DoublyNode<Integer>(35);
		dll.addToTail(n2);
		DoublyNode<Integer> n3=new DoublyNode<Integer>(45);
		dll.addToTail(n3);	
		DoublyNode<Integer> newnode=new DoublyNode<Integer>(55);
		try {
			dll.insert(newnode,2);
			dll.insert(newnode,4);
		} catch (Exception e) {
			//e.printStackTrace();
		}
		
		assertEquals(4, dll.getLength());
		assertEquals(55,(int)n2.next.value);
	}
	
	public void testcount(){
		DoublyLinkList<Integer> dll=new DoublyLinkList<Integer>();
		DoublyNode<Integer> n1=new DoublyNode<Integer>(44);
		dll.addToTail(n1);
		DoublyNode<Integer> n2=new DoublyNode<Integer>(45);
		dll.addToTail(n2);
		DoublyNode<Integer> n3=new DoublyNode<Integer>(50);
		dll.addToTail(n3);
		assertEquals(3,(int)dll.countNode());
	}
	
	
	public void testDeleteNode() throws Exception{
		DoublyLinkList<Integer> dll=new DoublyLinkList<Integer>();
		DoublyNode<Integer> n1=new DoublyNode<Integer>(33);
		dll.addToTail(n1);
		DoublyNode<Integer> n2=new DoublyNode<Integer>(34);
		dll.addToTail(n2);
		DoublyNode<Integer> n3=new DoublyNode<Integer>(35);
		dll.addToTail(n3);
		DoublyNode<Integer> n4=new DoublyNode<Integer>(36);
		dll.addToTail(n4);
		dll.deleteHead();
		assertEquals(3,(int)dll.countNode());
		assertEquals(34,(int)dll.peek());
		
		//dll.printList();
		dll.deleteTail();
		//dll.printList();
		assertEquals(2,(int)dll.countNode());
		assertEquals(35,(int)dll.rear());
		DoublyNode<Integer> n8=new DoublyNode<Integer>(66);
		dll.addToTail(n8);
		try{
	//	dll.printList();
		dll.deletePos(1);
	//	dll.printList();
		assertEquals(34,(int)dll.get(0));
		assertEquals(66,(int)dll.get(1));
		assertEquals(2,(int)dll.countNode());
		
		}
		catch(Exception e){}
		
	}
	
	public void testGetvalueInPosition() throws Exception{
		DoublyLinkList<Integer> dll=new DoublyLinkList<Integer>();
		DoublyNode<Integer> n1=new DoublyNode<Integer>(66);
		dll.addToTail(n1);
		DoublyNode<Integer> n2=new DoublyNode<Integer>(80);
		dll.addToTail(n2);
		DoublyNode<Integer> n3=new DoublyNode<Integer>(85);
		dll.addToTail(n3);
		assertEquals(85,(int)dll.get(2));
		assertEquals(66,(int)dll.get(0));
		assertEquals(80,(int)dll.get(1));
	}
	
	public void testSearchValue() throws Exception{
		DoublyLinkList<Integer> dll=new DoublyLinkList<Integer>();
		DoublyNode<Integer> n1=new DoublyNode<Integer>(66);
		dll.addToTail(n1);
		DoublyNode<Integer> n2=new DoublyNode<Integer>(80);
		dll.addToTail(n2);
		DoublyNode<Integer> n3=new DoublyNode<Integer>(85);
		dll.addToTail(n3);
		DoublyNode<Integer> n4=new DoublyNode<Integer>(90);
		dll.addToTail(n4);
		assertEquals(2,(int)dll.searchValue(85));
		
		try{
			assertEquals(0,(int)dll.searchValue(100));
		}
		catch(Exception e){}
		
		// sui hold a minute got a call from friend
		//ok,np
		// you can write comment 
		//ok
		//ap,cool
		
	}
	
	
	
}
