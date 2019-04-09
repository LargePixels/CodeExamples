package net.largepixels.examples.recursion;

/**
 * Created by johnminchuk on 4/8/19.
 */
public class Triangle {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.runMe();
    }

    private void runMe() {

        System.out.println(triangle(0));
        System.out.println(triangle(1));
        System.out.println(triangle(2));
        System.out.println(triangle(3));
        System.out.println(triangle(4));
        System.out.println(triangle(5));

    }

    private int triangle(int rows) {

//        if (rows == 1) {
//            return 1;
//        }

        if (rows == 0 ) {
            return 0;
        }

        return rows + triangle(rows - 1);
    }

}



/*

o o o
 o o
  o


     o                  n = 1, t = 1
    o o                 n = 2, t = 3
   o o o                n = 3, t = 6
  o o o o               n = 4, t = 10
 o o o o o              n = 5, t = 15
o o o o o o
 */