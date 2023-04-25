package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int SIZE_OF_TAB = 12;
    public static final int STARTING_TOTAL_VALUE = -1;
    public static final int FULL_INT_TAB = 11;
    private final int[] NUMBERS = new int[SIZE_OF_TAB];

    public int getTotal() {
        return total;
    }

    private int total = STARTING_TOTAL_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == STARTING_TOTAL_VALUE;
    }

    public boolean isFull() {
        return total == FULL_INT_TAB;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

}
