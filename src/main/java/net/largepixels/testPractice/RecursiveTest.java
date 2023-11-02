package net.largepixels.testPractice;

public class RecursiveTest {

    public static void main(String[] args) {
        RecursiveTest recursiveTest = new RecursiveTest();
        recursiveTest.runMe();
    }

    private void runMe() {

        Counter counter = new Counter();
        counter.count = 7;

        countDown(counter);
    }

    private void countDown(Counter counter) {
        if (counter.count == 0) {
            System.out.println("were done!");
            return;
        }

        System.out.println("Count is... " + counter.count);
        counter.count--;

        countDown(counter);
    }

    private class Counter {
        public int count;
    }

}
