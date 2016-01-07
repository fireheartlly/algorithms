package com.sui.datastructures;

import com.sui.datastructures.nodes.SinglyNode;

public class Queue<ItemType> {

	SinglyList<ItemType> singlyList = new SinglyList<ItemType>();
	
	
	/**
	 * 
	 * @desc returns the size of the queue
	 */
	public Integer getSize() {
		
		return singlyList.getLength();

	}
	
	/**
	 * 
	 * @return
	 * @desc checks if the queue is empty
	 */
	public boolean isEmpty()
	{
		 return  singlyList.getLength()==0;
	}
	
	/**
	 * 
	 * @param itemType
	 * @desc adds the items in the tail of the queue
	 */
	public void enQueue(ItemType itemType)
	{
		SinglyNode<ItemType> singlyNode = new SinglyNode<ItemType>(itemType);
		singlyList.addinTail(singlyNode);
		
		
	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 * @desc removes and return the head of the queue
	 */
			
	public ItemType deQueue() throws Exception
	{
		
		return singlyList.removeFirst();
		
	}
	
	
	

}
