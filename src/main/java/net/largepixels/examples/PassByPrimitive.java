package net.largepixels.examples;

/**
 * Created by johnminchuk on 2/24/16.
 */
public class PassByPrimitive {

    private void runMe() {
        int a = 123;

        System.out.println(a);
    }

    private void updateIt(int value) {
        value = 321;
    }

    public static void main(String args[]) {
        PassByPrimitive passByPrimitive = new PassByPrimitive();
        passByPrimitive.runMe();
    }
}
