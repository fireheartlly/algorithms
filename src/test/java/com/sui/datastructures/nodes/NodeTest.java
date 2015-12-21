package com.sui.datastructures.nodes;

import junit.framework.TestCase;

public class NodeTest extends TestCase{

	public void testSinglyNode(){
		SinglyNode n1 = new SinglyNode();
		n1.value = 10;
		SinglyNode n2 = new SinglyNode();
		n2.value = 12;
		n1.next = n2;
		
		assertNotNull(n1.next);
		assertNull(n2.next);
		assertEquals(10,n1.value);
		assertEquals(12,n1.next.value);
		
	}

}
