package net.largepixels.examples;

import java.util.Properties;

/**
 * Created by minchuk on 7/15/15.
 */
public class SystemPropertyExample {

    public static void main(String[] args) {

        Properties p = System.getProperties();

        //add a system property like this...
        //java -Djohn.test="oh hai, i'm john" app

        //or like this
        p.setProperty("john.test2", "brahhhhhh");

        p.list(System.out);
    }
}
