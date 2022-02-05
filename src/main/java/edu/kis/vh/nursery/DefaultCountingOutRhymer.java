package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int DEFAULT_VALUE = -1;
    private static final int MAX_SIZE = 12;
    private static final int MAX_ITERATION = 11;
    private static final int EMPTY_RHYMER_VALUE = -1;
    private final int[] numbers = new int[MAX_SIZE];

    private int total = EMPTY_RHYMER_VALUE;

    public void countIn(final int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_VALUE;
    }

    public boolean isFull() {
        return total == MAX_ITERATION;
    }

    protected int getNumbers() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

}
