package com.sui.datastructures;

import com.sui.datastructures.nodes.DoublyNode;

/**
 * Doubly link list class for creating doubly link list
 * @author heary
 *
 */
public class DoublyLinkList {
	private DoublyNode head=null;
	private DoublyNode tail=null;
	private int length=0;
	
	/**
	 * Method to get the current head value
	 * @return
	 */
	public int peek(){
		return head.value;
	}
	
	/**
	 * Method to get the current tail value
	 * @return
	 */
	public int rear(){
		return tail.value;
	}
	
	/**
	 * Method to add the node into head
	 * @param node node to be added
	 */
	public void addToHead(DoublyNode node){
		if(head== null && tail==null){
			head=node;
			tail=node;
		}
		else{
			node.next=head;
			head.prev=node;
			head=node;
		}
		length++;
	}
	
	/**
	 * Method to add the node to the tail
	 * @param node1 node to be added
	 */
	public void addToTail(DoublyNode node1){
		if(head==null&&tail==null){
			head=node1;
			tail=node1;
		}
		else{
			node1.prev=tail;
			tail.next =node1;
			tail=node1;
		}
		length++;
	}
	
	/**
	 * insert the node in certain given position
	 * @param newNode node to be added 
	 * @param pos position of the node to be added
	 * @throws Exception
	 */
	public void insert(DoublyNode newNode,int pos) throws Exception{
		if(pos<getLength()){
			DoublyNode p = head;
			int temp = 0;
			for(temp=0;temp<pos-1;temp++){
				p = p.next;
			}
			newNode.prev = p;
			newNode.next = p.next;
			p.next = newNode;
			p.next.next.prev=newNode;
			length++;	
		}
		else{
			throw new Exception("Out of range!!");
		}
	}
	

	/**
	 * Method to get the current length of linklist
	 * @return
	 */
	public int getLength(){
		return this.length;
	}
		
}
