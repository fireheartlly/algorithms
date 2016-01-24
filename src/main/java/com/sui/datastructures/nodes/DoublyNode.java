package com.sui.datastructures.nodes;

/**
 * Doubly node for the doubly link list
 * @author heary
 *
 */
public class DoublyNode<ItemType extends Comparable<?>> extends Node<ItemType> {

	//Stores pointer to next node
	public DoublyNode<ItemType> next;
	
	//Stores pointer to previous node
	public DoublyNode<ItemType> prev;
	
	public DoublyNode(ItemType num){
		this.value=num;
	}
}
