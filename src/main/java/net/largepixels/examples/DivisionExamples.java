package net.largepixels.examples;

/**
 * Created by johnminchuk on 2/8/16.
 */
public class DivisionExamples {

    /**
     * demonstrate that integer math always rounds own, use modulus for the remainder
     */
    private void runMe() {

        //1.6
        System.out.println("5 / 3 = " + (5 / 3));

        //0.6
        System.out.println("3 / 5 = " + (3 / 5));

        //1 time with 2 left over
        System.out.println("5 % 3 = " + ( 5 % 3));

        //0 times with 3 left over
        System.out.println("3 % 5 = " + ( 3 % 5));
    }

    /*
    output:
        5 / 3 = 1
        3 / 5 = 0
        5 % 3 = 2
        5 % 3 = 3
     */

    public static void main(String args[]) {
        DivisionExamples divisionExamples = new DivisionExamples();
        divisionExamples.runMe();
    }

}
