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
	
	public void testcount(){
		DoublyLinkList dll=new DoublyLinkList();
		DoublyNode n1=new DoublyNode(44);
		dll.addToTail(n1);
		DoublyNode n2=new DoublyNode(45);
		dll.addToTail(n2);
		DoublyNode n3=new DoublyNode(50);
		dll.addToTail(n3);
		assertEquals(3,dll.countNode());
	}
	
	
	public void testDeleteNode() throws Exception{
		DoublyLinkList dll=new DoublyLinkList();
		DoublyNode n1=new DoublyNode(33);
		dll.addToTail(n1);
		DoublyNode n2=new DoublyNode(34);
		dll.addToTail(n2);
		DoublyNode n3=new DoublyNode(35);
		dll.addToTail(n3);
		DoublyNode n4=new DoublyNode(36);
		dll.addToTail(n4);
		dll.deleteHead();
		assertEquals(3,dll.countNode());
		assertEquals(34,dll.peek());
		
		//dll.printList();
		dll.deleteTail();
		//dll.printList();
		assertEquals(2,dll.countNode());
		assertEquals(35,dll.rear());
		DoublyNode n8=new DoublyNode(66);
		dll.addToTail(n8);
		try{
	//	dll.printList();
		dll.deletePos(1);
	//	dll.printList();
		assertEquals(34,dll.get(0));
		assertEquals(66,dll.get(1));
		assertEquals(2,dll.countNode());
		
		}
		catch(Exception e){}
		
	}
	
	public void testGetvalueInPosition() throws Exception{
		DoublyLinkList dll=new DoublyLinkList();
		DoublyNode n1=new DoublyNode(66);
		dll.addToTail(n1);
		DoublyNode n2=new DoublyNode(80);
		dll.addToTail(n2);
		DoublyNode n3=new DoublyNode(85);
		dll.addToTail(n3);
		assertEquals(85,dll.get(2));
		assertEquals(66,dll.get(0));
		assertEquals(80,dll.get(1));
	}
	
	public void testSearchValue() throws Exception{
		DoublyLinkList dll=new DoublyLinkList();
		DoublyNode n1=new DoublyNode(66);
		dll.addToTail(n1);
		DoublyNode n2=new DoublyNode(80);
		dll.addToTail(n2);
		DoublyNode n3=new DoublyNode(85);
		dll.addToTail(n3);
		DoublyNode n4=new DoublyNode(90);
		dll.addToTail(n4);
		assertEquals(2,dll.searchValue(85));
		
		try{
			assertEquals(0,dll.searchValue(100));
		}
		catch(Exception e){}
		
		// sui hold a minute got a call from friend
		//ok,np
		// you can write comment 
		//ok
		//ap,cool
		
	}
	
	
	
}
