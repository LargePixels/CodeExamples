package net.largepixels.dailyCoding;

public class Dc07DecodeNumeric {

    public static void main(String[] args) {
        Dc07DecodeNumeric dc07DecodeNumeric = new Dc07DecodeNumeric();
        dc07DecodeNumeric.runMe();
    }

    /*
        Wasn't clear from the question that this was a string.  Much simple to solve then.
        My mind immediately drifted to returning all the different permutations, which is a
        harder problem to solve.  This is a fairly basic recursion problem when these are the
        circumstances.
     */
    private void runMe() {
        String ex1 = "111";

        System.out.println(numEncodings(ex1));
    }

    private int numEncodings(String s) {

        if (s.startsWith("0")) {
            return 0;
        }
        else if ( s.length() <= 1 ) {
            return 1;
        }

        int total = 0;

        if (Integer.valueOf(s.substring(0,2)) <= 26 ) {
            total += numEncodings(s.substring(2,s.length()));
        }

        total += numEncodings(s.substring(1,s.length()));

        return total;
    }
}
