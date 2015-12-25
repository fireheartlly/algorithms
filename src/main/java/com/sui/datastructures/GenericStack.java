package com.sui.datastructures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenericStack<ItemType> implements Iterable<ItemType> {

	private int N; // size of the stack
	private Node first; // top of stack

	// helper linked list class
	private class Node {
		private ItemType ItemType;
		private Node next;
	}

	/**
	 * Create an empty stack.
	 */
	public GenericStack() {
		first = null;
		N = 0;
	}

	/**
	 * Is the stack empty?
	 */
	public boolean isEmpty() {
		return first == null;
	}

	/**
	 * Return the number of ItemTypes in the stack.
	 */
	public int size() {
		return N;
	}

	/**
	 * Add the ItemType to the stack.
	 */
	public void push(ItemType ItemType) {
		Node oldfirst = first;
		first = new Node();
		first.ItemType = ItemType;
		first.next = oldfirst;
		N++;
	}

	/**
	 * Delete and return the ItemType most recently added to the stack. Throw an
	 * exception if no such ItemType exists because the stack is empty.
	 */
	public ItemType pop() {
		if (isEmpty())
			throw new RuntimeException("Stack underflow");
		ItemType ItemType = first.ItemType; // save ItemType to return
		first = first.next; // delete first node
		N--;
		return ItemType; // return the saved ItemType
	}

	/**
	 * Return the ItemType most recently added to the stack. Throw an exception
	 * if no such ItemType exists because the stack is empty.
	 */
	public ItemType peek() {
		if (isEmpty())
			throw new RuntimeException("Stack underflow");
		return first.ItemType;
	}

	/**
	 * Return string representation.
	 */
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (ItemType ItemType : this)
			s.append(ItemType + " ");
		return s.toString();
	}

	/**
	 * Return an iterator to the stack that iterates through the ItemTypes in
	 * LIFO order.
	 */
	public Iterator<ItemType> iterator() {
		return new ListIterator();
	}

	// an iterator, doesn't implement remove() since it's optional
	private class ListIterator implements Iterator<ItemType> {
		private Node current = first;

		public boolean hasNext() {
			return current != null;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

		public ItemType next() {
			if (!hasNext())
				throw new NoSuchElementException();
			ItemType ItemType = current.ItemType;
			current = current.next;
			return ItemType;
		}
	}

	/**
	 * A test client.
	 */
	public static void main(String[] args) {
		GenericStack<String> s = new GenericStack<String>();
		s.push("achyut");
		s.push("paudel");
		System.out.println(s.pop());

	}
}
