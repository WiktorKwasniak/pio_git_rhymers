package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int EMPTY_TOTAL = -1;
	private static final int TABLE_SIZE = 12;

	private static final int ERROR_CODE = -1;

	private int[] numbers = new int[TABLE_SIZE];

	private int total = EMPTY_TOTAL;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_TOTAL;
	}

	public boolean isFull() {
		return total == TABLE_SIZE - 1;
	}

	protected int peekaboo() {
		if (callCheck())
			return ERROR_CODE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return ERROR_CODE;
		return numbers[total--];
	}

}
