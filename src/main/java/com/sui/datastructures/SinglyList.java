package com.sui.datastructures;

import com.sui.datastructures.nodes.SinglyNode;

public class SinglyList<Itemtype extends Comparable<?>> {
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
			if(getLength()==1){
				head = head.next;
				tail = tail.next;
			}
			else{
				head = head.next;	
			}
			length--;
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

	public void increaseLength(int len){
		length+=len;
	}
	
	public void decreaseLength(int len){
		length-=len;
	}
	
	
	public boolean isEmpty(){
		return head==null&&tail==null;
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
	
	/**
	 * Method to print the list
	 * @return
	 */
	public String printList(){
		String str = String.valueOf(head.value) ;
		SinglyNode<Itemtype> curr = head.next;
		while (curr != null) {
			str += "->" + curr.value;
			curr = curr.next;
		}
		str += "->/";
		return str;
	
	}
	
	public String printList(SinglyNode<Itemtype> head){
		String str = String.valueOf(head.value) ;
		SinglyNode<Itemtype> curr = head.next;
		while (curr != null) {
			str += "->" + curr.value;
			curr = curr.next;
		}
		str += "->/";
		return str;
	
	}
	
	public Itemtype[] toArray(){
		//Itemtype[] arr = new Itemtype[length];
		Object[] arr = new Object[5];
		
		
		return null;
	}
	
	
}
