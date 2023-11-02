package net.largepixels.examples;

/**
 * Created by johnminchuk on 2/16/16.
 *
 * Output:
 *  Dog name: Max
 *  Dog name: Fifi
 */
public class PassByTest {

    private void runMe() {
        Dog aDog = new Dog("Max");
        updateWithNewObject(aDog);
        System.out.println("Dog name: " + aDog.getName());

        Dog bDog = new Dog("Max");
        updateViaPointer(aDog);
        System.out.println("Dog name: " + aDog.getName());
    }

    public void updateWithNewObject(Dog d) {
        d = new Dog("Fifi");
    }

    public void updateViaPointer(Dog d) {
        d.setName("Fifi");
    }

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

    public static void main(String args[]) {
        PassByTest passByTest = new PassByTest();
        passByTest.runMe();
    }

}
