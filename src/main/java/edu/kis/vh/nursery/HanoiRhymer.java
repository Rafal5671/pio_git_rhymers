package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    public static final int INITIAL_ZERO = 0;
    private int totalRejected = INITIAL_ZERO;

    public int reportRejected() {
        return totalRejected;
    }
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }

}
