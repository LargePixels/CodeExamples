package net.largepixels.examples.recursion;

/**
 * Created by johnminchuk on 4/9/19.
 *
 * Given a string, compute recursively the number of times
 * lowercase "hi" appears in the string, however do not
 * count "hi" that have an 'x' immedately before them.
 */
public class CountHi2 {

    public static void main(String[] args) {
        CountHi2 countHi2 = new CountHi2();
        countHi2.runMe();
    }

    private void runMe() {
        //countHi2("ahixhi") → 1
        //countHi2("ahibhi") → 2
        //countHi2("xhixhi") → 0

        String ex1 = "ahixhi";
        String ex2 = "ahibhi";
        String ex3 = "xhixhi";

        System.out.println(countHi2(ex1));
        System.out.println(countHi2(ex2));
        System.out.println(countHi2(ex3));
    }

    // base case (length < 2) return 0
    // hicount = 0
    // startnext will be +1
    // if its an x, look for a hi (length check)
    // if you found hi startnext+2 and hicount+2
    // if not an x look for hi (length check)
    // if you found startnext+1 and hicount +1
    //

    public int countHi2(String str) {

        int count = 0;
        int i = 0;

        if (str.length() <= 1) {
            return 0;
        }

        if (str.length() >= 3) {
            if (str.substring(0,3).equals("xhi")) {
                i += 2;
            }
        }

        if (str.length() >=2) {
            if(str.substring(0,2).equals("hi")) {
                count++;
                i++;
            }
        }

        i++;

        return count + countHi2(str.substring(i, str.length()));

    }

}
