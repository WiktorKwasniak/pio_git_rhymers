package edu.kis.vh.nursery.list;

public class Node {

	private final int value; // TODO: perhaps it would be good to have possibility to change value not only in constructor
	public Node prev, next;

	public Node(int i) {
		value = i;
	}

	public int getValue() {
		return value;
	}
	
}
