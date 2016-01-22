package com.sui.datastructures.nodes;

/**
 * Tree node for tree structure
 * @author heary
 *
 */
public class TreeNode<ItemType extends Comparable<?>> extends Node<ItemType> implements Comparable<ItemType>{
	
	//Stores pointer to left child
	private TreeNode<ItemType> left;
	
	//Stores pointer to right child
	TreeNode<ItemType> right;
	
	public TreeNode(ItemType val) {
		this.value = val;
	}

	public TreeNode<ItemType> getLeft() {
		return left;
	}

	public void setLeft(TreeNode<ItemType> left) {
		this.left = left;
	}

	public TreeNode<ItemType> getRight() {
		return right;
	}

	public void setRight(TreeNode<ItemType> right) {
		this.right = right;
	}
	
	@Override
	public String toString() {
		return this.value+" ";
	}

	public int compareTo(ItemType o) {
		return 0;
	}
}
