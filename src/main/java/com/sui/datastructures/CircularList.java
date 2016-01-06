package com.sui.datastructures;

import com.sui.datastructures.nodes.SinglyNode;

public class CircularList<Itemtype> {

	SinglyNode<Itemtype> head = null;
	SinglyNode<Itemtype> tail = null;
	int nodeCount = 0;
	
	
	public void addNodeToHead(SinglyNode<Itemtype> item){
		if(head==null && tail==null){
			head = item;
			tail = item;
		}
		else{
			tail.next = item;
			item.next = head;
			head = item;
			nodeCount++;
		}
	}
	
	public void addNodeToTail(SinglyNode<Itemtype> item){
		if(head==null && tail==null){
			head = item;
			tail = item;
		}
		else{
			tail.next = item;
			item.next = head;
			tail = item;
			nodeCount++;
		}
	}
	
	public void addNodeToList(SinglyNode<Itemtype> item, int position) throws Exception{
		if(position>getCount()-1){
			throw new Exception("Invalid position to add node into the list.");
		}
		else{
			if(head==null && tail==null){
				head = item;
				tail = item;
			}
			else{
				int temp = 0;
				SinglyNode<Itemtype> curr = head;
				while(temp<position){
					curr = curr.next;
				}
				item.next = curr.next;
				curr.next = item;
				nodeCount++;
			}	
		}
	}
	
	@Override
	public String toString() {
		String str = "";
		SinglyNode<Itemtype> curr = head;
		while(curr.next!=head){
			str +=curr.value+"->";
		}
		str+="/";
		return str;
	}
	
	public int getCount(){
		return nodeCount;
	}
	
}
