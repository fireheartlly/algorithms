package com.sui.datastructures;

import junit.framework.TestCase;

public class StackTest extends TestCase{

	public void testStackContructor(){
		Stack teststack = new Stack(10);
		assertEquals(10,teststack.lengthOfStack());
	}
	
	public void testIsEmpty(){
		Stack teststack = new Stack(10);
		assertTrue(teststack.isEmpty());
	}
	public void testPush() throws Exception{
		Stack teststack = new Stack(10);
		teststack.push(10);
		teststack.push(11);
		assertFalse(teststack.isEmpty());
	}
	
	public void testPop() throws Exception{
		Stack teststack = new Stack(10);
		teststack.push(10);
		teststack.push(11);
		assertEquals(11,teststack.pop());
	}
	
	public void testPeek() throws Exception{
		Stack teststack = new Stack(10);
		teststack.push(10);
		teststack.push(11);
		teststack.pop();
		assertEquals(10,teststack.peek());
	}
	
	public void testIsFull() throws Exception{
		Stack teststack = new Stack(5);
		teststack.push(10);
		teststack.push(11);
		teststack.push(12);
		teststack.push(13);
		teststack.push(14);
		assertTrue(teststack.isFull());
		
	}
}
