package net.largepixels.examples;

/**
 * Created by johnminchuk on 2/16/16.
 */
public class PassByAutoboxed {

    class Something {
        String value;
        public Something(String v) {
            value = v;
        }
    }

    private void runMe() {

        Something test0 = new Something("asdf");
        updateTest(test0);
        System.out.println("test1 is: " + test0.value);

        String test1 = "asdf";
        updateTest(test1);
        System.out.println("test1 is: " + test1);

        Boolean test2 = false;
        updateTest(test2);
        System.out.println("test2 is: " + test2);

        Character test3 = 'a';
        updateTest(test3);
        System.out.println("test3 is: " + test3);
    }

    private void updateTest(Something test0) {
        test0.value = "qwer";
    }

    private void updateTest(Character test3) {
        test3 = 'b';
    }

    private void updateTest(String test1) {
        test1 = "qwer";
    }

    private void updateTest(Boolean test) {
        test = true;
    }

    public static void main(String args[]) {
        PassByAutoboxed passByAutoboxed = new PassByAutoboxed();
        passByAutoboxed.runMe();
    }

}
