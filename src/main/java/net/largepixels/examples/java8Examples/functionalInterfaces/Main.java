package net.largepixels.examples.java8Examples.functionalInterfaces;

/**
 * Created by johnminchuk on 3/23/16.
 */
public class Main {

    private void runMe() {

        //old way of running threads..

        Thread a = new Thread(new Runnable(){
            public void run() {
                System.out.println("Starting a thread, ahhhhh the good old days");
            }
        });

        //runnable has always had only one method to implement, let's do that here...

        Thread b = new Thread(
                () -> System.out.println("Thread started with a lambda expression")
        );

        //Old way using anonymous inner class

        HelloMessage hello1 = new HelloMessage(){
            public void sayHi(){
                System.out.println("How do you do, good sir?");
            }
        };

        hello1.sayHi();

        //Using lambda expression

        HelloMessage hello2 = () -> System.out.println("Whaaaaa'd up bro?");
        hello2.sayHi();

        //Pass a unit of functionality into a class

        HelloPrinter sayHello = new HelloPrinter(
                () -> System.out.println("Bro, this how we do it")
        );

        sayHello.sayHi();

        HelloPrinter.testIt(() -> System.out.printf("Brahhhhhhh...."));

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.runMe();
    }

}
