package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        /*
            If (numberToGoUntil is less than toBreakWith)
                1. we need to write "iterating till the end"
                2. then print all numbers till the numberToGoUntil
            OTHERWISE: ////numberToGoUntil is NOT less than toBreakWith
                1. print all numbers till the toBreakWith
         */
        if (numberToGoUntil < toBreakWith) {
            System.out.println("iterating till the end");
        }
        for (int i = 1; i <= numberToGoUntil; i++) {
            System.out.printf("%d\n", i);
            if (i == toBreakWith) {
                break;
            }
        }
    }

}




