package net.largepixels.examples;

import java.util.ArrayList;
import java.util.List;

public class IfTest {

    public static void main(String[] args) {
//        Boolean a = true;
//        Boolean b = true;
//
//        if (a) {
//            System.out.println("A");
//        } else if (a && b) {
//            System.out.println("A and B");
//        }

//        int a = 2437;
//        int b = 875;
//
//        int x = a;
//        int y = b;
//
//        while ( x != y ) {
//            if (x > y ) {
//                x = x-y;
//            }
//            if (x < y) {
//                y = y-x;
//            }
//
//        }
//
//        System.out.println(x);

//        IfTest asdf = new IfTest();
//        int a = 123;
//        asdf.doIt(a);
//        System.out.println(a);

        int n = 6;
        List<Integer> bad = new ArrayList<>();
        int lower = 12;
        int upper = 38;


//        bad.add(37);
//        bad.add(7);
//        bad.add(22);
//        bad.add(15);
//        bad.add(49);
//        bad.add(60);

        bad.add(48);
        bad.add(14);
        bad.add(33);
        bad.add(11);
        bad.add(17);
        bad.add(50);
        bad.add(25);

        List<List> holdem = new ArrayList<>();


        int output = goodSegment(bad, lower, upper);
        System.out.println("biggest we found is: " + output);
    }

    private void doIt(int a) {
        a = 321;
    }


    public static int goodSegment(List<Integer> badNumbers, int lower, int upper) {

        if (badNumbers == null) {
            return upper - lower;
        }

        int biggestSoFar = 0;
        int currentCount = 0;

        for (int i = lower; i <= upper; i++ ) {

            System.out.println("were on " + i);

            if (badNumbers.contains(i)) {

                System.out.println("HIT " + i);

                //currentCount++;

                System.out.println("current count " + currentCount);

                if (biggestSoFar < currentCount) {
                    biggestSoFar = currentCount;
                    System.out.println("the biggest so far is " + biggestSoFar);

                }
                currentCount = 0;
            }
            else {
                currentCount++;
            }
        }

        if (biggestSoFar < currentCount) {
            biggestSoFar = currentCount;
            System.out.println("the biggest so far is " + biggestSoFar);

        }

        return biggestSoFar;
    }



}
