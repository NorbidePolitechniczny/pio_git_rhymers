package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int DEFAULT_VALUE = -1;
    public static final int MAX_SIZE = 12;
    public static final int MAX_ITERATION = 11;
    public static final int EMPTY_RHYMER_VALUE = -1;
    private final int[] numbers = new int[MAX_SIZE];

    public int total = EMPTY_RHYMER_VALUE;

    public void countIn(int in) {
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
