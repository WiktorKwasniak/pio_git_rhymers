package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int ERROR_CODE = -1;
	Node last;
	private int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return ERROR_CODE;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return ERROR_CODE;
		int ret = last.getValue();
		last = last.prev;
		return ret;
	}

	int getI() {
		return i;
	}

	void setI(int i) {
		this.i = i;
	}

}
