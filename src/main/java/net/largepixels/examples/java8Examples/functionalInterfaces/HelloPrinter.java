package net.largepixels.examples.java8Examples.functionalInterfaces;

public class HelloPrinter implements HelloMessage {

    HelloMessage helloMessage;

    public HelloPrinter(HelloMessage helloMessage) {
        this.helloMessage = helloMessage;
    }

    @Override
    public void sayHi() {
        helloMessage.sayHi();
    }

    public static void testIt(HelloMessage doit) {
        doit.sayHi();
    }
}