package net.largepixels.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minchuk on 7/15/15.
 */
public class StaticTests {

    public static String test1() {
        List<String> a = new ArrayList<String>();

        String asdf = "asdf";

        a.add(asdf);

        asdf = "qwer";

        return asdf;
    }

    // arraylist a stays in memory until s1 is delete
    public static void main(String[] args) {
        String s1 = StaticTests.test1();

        String s2 = StaticTests.test1();

    }

}
