package net.largepixels.designpatterns.singleton;

/**
 * Created by johnminchuk on 3/1/16.
 *
 * Java guarantees static members are created the first time they are accessed, this exploits that
 */
public class SimpleSingletonStatic {

    public final static SimpleSingletonStatic INSTANCE = new SimpleSingletonStatic();

    private SimpleSingletonStatic() {
        // So we can't init
    }

    public static void main(String args[]) {
        SimpleSingletonStatic singleton = SimpleSingletonStatic.INSTANCE;
        //singleton.getName();
        //singleton.setName();
    }
}
