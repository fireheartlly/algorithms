package com.sui.datastructures;

import com.sui.datastructures.nodes.SinglyNode;

public class SinglyList<Itemtype> {
	private SinglyNode<Itemtype> head;
	private SinglyNode<Itemtype> tail;
	int length = 0;

	public void addInHead(SinglyNode<Itemtype> singlyNode) {
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

	public void addInHead(Itemtype item){
		SinglyNode<Itemtype> node = new SinglyNode<Itemtype>(item);
		addInHead(node);
	}
	
	public void addInTail(SinglyNode<Itemtype> singlyNodeTail) {
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

	public void addInTail(Itemtype item){
		SinglyNode<Itemtype> node = new SinglyNode<Itemtype>(item);
		addInTail(node);
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
			Itemtype val = null;
			if(head==tail){
				val = head.value;
				head = null;
				tail = null;
			}
			else{
				SinglyNode<Itemtype> temp = head;
				while(temp.next.next!=null){
					temp = temp.next;
				}
				val = temp.next.value;
				temp.next = null;
				tail = temp;
				
			}
			length--;
			return val;
		} else {
			throw new Exception("List is empty");
		}
	}

	public Itemtype removeFirst() throws Exception {
		if (head != null) {
			Itemtype first = head.value;
			head = head.next;
			return first;
		} else {
			throw new Exception("List is empty");
		}

	}

	public Itemtype peek() {
		return head.value;
	}

	public Itemtype tailpeek() {
		return tail.value;
	}

	public SinglyNode<Itemtype> getHead() {
		return head;
	}

	public void setHead(SinglyNode<Itemtype> head) {
		this.head = head;
	}

	public SinglyNode<Itemtype> getTail() {
		return tail;
	}

	public void setTail(SinglyNode<Itemtype> tail) {
		this.tail = tail;
	}

	@Override
	public String toString() {
		int tempcount = 0;
		String str = "";
		SinglyNode<Itemtype> curr = head;
		while(tempcount<length){
			str+=curr.value+"->";
			curr = curr.next;
			tempcount++;
		}
		str+="/";
		return str;
	}
}
