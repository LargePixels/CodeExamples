package net.largepixels.examples.threading.memorydumptest;

import java.util.Vector;

/**
 * Created by johnminchuk on 3/23/17.
 */
public class MemoryDumpExample {

    class ThreadA  implements Runnable {
        @Override
        public void run() {

            Vector vectorA = new Vector();
            for (int i = 0; i < 10000; i++) {
                byte b[] = new byte[1024];
                vectorA.add(b);
            }

            while (true) {
                //keep this thread around...
            }
        }
    }

    class ThreadB  implements Runnable {
        @Override
        public void run() {
            Vector vectorB = new Vector();
            for (int i = 0; i < 5000; i++) {
                byte b[] = new byte[1024];
                vectorB .add(b);
            }

            while (true) {
                //keep this thread around...
            }
        }
    }

    private void runMe() {
        Thread a = new Thread(new ThreadA());
        Thread b = new Thread(new ThreadB());

        a.start();
        b.start();

        while (true) {
            //keep this thread around...
        }
    }

    public static void main(String args[]) {
        MemoryDumpExample memoryDumpExample = new MemoryDumpExample();
        memoryDumpExample.runMe();
    }

}
