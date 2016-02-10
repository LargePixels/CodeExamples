package net.largepixels.examples;

import com.sun.tools.javac.jvm.Gen;

/**
 * Created by johnminchuk on 2/10/16.
 */
public class GrabDigitsTrick {

    private void runMe() {
        int value1 = 1234 % 10;
        System.out.println(value1);     // ten can go into 1234, 123 times with 4 left over

        int value2 = 1234 % 1000;
        System.out.println(value2);     // 1000 can go into 1234, 1 time with 234 left over
    }

    public static void main(String args[]) {
        GrabDigitsTrick grabDigitsTrick = new GrabDigitsTrick();
        grabDigitsTrick.runMe();
    }
}
