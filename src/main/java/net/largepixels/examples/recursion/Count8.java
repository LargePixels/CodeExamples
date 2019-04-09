package net.largepixels.examples.recursion;

import sun.jvm.hotspot.utilities.Assert;

/**
 * Created by johnminchuk on 4/8/19.
 */
public class Count8 {

    public static void main(String[] args) {
        Count8 count8 = new Count8();
        count8.runMe();
    }

    private void runMe() {
        int number1 = 8818;
        int number2 = 818;
        int number3 = 8118;
        int number4 = 888118;

        System.out.println(count8(number1));
        System.out.println(count8(number2));
        System.out.println(count8(number3));
        System.out.println(count8(number4));
    }

    private int count8(int n) {

        if (n < 10) {
            return (n == 8) ? 1 : 0;
        }

        int hold = n % 10;
        int pass = n / 10;

        int count = (hold == 8) ? 1 : 0;

        if (pass % 10 == 8 && hold == 8 ) {
            count++;
        }

        return count + count8(pass);

    }


}
