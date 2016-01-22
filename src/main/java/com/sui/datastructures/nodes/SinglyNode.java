package com.sui.datastructures.nodes;

/**
 * Singly node for the singly link list
 * @author heary
 *
 */
public class SinglyNode<Itemtype extends Comparable<?>> extends Node<Itemtype> implements Comparable<Itemtype> {

	// Stores pointer to the next element of the link list
	public SinglyNode<Itemtype> next;
	public SinglyNode(Itemtype value) {
		this.value = value;
	}
	public int compareTo(Itemtype o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
