package com.sui.datastructures;

import junit.framework.TestCase;

public class QueueTest extends TestCase{
	
	public void testQueueConstructor(){
		Queue testqueue=new Queue(20);
		assertEquals(20,testqueue.lengthOfQueue());
		
	}
	
	public void testQueueIsempty(){
		Queue testqueue=new Queue(20);
		assertTrue(testqueue.queueIsempty());
	}
	
	public void testEnqueue() throws Exception{
		Queue testqueue=new Queue(20);
		testqueue.enQueue(10);
		testqueue.enQueue(15);
		testqueue.enQueue(30);
		assertFalse(testqueue.queueIsempty());
	}
	public void testQueueIsfull(){
		Queue testqueue=new Queue(20);
		assertFalse(testqueue.queueIsfull());
	}
	public void testDequeue() throws Exception{
		Queue testqueue=new Queue(20);
		testqueue.enQueue(3);
		testqueue.enQueue(5);
		assertEquals(3,testqueue.deQueue());
		
	}
	
	
	
}
