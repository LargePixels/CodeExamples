package net.largepixels.examples;

/**
 * Created by johnminchuk on 2/16/16.
 */
public class PassByTest {

    private class Dog {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        String name;

        public Dog(String n) {
            name = n;
        }
    }

    private void runMe() {
        Dog aDog = new Dog("Max");
        foo(aDog);

        if (aDog.getName().equals("Max")) { //true
            System.out.println( "Java passes by value." );

        } else if (aDog.getName().equals("Fifi")) {
            System.out.println( "Java passes by reference." );
        }
    }

    public void foo(Dog d) {
        d.getName().equals("Max"); // true

        d = new Dog("Fifi");
        d.getName().equals("Fifi"); // true
    }

    public static void main(String args[]) {
        PassByTest passByTest = new PassByTest();
        passByTest.runMe();
    }
}
