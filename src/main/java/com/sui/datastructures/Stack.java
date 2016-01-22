package com.sui.datastructures;

import com.sui.datastructures.nodes.SinglyNode;

/**
 * 
 * @author ashay
 *
 *         stack data structure used to add the element at the top and pop the
 *         recently added data
 */
public class Stack<ItemType extends Comparable<?>> {

	/**
	 * SinglyList data structure is used here to add and delete the data in the
	 * stack
	 */
	SinglyList<ItemType> singlyList = new SinglyList<ItemType>();

	/**
	 * 
	 * Checks if the stack is empty
	 */
	public boolean isEmpty() {
		return singlyList.length == 0;
	}
	
	/**
	 * 
	 * @return itemType
	 * @throws Exception
	 * @desc add the new data in the end of the stack
	 */
	public void push(ItemType itemType) {
		SinglyNode<ItemType> singlyNode = new SinglyNode<ItemType>(itemType);
		singlyList.addInHead(singlyNode);

	}
	

	/**
	 * @desc return and delete the last item in the stack
	 * @return itemType
	 * @throws Exception
	 */
	public ItemType pop() throws Exception {
		ItemType itemType = singlyList.removeLast();
		return itemType;
	}

	/**
	 * @desc return the last item in the stack
	 * @return itemType
	 * @throws Exception
	 */
	public ItemType peek() throws Exception

	{
		ItemType itemType = singlyList.getLast();
		return itemType;
	}

	/**
	 * @desc return the size of the stack
	 * 
	 */
	public Integer getSize() {
		return singlyList.getLength();
	}

}
