package com.sui.datastructures.nodes;

/**
 * Doubly node for the doubly link list
 * @author heary
 *
 */
public class DoublyNode extends Node {

	//Stores pointer to next node
	public DoublyNode next;
	
	//Stores pointer to previous node
	public DoublyNode prev;
	
	public DoublyNode(int num){
		this.value=num;
	}
}
