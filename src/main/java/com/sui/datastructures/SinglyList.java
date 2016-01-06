package com.sui.datastructures;

import com.sui.datastructures.nodes.SinglyNode;

public class SinglyList<Itemtype> {
	SinglyNode<Itemtype> singlyNode;
	SinglyNode<Itemtype> head;
	SinglyNode<Itemtype> tail;
	int length = 0;

	public void addinHead(SinglyNode<Itemtype> singlyNode) {
		if (head == null && tail == null) {
			head = singlyNode;
			tail = singlyNode;
			length++;
		} else {
			singlyNode.next = head;
			head = singlyNode;
			length++;
		}

	}

	public void addinTail(SinglyNode<Itemtype> singlyNodeTail) {
		if (tail == null && head == null) {

			tail = singlyNodeTail;
			head = singlyNodeTail;
			length++;

		} else {
			tail.next = singlyNodeTail;
			tail = singlyNodeTail;
			length++;
		}

	}

	public int getLength() {
		return length;
	}

	public Itemtype getFirst() throws Exception {
		if (head != null) {
			return head.value;
		} else {
			throw new Exception("List is empty");

		}

	}

	public Itemtype getLast() throws Exception {
		if (tail != null) {
			return tail.value;
		} else {
			throw new Exception("List is empty");
		}

	}

	public Itemtype removeLast() throws Exception {
		if (tail != null) {
			SinglyNode<Itemtype> temp;
			int i = 1;
			temp = head;
			while (i <= length - 1) {
				if (head != null)

				{

					temp = temp.next;
					i++;

				} else {

					throw new Exception("List is empty");

				}

			}
			tail = new SinglyNode<Itemtype>();
			tail = temp;

		} else {
			throw new Exception("List is empty");
		}
		return tail.value;

	}

	public Itemtype removeFirst() throws Exception {
		if (head != null) {
			Itemtype first = head.value;
			SinglyNode<Itemtype> singlyNode = head.next;
			head = new SinglyNode<Itemtype>();
			head = singlyNode;
			return first;

		} else {
			throw new Exception("List is empty");
		}

	}

}
