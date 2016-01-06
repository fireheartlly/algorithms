package com.sui.datastructures.nodes;

/**
 * Tree node for tree structure
 * @author heary
 *
 */
public class TreeNode<ItemType> extends Node<ItemType>{
	
	//Stores pointer to left child
	TreeNode<ItemType> left;
	
	//Stores pointer to right child
	TreeNode<ItemType> right;
}
