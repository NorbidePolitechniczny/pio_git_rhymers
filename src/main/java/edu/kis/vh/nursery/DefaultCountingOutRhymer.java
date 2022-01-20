package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INT = -1;
    public static final int INT1 = 12;
    public static final int INT2 = 11;
    private final int[] numbers = new int[INT1];

    private int total = INT;
    public int getTotal() {
        return total;
    }


    public void countIn(int in) {
        if (!isFull())
            this.numbers[++total] = in;
    }

    public boolean callCheck() {
        return getTotal() == INT;
    }

    public boolean isFull() {
        return getTotal() == INT2;
    }

    protected int getNumbers() {
        if (callCheck())
            return INT;
        return this.numbers[getTotal()];
    }

    public int countOut() {
        if (callCheck())
            return INT;
        return this.numbers[total--];
    }

}
