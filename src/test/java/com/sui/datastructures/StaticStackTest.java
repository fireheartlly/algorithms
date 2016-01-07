package com.sui.datastructures;

import junit.framework.TestCase;

public class StaticStackTest extends TestCase{

	public void testStackContructor(){
		StaticStack teststack = new StaticStack(10);
		assertEquals(10,teststack.lengthOfStack());
	}
	
	//this test is for is empty
	public void testIsEmpty(){
		StaticStack teststack = new StaticStack(10);
		assertTrue(teststack.isEmpty());
	}
	public void testPush() throws Exception{
		StaticStack teststack = new StaticStack(10);
		teststack.push(10);
		teststack.push(11);
		assertFalse(teststack.isEmpty());
	}
	
	public void testPop() throws Exception{
		StaticStack teststack = new StaticStack(10);
		teststack.push(10);
		teststack.push(11);
		assertEquals(11,teststack.pop());
	}
	
	public void testPeek() throws Exception{
		StaticStack teststack = new StaticStack(10);
		teststack.push(10);
		teststack.push(11);
		teststack.pop();
		assertEquals(10,teststack.peek());
	}
	
	public void testIsFull() throws Exception{
		StaticStack teststack = new StaticStack(5);
		teststack.push(10);
		teststack.push(11);
		teststack.push(12);
		teststack.push(13);
		teststack.push(14);
		assertTrue(teststack.isFull());
		
	}
}
