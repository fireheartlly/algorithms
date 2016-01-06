package com.sui.datastructures;

/**
 * this is a queue class that has general functions for the queue;
 * 
 * @author heary
 *
 */
public class StaticQueue {

	int arr[];/* arr used to store array for the queue */
	int front = -1; // used to return current position of the front;
	int tail = -1; // used to return current position of the tail;
	int len = -1; // used to return the length of the queue;

	/**
	 * This constructor used to initialize queue with given queue size;
	 * 
	 * @param lengthOfQueue
	 *            length of queue has been initialized;
	 */
	public StaticQueue(int lengthOfQueue) {
		arr = new int[lengthOfQueue];
		len = lengthOfQueue;

	}

	/**
	 * This method is used to return the length of queue;
	 * 
	 * @return the length of the queue;
	 */
	public int lengthOfQueue() {
		return len;
	}

	/**
	 * This method is used to check the Queue empty or not;
	 * 
	 * @return
	 */
	public boolean queueIsempty() {
		if (front == tail) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This method is used to add the num to the queue;
	 * @param num
	 * @throws Exception
	 */
	public void enQueue(int num) throws Exception {
		/* check if the queue is full */
		if (queueIsfull()) {
			throw new Exception("the Queue is full,can't enqueue");
		} else {
			arr[++tail] = num;
		}
	}

	/**
	 * this method is used to check the queue is full or not;
	 * 
	 * @return
	 */
	public boolean queueIsfull() {
		if (tail == len - 1) {
			return true;

		}
		return false;
	}

	/**
	 * this method is used to delete a num from the queue;
	 * 
	 * @return
	 * @throws Exception
	 */
	public int deQueue() throws Exception {
		/* check the queue is empty */
		if (queueIsempty()) {
			throw new Exception("the queue is empty,can't dequeue");
		} else {
			return arr[++front];
		}

	}

}
