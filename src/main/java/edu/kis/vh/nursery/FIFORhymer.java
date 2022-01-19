package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    public defaultCountingOutRhymer temp = new defaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())

            temp.countIn(super.countOut());

        int restult = temp.countOut();

        while (!temp.callCheck())

            countIn(temp.countOut());

        return restult;
    }
}
//alt + <- i alt + -> przełączają pomiędzy otwartymi plikami w IDE