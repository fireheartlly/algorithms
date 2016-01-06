package com.sui.datastructures;

import com.sui.datastructures.nodes.DoublyNode;

/**
 * Doubly link list class for creating doubly link list
 * 
 * @author Chunxia sui
 *
 */
public class DoublyLinkList<ItemType> {
	private DoublyNode<ItemType> head = null;
	private DoublyNode<ItemType> tail = null;
	private int length = 0;

	/**
	 * Method to get the current head value
	 * 
	 * @return
	 */
	public ItemType peek() {
		return head.value;
	}

	/**
	 * Method to get the current tail value
	 * 
	 * @return
	 */
	public ItemType rear() {
		return tail.value;
	}

	/**
	 * Method to add the node into head
	 * 
	 * @param node
	 *            node to be added
	 */
	public void addToHead(DoublyNode<ItemType> node) {
		if (head == null && tail == null) {
			head = node;
			tail = node;
		} else {
			node.next = head;
			head.prev = node;
			head = node;
		}
		length++;
	}

	/**
	 * Method to add the node to the tail
	 * 
	 * @param node1
	 *            node to be added
	 */
	public void addToTail(DoublyNode<ItemType> node1) {
		if (head == null && tail == null) {
			head = node1;
			tail = node1;
		} else {
			node1.prev = tail;
			tail.next = node1;
			tail = node1;
		}
		length++;
	}

	/**
	 * insert the node in certain given position
	 * 
	 * @param newNode
	 *            node to be added
	 * @param pos
	 *            position of the node to be added
	 * @throws Exception
	 */
	public void insert(DoublyNode<ItemType> newNode, int pos) throws Exception {
		if (pos < getLength()) {
			DoublyNode<ItemType> p = head;
			int temp = 0;
			for (temp = 0; temp < pos - 1; temp++) {
				p = p.next;
			}
			newNode.prev = p;
			newNode.next = p.next;
			p.next = newNode;
			p.next.next.prev = newNode;
			length++;
		} else {
			throw new Exception("Out of range!!");
		}
	}

	/**
	 * Method to get the current length of linklist
	 * 
	 * @return
	 */
	public int getLength() {
		return this.length;
	}

	/**
	 * Method to count number of nodes
	 * 
	 * @return
	 */

	public int countNode() {
		DoublyNode<ItemType> p = head;
		int count = 0;
		while (p != null) {
			count++;
			p = p.next;
		}
		return count;
	}

	/**
	 * Method to delete node from head;
	 * 
	 * @throws Exception
	 */
	public void deleteHead() throws Exception {
		DoublyNode<ItemType> p1;

		if (head == null && tail == null) {
			throw new Exception("can't delete");
		} else {
			p1 = head.next;
			p1.prev = null;
			head = p1;
			length--;
		}
	}

	/**
	 * Method to delete node from tail;
	 * 
	 * @throws Exception
	 */
	public void deleteTail() throws Exception {
		if (head == null && tail == null) {
			throw new Exception("can't delete");
		} else {
			DoublyNode<ItemType> q = tail.prev;
			q.next = null;
			tail = q;
			length--;
		}

	}

	/**
	 * Method to print all node in the Doublylist.
	 */
	public void printList() {
		DoublyNode<ItemType> p1 = head;
		while (p1 != null) {
			System.out.print(p1.value + "->");
			p1 = p1.next;
		}
		System.out.print(System.lineSeparator());
	}

	/**
	 * Method to delete nodes according given position.
	 * 
	 * @param pos
	 * @throws Exception
	 */
	public void deletePos(int pos) throws Exception {
		if (head == null && tail == null) {
			throw new Exception("can't delete");
		} else {
			if (pos < getLength()) {
				int temp = 0;
				DoublyNode<ItemType> q = head;
				for (temp = 0; temp < pos - 1; temp++) {
					q = q.next;
				}
				DoublyNode<ItemType> s = q.next.next;
				q.next = s;
				s.prev = q;

				// q = s.next.prev;
			}

			else {
				throw new Exception("out of range");
			}
		}
	}

	/**
	 * Method to get the value according given position.
	 * 
	 * @param pos
	 *            position to get the value
	 * @return the value in the given position
	 * @throws Exception
	 */
	public ItemType get(int pos) throws Exception {
		if (pos < getLength()) {
			DoublyNode<ItemType> p = head;
			for (int temp = 0; temp < pos; temp++) {
				p = p.next;
			}
			return p.value;
		} else {
			throw new Exception("Out of range");
		}
	}

	/**
	 * Method to search value inside a linklist.
	 * 
	 * @param num
	 *            value to be searched.
	 * @return position of the value if exist.
	 * @throws Exception
	 *             exception thrown when value doesnot exist in list
	 */
	public int searchValue(ItemType num) throws Exception {
		DoublyNode<ItemType> p = head;
		for (int i = 0; i < getLength(); i++) {
			if (p.value == num) {
				return i;
			}
			p = p.next;
		}
		throw new Exception("Search value not found");
	}

}
