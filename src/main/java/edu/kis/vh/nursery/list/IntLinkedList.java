package edu.kis.vh.nursery.list;

/**
 * @author wiktorkwasniak
 * linked list class
 */
public class IntLinkedList {

	private static final int ERROR_CODE = -1;
	Node last;
	private int i; // TODO: change name to be more informative

	// Push new node to the list
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	// Check if list is empty
	public boolean isEmpty() {
		return last == null;
	}

	// Check if list is full
	public boolean isFull() {
		return false;
	}

	// Get top node`s value
	public int top() {
		if (isEmpty())
			return ERROR_CODE;
		return last.getValue();
	}

	// Remove top node from the list
	public int pop() {
		if (isEmpty())
			return ERROR_CODE;
		int ret = last.getValue();
		last = last.prev;
		return ret;
	}

	// Get value of I
	int getI() {
		return i;
	}

}
