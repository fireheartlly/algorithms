package com.sui.datastructures.nodes;

/**
 * Singly node for the singly link list
 * @author heary
 *
 */
public class SinglyNode<Itemtype> extends Node<Itemtype> {

	// Stores pointer to the next element of the link list
	public SinglyNode<Itemtype> next;
	public SinglyNode(Itemtype value) {
		this.value = value;
	}
}
