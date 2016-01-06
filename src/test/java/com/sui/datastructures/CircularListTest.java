package com.sui.datastructures;

import com.sui.datastructures.nodes.SinglyNode;

import junit.framework.TestCase;

public class CircularListTest extends TestCase{

	public void testAddNodeToHead(){
		CircularList<String> list = new CircularList<String>();
		SinglyNode<String> node1 = new SinglyNode<String>("Node1");
		list.addNodeToHead(node1);
		SinglyNode<String> node2 = new SinglyNode<String>("Node2");
		list.addNodeToHead(node2);
		SinglyNode<String> node3 = new SinglyNode<String>("Node3");
		list.addNodeToHead(node3);
		SinglyNode<String> node4 = new SinglyNode<String>("Node4");
		list.addNodeToHead(node4);
	
	}
	
}
