package com.sui.datastructures;

import junit.framework.TestCase;

public class StackTest extends TestCase
{
	
	public void testisEmpty()
	{
		Stack<String> stack = new Stack<String>();
		assertEquals(true, stack.isEmpty());
	}
	public void testPush() throws Exception
	{
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(12);
		stack.push(15);
		stack.pop();
		System.out.println(stack.peek());
		System.out.println(stack);
		assertEquals(false, stack.isEmpty());
		
	}
	public void testPull()
	{
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(12);
		stack.push(13);
		try
		{
			assertEquals(new Integer(13),(Integer)stack.pop());	
			assertEquals(new Integer(12),(Integer)stack.pop());	
			
		}
		catch(Exception exception)
		{
			exception.getMessage();
		}
	}
	
	public void  testPeek()
	{
		Stack<Integer> stack = new Stack<Integer>();
		try
		{
		stack.push(12);
		Integer item = (Integer)stack.peek();
		}
		catch(Exception exception)
		{
			exception.getMessage();
		}
		
		
		
	}
	public void testSize()
	{
		Stack<Integer> stack = new Stack<Integer>();
		assertEquals(stack.getSize(),new Integer(0));
		stack.push(12);
		assertEquals(new Integer(1),stack.getSize());
		
	}
	
	

}
