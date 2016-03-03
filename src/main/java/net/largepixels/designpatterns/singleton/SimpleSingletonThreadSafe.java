package net.largepixels.designpatterns.singleton;

/**
 * Created by johnminchuk on 3/1/16.
 *
 * This example of the singleton pattern is thread safe
 */
public class SimpleSingletonThreadSafe {

    private static SimpleSingletonThreadSafe instance = null;

    private void SimpleSingletonThreadSafe() {
        //just to protect
    }

    public static synchronized SimpleSingletonThreadSafe getInstance() {
        if (instance == null) {
            instance = new SimpleSingletonThreadSafe();
        }
        return  instance;
    }

}
