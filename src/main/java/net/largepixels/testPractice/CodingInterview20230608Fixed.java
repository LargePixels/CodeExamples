package net.largepixels.testPractice;

/*
 * Click `Run` to execute the snippet below!
 */

import java.util.ArrayList;
import java.util.HashMap;

//
//  Online auction graph display
//  x axis is time
//  y axis is price
//
//  Given a two-dimension array graph the price over time
//
//     +-----+-----+-----+-----+-----+-----+
//     +                             *     +
//     +                                   +
//     +                       *           +
//   $ +                                   +
//     +                                   +
//     +           *                       +
//     +     *                             +
//     +                 *                 +
//     +-----+-----+-----+-----+-----+-----+
//                time
//
//   max x = 5
//   max y = 8
//   data = { { 1, 2}, {2, 3}, {3, 1}, {4, 6}, {5, 8} }


class CodingInterview20230608Fixed {


    HashMap<Integer, ArrayList<Integer>> dataPoints = new HashMap<Integer,ArrayList<Integer>>();

    int maxX;
    int maxY;
    int[][] data;

    public void runMe() {

        maxX = 5;
        maxY = 8;

        int[][] inputData = { { 1, 2}, {2, 3}, {3, 1}, {4, 6}, {5, 8} };
        data = inputData;

        populateDataStructure();

        printIt();







    }

    public void printIt() {

        printTopLine();

        for (int y = maxY; y > 0; y--) {
            System.out.print("+     ");

            ArrayList<Integer> pointsToPrint = dataPoints.get(y);

            for (int x = 0; x < maxX - 1; x++) {
                if (pointsToPrint.get(x) != null ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                System.out.print("     ");

            }




            //System.out.println("You are on row y" + y);

        }




    }

    public void printTopLine() {
        System.out.print("+-----");
        for (int i = 0; i < maxX; i++) {
            System.out.print("+-----");
        }
        System.out.println("+");
    }

    public void populateDataStructure() {
        for (int i = 0; i < data.length; i++ ) {
            System.out.println("You are on element : " + i);

            ArrayList<Integer> xValues = new ArrayList<>();
            xValues.add(data[i][0]);

            dataPoints.put(data[i][1], xValues);
        }
    }

    public static void main(String[] args) {

        CodingInterview20230608Fixed codingInterview20230608 = new CodingInterview20230608Fixed();
        codingInterview20230608.runMe();

    }

}
