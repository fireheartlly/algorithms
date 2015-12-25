package com.sui.datastructures;

import com.sui.datastructures.nodes.SinglyNode;

public class SinglyList {
	SinglyNode singlyNode;
	SinglyNode head;
	SinglyNode tail;
	int length = 0;

	public void addinHead(SinglyNode singlyNode) {
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

	public void addinTail(SinglyNode singlyNodeTail) {
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

	public int getFirst() throws Exception {
		if (head != null) {
			return head.value;
		} else {
			throw new Exception("List is empty");

		}

	}

	public int getLast() throws Exception {
		if (tail != null) {
			return tail.value;
		} else {
			throw new Exception("List is empty");
		}

	}

	public int removeLast() throws Exception {
		if (tail != null) {
			SinglyNode temp;
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
			tail = new SinglyNode();
			tail = temp;

		} else {
			throw new Exception("List is empty");
		}
		return tail.value;

	}

	public int removeFirst() throws Exception {
		if (head != null) {
			int first = head.value;
			SinglyNode singlyNode = head.next;
			head = new SinglyNode();
			head = singlyNode;
			return first;

		} else {
			throw new Exception("List is empty");
		}

	}

}
