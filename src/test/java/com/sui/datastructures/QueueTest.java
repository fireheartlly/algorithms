package com.sui.datastructures;

import junit.framework.TestCase;

public class QueueTest extends TestCase 
{
	public void testIsEmpty()
	{
		Queue<Integer> queue = new Queue<Integer>();
		 assertEquals(true,queue.isEmpty()); 
	}
	
	public void testEnQueue()
	{
		Queue<Integer> queue =new Queue<Integer>();
		queue.enQueue(new Integer(12));
		assertEquals(false,queue.isEmpty());
		assertEquals(new Integer(1),queue.getSize());
		
	}
	
	public void testdeQueue()
	{
		Queue<Integer> queue = new Queue<Integer>();
		queue.enQueue(12);
		queue.enQueue(13);
		try {
			assertEquals((Integer)queue.deQueue(),new Integer(12));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}
	

}
