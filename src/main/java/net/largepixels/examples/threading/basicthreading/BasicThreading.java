package net.largepixels.examples.threading.basicthreading;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by johnminchuk on 3/23/17.
 */
public class BasicThreading {

    class ThreadA  implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("Thread A!");
            }
        }
    }

    class ThreadB  implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("Thread B!");
            }
        }
    }

    private void runMe() {
        Thread a = new Thread(new ThreadA());
        Thread b = new Thread(new ThreadB());

        a.start();
        b.start();

        while (true) {
            System.out.println("Thread Main!");
        }
    }


    public static void main(String args[]) {
        BasicThreading basicThreading = new BasicThreading();
        basicThreading.runMe();
    }

}
