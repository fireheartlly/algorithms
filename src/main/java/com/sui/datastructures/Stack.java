package com.sui.datastructures;
/**
 * This is a stack class that has general functions for the stack.
 * @author heary
 *
 */
public class Stack {
	
	int[] arr;/* arr varibale to store the array for the stack */
	
	int top =-1 ; // used to return current position of the top
	
	int len = -1; // stores the length of the stack

	/**
	 * This constructor is used to initialize stack with given stack size
	 * @param lengthOfStack	length of stack that has to be initialized
	 */
	public Stack(int lengthOfStack){
		arr = new int[lengthOfStack];
		len = lengthOfStack;
	}
	
	/**
	 * Method used to put data into the stack
	 * @param num	element to be pushed into the stack
	 * @throws Exception Exception thrown when stack is full.
	 */
	public void push(int num) throws Exception{
		
		//Checking if the stack is full
		if(isFull()){
			throw new Exception("Stack already full");
		}
		else{
			top = top+1;
			arr[top] = num;	
		}
		
	}
	
	
	/**
	 * Method to return the topmost element from the stack
	 * @return the number which is in the top of the stack
	 * @throws Exception
	 */
	public int pop() throws Exception{
		
		// Checking if the stack is empty
		if(isEmpty()){
			throw new Exception("Stack empty");
		} 
		return arr[top--];
		
	}
	
	/**
	 * Method to return current value on the top of the stack.
	 * @return
	 */
	public int peek(){
		return arr[top];
	}
	
	/**
	 * This method is used to return the length of the stack.
	 * @return
	 */
	public int lengthOfStack(){
		return len;
	}
	
	/**
	 * Method to check if the stack is empty
	 * @return
	 */
	public boolean isEmpty(){
		if(top==-1){
			return true;
		}
		return false;
	}
	
	/**
	 * This method is used to determine if the stack is full.
	 * @return
	 */
	public boolean isFull() {
		if(top==len-1){
			return true;
		}
		return false;
	}
	

}