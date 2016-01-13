package com.sui.datastructures;

import com.sui.datastructures.nodes.SinglyNode;

import junit.framework.TestCase;

public class CircularListTest extends TestCase {

	private CircularList<String> getANewList() {
		CircularList<String> list = new CircularList<String>();
		SinglyNode<String> node1 = new SinglyNode<String>("Node1");
		list.addNodeToHead(node1);
		SinglyNode<String> node2 = new SinglyNode<String>("Node2");
		list.addNodeToHead(node2);
		SinglyNode<String> node3 = new SinglyNode<String>("Node3");
		list.addNodeToHead(node3);
		SinglyNode<String> node4 = new SinglyNode<String>("Node4");
		list.addNodeToHead(node4);
		return list;
	}

	public void testGetLength() {
		CircularList<String> list = getANewList();
		assertEquals(4, list.getLength());
	}

	public void testAddNodeToHead() {
		CircularList<String> list = getANewList();
		assertEquals(4, list.getCount());
		// list.printList();
		// System.out.println(list);
	}

	public void testAddToTail() {
		CircularList<String> list = new CircularList<String>();
		SinglyNode<String> node1 = new SinglyNode<String>("Node1");
		list.addInTail(node1);
		SinglyNode<String> node2 = new SinglyNode<String>("Node2");
		list.addInTail(node2);
		SinglyNode<String> node3 = new SinglyNode<String>("Node3");
		list.addInTail(node3);
		SinglyNode<String> node4 = new SinglyNode<String>("Node4");
		list.addInTail(node4);
		assertEquals(4, list.getCount());
		// System.out.println(list);
	}

	public void testAddToNthPostion() throws Exception {
		CircularList<String> list = new CircularList<String>();
		SinglyNode<String> node1 = new SinglyNode<String>("Node1");
		list.addNodeToList(node1, 0);
		SinglyNode<String> node2 = new SinglyNode<String>("Node2");
		list.addNodeToList(node2, 1);
		SinglyNode<String> node3 = new SinglyNode<String>("Node3");
		list.addNodeToList(node3, 2);
		SinglyNode<String> node4 = new SinglyNode<String>("Node4");
		list.addNodeToList(node4, 3);
		assertEquals(4, list.getLength());
	}

	public void testPrintList() {
		CircularList<String> list = getANewList();
		assertEquals("Node4->Node3->Node2->Node1->/", list.printList());
	}

	public void testPeek() {
		CircularList<String> list = getANewList();
		assertEquals("Node4", (String) list.peek());
	}

	public void testrPeek() {
		CircularList<String> list = getANewList();
		assertEquals("Node1", (String) list.tailpeek());
	}

	public void testSearchValue() {
		CircularList<String> list = getANewList();
		assertTrue(list.search("Node1"));
		assertFalse(list.search("Node5"));
	}

	public void testRemoveFromHead() throws Exception {
		CircularList<String> list = getANewList();
		list.removeFromHead();
		assertFalse(list.search("Node4"));
		assertEquals(3, list.getCount());
	}

	public void testRemoveFromNth() throws Exception {
		CircularList<String> list = getANewList();
		list.remove(2);
		assertFalse(list.search("Node3"));
		assertEquals(3, list.getCount());
	}

	public void testRemoveFromTail() throws Exception {
		CircularList<String> list = getANewList();
		list.removeFromTail();
		assertFalse(list.search("Node1"));
		assertEquals(3, list.getCount());
	}

	public void testRemoveByValue() throws Exception {
		CircularList<String> list = getANewList();
		list.removeByValue("Node4");
		list.removeByValue("Node1");
		list.removeByValue("Node2");
		assertFalse(list.search("Node4"));
		assertFalse(list.search("Node1"));
		assertFalse(list.search("Node2"));
		assertEquals(1, list.getCount());
	}

	public void testGetNth() throws Exception {
		CircularList<String> list = getANewList();
		assertEquals("Node4", (String) list.get(1));
		assertEquals("Node3", (String) list.get(2));
		assertEquals("Node1", (String) list.get(4));
	}

}
