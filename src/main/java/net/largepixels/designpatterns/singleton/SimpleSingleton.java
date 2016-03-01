package net.largepixels.designpatterns.singleton;

/**
 * Created by johnminchuk on 3/1/16.
 *
 * This example is not thread safe
 */
public class SimpleSingleton {

    private static SimpleSingleton instance = null;

    private void SimpleSingleton() {
        //just to protect
    }

    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return  instance;
    }

}
