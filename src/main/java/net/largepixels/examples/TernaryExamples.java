package net.largepixels.examples;

import net.largepixels.interview.net.largepixels.pie.ch04.ch04ex01.Node;

/**
 * Created by johnminchuk on 2/10/16.
 */
public class TernaryExamples {

    private void runMe() {

        //result = testCondition ? value1 : value2

        int a = 12;
        int absValue = (a < 0) ? -a : a;

        Node n1 = new Node("a", null);
        Node n2 = (n1 == null) ? null : n1.next;

        String result = 1 > 2 ? "One greater than 2" : "One less than 2";

    }

    public static void main(String args[]) {
        TernaryExamples ternaryExamples = new TernaryExamples();
        ternaryExamples.runMe();
    }

}
