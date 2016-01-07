package com.sui.datastructures;

import com.sui.datastructures.nodes.SinglyNode;

/**
 * Circular Link list implementation
 * @author achyut
 *
 * @param <Itemtype> Generic type of item
 */
public class CircularList<Itemtype> {
	
	SinglyNode<Itemtype> head = null;
	SinglyNode<Itemtype> tail = null;
	int nodeCount = 0;

	/**
	 * Method to add the node to the head of the link list
	 * @param item
	 */
	public void addNodeToHead(SinglyNode<Itemtype> item) {
		if (isEmpty()) {
			head = item;
			tail = item;
			tail.next = head;
		} else {
			tail.next = item;
			item.next = head;
			head = item;
		}
		nodeCount++;
	}

	/**
	 * Method to add the node to the tail of the link list
	 * @param item
	 */
	public void addNodeToTail(SinglyNode<Itemtype> item) {
		if (isEmpty()) {
			head = item;
			tail = item;
			tail.next = head;
		} else {
			tail.next = item;
			item.next = head;
			tail = item;
		}
		nodeCount++;
	}

	/**
	 * Method to add the node into the nth position of the link list
	 * @param item
	 * @param position
	 * @throws Exception
	 */
	public void addNodeToList(SinglyNode<Itemtype> item, int position) throws Exception {

		if (getCount() != 0 && position > getCount()) {
			throw new Exception("Invalid position to add node into the list.");
		} else {
			if (isEmpty()) {
				head = item;
				tail = item;
				tail.next = head;
			} else {
				int temp = 1;
				SinglyNode<Itemtype> curr = head;
				while (temp < position) {
					curr = curr.next;
					temp++;
				}
				item.next = curr.next;
				curr.next = item;
			}
			nodeCount++;
		}
	}

	@Override
	public String toString() {
		String str = (String) head.value;
		SinglyNode<Itemtype> curr = head.next;
		while (curr != head) {
			str += "->" + curr.value;
			curr = curr.next;
		}
		str += "->/";
		return str;
	}

	/**
	 * Method to print the list
	 */
	public String printList() {
		String str = "";
		SinglyNode<Itemtype> curr = head;
		for (int i = 0; i < getCount(); i++) {
			str += curr.value + "->";
			curr = curr.next;
		}
		str += "/";
		return str;
	}

	/**
	 * Method to get the length of the list
	 * @return
	 */
	public int getLength() {
		int count = 0;
		if (!isEmpty()) {
			SinglyNode<Itemtype> curr = head;
			do {
				++count;
				curr = curr.next;
			} while (curr != head);
		}
		return count;
	}

	/**
	 * Method to get the count of nodes in the list
	 * @return
	 */
	public int getCount() {
		return nodeCount;
	}

	/**
	 * Method to get the head value of the list
	 * @return
	 */
	public Itemtype peek() {
		return head.value;
	}

	/**
	 * Method to get the tail value of the list
	 * @return
	 */
	public Itemtype rpeek() {
		return tail.value;
	}

	/**
	 * Method to search an item in the list
	 * @param item
	 * @return
	 */
	public boolean search(Itemtype item) {
		if (isEmpty()) {
			return false;
		} else {
			SinglyNode<Itemtype> curr = head;
			do {
				if (curr.value == item) {
					return true;
				}
				curr = curr.next;
			} while (curr != head);
			return false;
		}

	}

	/**
	 * Method to remove item from the head of the list
	 * @throws Exception
	 */
	public void removeFromHead() throws Exception {
		if (isEmpty()) {
			throw new Exception("Empty list. Cannot remove from head");
		} else {
			head = head.next;
			tail.next = head;
			nodeCount--;
		}
	}

	/**
	 * Method to remove the item at ith position of the list
	 * @param i
	 * @throws Exception
	 */
	public void remove(int i) throws Exception {
		if (isEmpty()) {
			throw new Exception("Empty list. Cannot remove from tail");
		} else if (i < 1 || i > getCount()) {
			throw new Exception("Index out of range of the list");
		} else if (i == 1) {
			head = head.next;
			tail.next = head;
			nodeCount--;
		} else {
			int tempCount = 1;
			SinglyNode<Itemtype> curr = head;
			while (tempCount < i - 1) {
				tempCount++;
				curr = curr.next;
			}
			if (i == getCount()) {
				tail = curr;
			}
			curr.next = curr.next.next;
			nodeCount--;
		}
	}

	/**
	 * Method to remove the element from the tail of the list
	 * @throws Exception
	 */
	public void removeFromTail() throws Exception {
		remove(getCount());
	}

	/**
	 * Method to check if the list is empty
	 * @return
	 */
	public boolean isEmpty() {
		return head == null && tail == null;
	}

	/**
	 * Method to remove the nodes having the given value
	 * @param value
	 * @throws Exception
	 */
	public void removeByValue(Itemtype value) throws Exception {
		if (isEmpty()) {
			throw new Exception("Empty list. Cannot remove " + value + " from the list");
		} else {
			SinglyNode<Itemtype> curr = head;
			SinglyNode<Itemtype> curr2 = head.next;
			if (value == head.value) {
				tail.next = curr2;
				head = curr2;
				nodeCount--;
			}
			do {
				if (curr2.value == value) {
					if (curr2 == tail) {
						tail = curr;
					}
					curr.next = curr2.next;
					curr2 = curr2.next;
					nodeCount--;
					continue;
				} else {
					curr = curr2;
					curr2 = curr2.next;
				}
			} while (curr2 != head);
			tail.next = head;
		}
	}

	/**
	 * Method to get the item at the ith position of the list
	 * @param i
	 * @return
	 * @throws Exception
	 */
	public Itemtype get(int i) throws Exception {
		if (isEmpty()) {
			throw new Exception("Empty list. Cannot return " + i + "th value from the list.");
		} else if (i < 1 || i > getCount()) {
			throw new Exception("Cannot return value of position " + i + " since position is out of range.");
		} else {
			int tempCount = 0;
			SinglyNode<Itemtype> curr = head;
			while (tempCount < i - 1) {
				curr = curr.next;
				tempCount++;
			}
			return curr.value;
		}
	}

}
